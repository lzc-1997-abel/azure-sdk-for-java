// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.security.keyvault.jca;

import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import java.io.IOException;
import java.net.Socket;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/**
 * The Azure Key Vault variant of the X509TrustManager.
 */
public class KeyVaultTrustManager extends X509ExtendedTrustManager {

    /**
     * Trust manager that employs local JRE keystore.
     */
    private X509TrustManager defaultTrustManager;

    /**
     * Trust manager that employs KeyVault keystore or other 3rd party keystore.
     */
    private static X509TrustManager trustManager;

    /**
     * Stores the keystore.
     */
    private static KeyStore keyStore;

    /**
     * Constructor.
     *
     * @param keyStore the keystore.
     */
    public KeyVaultTrustManager(KeyStore keyStore) {

        if (keyStore != null) {
            if (keyStore.getType().equals(KeyVaultKeyStore.KEY_STORE_TYPE)) {
                setKeyStore(keyStore);
                addTrustManager(KeyVaultTrustManager.keyStore);
            } else {
                addKeyVaultKeystore();
                addTrustManager(keyStore);
            }
        }
        addDefaultTrustManager();

    }

    private static void setKeyStore(KeyStore keyStore) {
        KeyVaultTrustManager.keyStore = keyStore;
    }

    private static void setTrustManager(X509TrustManager trustManager) {
        KeyVaultTrustManager.trustManager = trustManager;
    }

    /**
     * add trustManager
     * @param trustManager trust manager
     */
    public KeyVaultTrustManager(TrustManager trustManager) {
        setTrustManager((X509TrustManager) trustManager);
        addKeyVaultKeystore();
        addDefaultTrustManager();

    }

    private void addKeyVaultKeystore() {
        try {
            keyStore = KeyStore.getInstance(KeyVaultKeyStore.KEY_STORE_TYPE);
            keyStore.load(null, null);
        } catch (KeyStoreException | IOException | NoSuchAlgorithmException | CertificateException ex) {
            ex.printStackTrace();
        }
    }

    private void addTrustManager(KeyStore keyStore) {
        try {
            TrustManagerFactory factory = TrustManagerFactory.getInstance("PKIX", "SunJSSE");
            factory.init(keyStore);
            trustManager = (X509TrustManager) factory.getTrustManagers()[0];
        } catch (NoSuchAlgorithmException | NoSuchProviderException | KeyStoreException ex) {
            ex.printStackTrace();
        }

    }

    private void addDefaultTrustManager() {
        try {
            TrustManagerFactory factory = TrustManagerFactory.getInstance("PKIX", "SunJSSE");
            factory.init((KeyStore) null);
            defaultTrustManager = (X509TrustManager) factory.getTrustManagers()[0];
        } catch (NoSuchAlgorithmException | NoSuchProviderException | KeyStoreException ex) {
            ex.printStackTrace();
        }

        if (defaultTrustManager == null) {
            try {
                TrustManagerFactory factory = TrustManagerFactory.getInstance("PKIX", "IbmJSSE");
                factory.init((KeyStore) null);
                defaultTrustManager = (X509TrustManager) factory.getTrustManagers()[0];
            } catch (NoSuchAlgorithmException | NoSuchProviderException | KeyStoreException ex) {
                ex.printStackTrace();
            }
        }

    }

    static void refreshTrustManagerByKeyStore() {

        try {
            TrustManagerFactory factory = TrustManagerFactory.getInstance("PKIX", "SunJSSE");
            factory.init(keyStore);
            trustManager = (X509TrustManager) factory.getTrustManagers()[0];
        } catch (KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void checkClientTrusted(X509Certificate[] chain, String authType)
        throws CertificateException {

        boolean pass = true;

        /*
         * Step 1 - see if the default trust manager passes.
         */
        try {
            defaultTrustManager.checkClientTrusted(chain, authType);
        } catch (CertificateException ce) {
            try {
                trustManager.checkClientTrusted(chain, authType);
            } catch (CertificateException ce1) {
                pass = false;
            }
        }

        /*
         * Step 2 - see if the certificate exists in the keystore.
         */
        if (!pass) {
            String alias = null;
            try {
                alias = keyStore.getCertificateAlias(chain[0]);
            } catch (KeyStoreException kse) {
                kse.printStackTrace();
            }
            if (alias == null) {
                throw new CertificateException("Unable to verify in keystore");
            }
        }
    }

    @Override
    public void checkServerTrusted(X509Certificate[] chain, String authType)
        throws CertificateException {

        boolean pass = true;

        /*
         * Step 1 - see if the default trust manager passes.
         */
        try {
            defaultTrustManager.checkServerTrusted(chain, authType);
        } catch (CertificateException ce) {
            try {
                trustManager.checkServerTrusted(chain, authType);
            } catch (CertificateException ce1) {
                pass = false;
            }
        }
        /*
         * Step 2 - see if the certificate exists in the keystore.
         */
        if (!pass) {
            String alias = null;
            try {
                alias = keyStore.getCertificateAlias(chain[0]);
            } catch (KeyStoreException kse) {
                kse.printStackTrace();
            }
            if (alias == null) {
                throw new CertificateException("Unable to verify in keystore");
            }
        }
    }

    public static KeyStore getKeyStore() throws Exception {

        KeyStore trustStore = KeyStore.getInstance("AzureKeyVault");
        KeyVaultLoadStoreParameter parameter = new KeyVaultLoadStoreParameter(
            System.getProperty("azure.keyvault.uri"),
            System.getProperty("azure.keyvault.aad-authentication-url"),
            System.getProperty("azure.keyvault.tenant-id"),
            System.getProperty("azure.keyvault.client-id"),
            System.getProperty("azure.keyvault.client-secret"));
        trustStore.load(parameter);
        return trustStore;
    }

    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }

    @Override
    public void checkClientTrusted(X509Certificate[] chain, String authType, Socket socket) throws CertificateException {
        checkClientTrusted(chain, authType);
    }

    @Override
    public void checkServerTrusted(X509Certificate[] chain, String authType, Socket socket) throws CertificateException {
        checkServerTrusted(chain, authType);
    }

    @Override
    public void checkClientTrusted(X509Certificate[] chain, String authType, SSLEngine engine) throws CertificateException {
        checkClientTrusted(chain, authType);
    }

    @Override
    public void checkServerTrusted(X509Certificate[] chain, String authType, SSLEngine engine) throws CertificateException {
        checkServerTrusted(chain, authType);
    }
}
