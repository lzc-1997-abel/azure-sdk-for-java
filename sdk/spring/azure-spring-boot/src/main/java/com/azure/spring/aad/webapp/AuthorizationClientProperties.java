// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.aad.webapp;

import com.azure.spring.aad.AADAuthorizationGrantType;

import java.util.List;

/**
 * Properties for an oauth2 client.
 */
public class AuthorizationClientProperties {

    private List<String> scopes;

    private boolean onDemand = false;

    private String authorizationGrantType;

    public String getAuthorizationGrantType() {
        return authorizationGrantType;
    }

    public void setAuthorizationGrantType(String authorizationGrantType) {
        this.authorizationGrantType = authorizationGrantType;
    }

    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }

    public List<String> getScopes() {
        return scopes;
    }

    public boolean isOnDemand() {
        return onDemand;
    }

    public boolean isClientCredential(){
        return AADAuthorizationGrantType.CLIENT_CREDENTIALS.getValue().equals(authorizationGrantType);
    }

    public void setOnDemand(boolean onDemand) {
        this.onDemand = onDemand;
    }
}
