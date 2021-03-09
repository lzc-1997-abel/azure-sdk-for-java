// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.security.keyvault.keys.cryptography;

import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.security.keyvault.keys.cryptography.models.DecryptResult;
import com.azure.security.keyvault.keys.cryptography.models.EncryptionAlgorithm;
import com.azure.security.keyvault.keys.cryptography.models.EncryptResult;
import com.azure.security.keyvault.keys.cryptography.models.UnwrapResult;
import com.azure.security.keyvault.keys.cryptography.models.WrapResult;
import com.azure.security.keyvault.keys.cryptography.models.KeyWrapAlgorithm;
import com.azure.security.keyvault.keys.cryptography.models.SignatureAlgorithm;
import com.azure.security.keyvault.keys.cryptography.models.SignResult;
import com.azure.security.keyvault.keys.cryptography.models.VerifyResult;
import com.azure.security.keyvault.keys.models.JsonWebKey;
import reactor.core.publisher.Mono;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Objects;

class SymmetricKeyCryptographyClient extends LocalKeyCryptographyClient {
    static final int AES_BLOCK_SIZE = 16;

    private final ClientLogger logger = new ClientLogger(SymmetricKeyCryptographyClient.class);

    private byte[] key;

    /**
     * Creates a {@link SymmetricKeyCryptographyClient} to perform local cryptography operations.
     *
     * @param serviceClient The client to route the requests through.
     */
    SymmetricKeyCryptographyClient(CryptographyServiceClient serviceClient) {
        super(serviceClient);
    }

    SymmetricKeyCryptographyClient(JsonWebKey key, CryptographyServiceClient serviceClient) {
        super(serviceClient);
        this.key = key.toAes().getEncoded();
    }

    private byte[] getKey(JsonWebKey key) {
        if (this.key == null) {
            this.key = key.toAes().getEncoded();
        }
        return this.key;
    }

    @Override
    Mono<EncryptResult> encryptAsync(EncryptOptions encryptOptions, Context context, JsonWebKey jsonWebKey) {
        this.key = getKey(jsonWebKey);

        if (key == null || key.length == 0) {
            throw logger.logExceptionAsError(new IllegalArgumentException("Key is empty."));
        }

        // Interpret the algorithm
        EncryptionAlgorithm algorithm = encryptOptions.getAlgorithm();
        Algorithm baseAlgorithm = AlgorithmResolver.DEFAULT.get(algorithm.toString());

        if (!(baseAlgorithm instanceof SymmetricEncryptionAlgorithm)) {
            return Mono.error(new NoSuchAlgorithmException(algorithm.toString()));
        }

        SymmetricEncryptionAlgorithm symmetricEncryptionAlgorithm = (SymmetricEncryptionAlgorithm) baseAlgorithm;

        ICryptoTransform transform;

        byte[] iv = encryptOptions.getIv();
        byte[] additionalAuthenticatedData = encryptOptions.getAdditionalAuthenticatedData();

        if (iv == null) {
            if (isAes(algorithm)) {
                iv = generateRandomByteArray(AES_BLOCK_SIZE);
            } else {
                throw logger.logExceptionAsError(
                    new IllegalStateException("Encryption algorithm provided is not supported: " + algorithm));
            }
        }

        try {
            transform = symmetricEncryptionAlgorithm.createEncryptor(this.key, iv, additionalAuthenticatedData,
                null);
        } catch (Exception e) {
            return Mono.error(e);
        }

        byte[] encrypted;

        try {
            encrypted = transform.doFinal(encryptOptions.getPlainText());
        } catch (Exception e) {
            return Mono.error(e);
        }

        byte[] cipherText;

        if (isAes(algorithm)) {
            cipherText = encrypted;
        } else {
            throw logger.logExceptionAsError(
                new IllegalStateException("Encryption algorithm provided is not supported: " + algorithm));
        }

        return Mono.just(new EncryptResult(cipherText, algorithm, jsonWebKey.getId(), iv, additionalAuthenticatedData,
            null));
    }

    @Override
    Mono<DecryptResult> decryptAsync(DecryptOptions decryptOptions, Context context, JsonWebKey jsonWebKey) {
        this.key = getKey(jsonWebKey);

        if (key == null || key.length == 0) {
            throw logger.logExceptionAsError(new IllegalArgumentException("Key is empty."));
        }

        // Interpret the algorithm
        EncryptionAlgorithm algorithm = decryptOptions.getAlgorithm();
        Algorithm baseAlgorithm = AlgorithmResolver.DEFAULT.get(algorithm.toString());

        if (!(baseAlgorithm instanceof SymmetricEncryptionAlgorithm)) {
            return Mono.error(new NoSuchAlgorithmException(algorithm.toString()));
        }

        SymmetricEncryptionAlgorithm symmetricEncryptionAlgorithm = (SymmetricEncryptionAlgorithm) baseAlgorithm;

        ICryptoTransform transform;

        byte[] iv = Objects.requireNonNull(decryptOptions.getIv(), "Initialization vector cannot be null in local decryption operations.");
        byte[] additionalAuthenticatedData = decryptOptions.getAdditionalAuthenticatedData();
        byte[] authenticationTag = decryptOptions.getAuthenticationTag();

        try {
            transform = symmetricEncryptionAlgorithm.createDecryptor(this.key, iv, additionalAuthenticatedData, authenticationTag);
        } catch (Exception e) {
            return Mono.error(e);
        }

        byte[] decrypted;
        byte[] cipherText;

        if (isAes(algorithm)) {
            cipherText = decryptOptions.getCipherText();
        } else {
            throw logger.logExceptionAsError(
                new IllegalStateException("Encryption algorithm provided is not supported: " + algorithm));
        }

        try {
            decrypted = transform.doFinal(cipherText);
        } catch (Exception e) {
            return Mono.error(e);
        }

        return Mono.just(new DecryptResult(decrypted, algorithm, jsonWebKey.getId()));
    }

    @Override
    Mono<SignResult> signAsync(SignatureAlgorithm algorithm, byte[] digest, Context context, JsonWebKey key) {
        return Mono.error(new UnsupportedOperationException("Sign operation not supported for OCT/Symmetric key"));
    }

    @Override
    Mono<VerifyResult> verifyAsync(SignatureAlgorithm algorithm, byte[] digest, byte[] signature, Context context,
                                   JsonWebKey key) {
        return Mono.error(new UnsupportedOperationException("Verify operation not supported for OCT/Symmetric key"));
    }

    @Override
    Mono<WrapResult> wrapKeyAsync(KeyWrapAlgorithm algorithm, byte[] key, Context context, JsonWebKey jsonWebKey) {
        this.key = getKey(jsonWebKey);

        if (key == null || key.length == 0) {
            throw logger.logExceptionAsError(new IllegalArgumentException("key"));
        }

        // Interpret the algorithm
        Algorithm baseAlgorithm = AlgorithmResolver.DEFAULT.get(algorithm.toString());

        if (!(baseAlgorithm instanceof LocalKeyWrapAlgorithm)) {
            return Mono.error(new NoSuchAlgorithmException(algorithm.toString()));
        }

        LocalKeyWrapAlgorithm localKeyWrapAlgorithm = (LocalKeyWrapAlgorithm) baseAlgorithm;

        ICryptoTransform transform;

        try {
            transform = localKeyWrapAlgorithm.createEncryptor(this.key, null, null);
        } catch (Exception e) {
            return Mono.error(e);
        }

        byte[] encrypted;

        try {
            encrypted = transform.doFinal(key);
        } catch (Exception e) {
            return Mono.error(e);
        }

        return Mono.just(new WrapResult(encrypted, algorithm, jsonWebKey.getId()));
    }

    @Override
    Mono<UnwrapResult> unwrapKeyAsync(KeyWrapAlgorithm algorithm, byte[] encryptedKey, Context context, JsonWebKey jsonWebKey) {
        this.key = getKey(jsonWebKey);

        Algorithm baseAlgorithm = AlgorithmResolver.DEFAULT.get(algorithm.toString());

        if (!(baseAlgorithm instanceof LocalKeyWrapAlgorithm)) {
            return Mono.error(new NoSuchAlgorithmException(algorithm.toString()));
        }

        LocalKeyWrapAlgorithm localKeyWrapAlgorithm = (LocalKeyWrapAlgorithm) baseAlgorithm;

        ICryptoTransform transform;

        try {
            transform = localKeyWrapAlgorithm.createDecryptor(this.key, null, null);
        } catch (Exception e) {
            return Mono.error(e);
        }

        byte[] decrypted;

        try {
            decrypted = transform.doFinal(encryptedKey);
        } catch (Exception e) {
            return Mono.error(e);
        }

        return Mono.just(new UnwrapResult(decrypted, algorithm, jsonWebKey.getId()));
    }

    @Override
    Mono<SignResult> signDataAsync(SignatureAlgorithm algorithm, byte[] data, Context context, JsonWebKey key) {
        return signAsync(algorithm, data, context, key);
    }

    @Override
    Mono<VerifyResult> verifyDataAsync(SignatureAlgorithm algorithm, byte[] data, byte[] signature, Context context,
                                       JsonWebKey key) {
        return verifyAsync(algorithm, data, signature, context, key);
    }

    private byte[] generateRandomByteArray(int sizeInBytes) {
        byte[] iv = new byte[0];
        SecureRandom randomSecureRandom;

        try {
            randomSecureRandom = SecureRandom.getInstance("SHA1PRNG");
            iv = new byte[sizeInBytes];
            randomSecureRandom.nextBytes(iv);
        } catch (NoSuchAlgorithmException e) {
            logger.logThrowableAsError(e);
        }

        return iv;
    }

    private boolean isAes(EncryptionAlgorithm encryptionAlgorithm) {
        return (encryptionAlgorithm == EncryptionAlgorithm.A128CBC
            || encryptionAlgorithm == EncryptionAlgorithm.A192CBC
            || encryptionAlgorithm == EncryptionAlgorithm.A256CBC
            || encryptionAlgorithm == EncryptionAlgorithm.A128CBCPAD
            || encryptionAlgorithm == EncryptionAlgorithm.A192CBCPAD
            || encryptionAlgorithm == EncryptionAlgorithm.A256CBCPAD);
    }
}
