// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Open authentication access policy defined by user. */
@Fluent
public final class OpenAuthenticationAccessPolicy {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OpenAuthenticationAccessPolicy.class);

    /*
     * Type of provider for OAuth.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private OpenAuthenticationProviderType type;

    /*
     * The access policy claims.
     */
    @JsonProperty(value = "claims")
    private List<OpenAuthenticationPolicyClaim> claims;

    /**
     * Get the type property: Type of provider for OAuth.
     *
     * @return the type value.
     */
    public OpenAuthenticationProviderType type() {
        return this.type;
    }

    /**
     * Get the claims property: The access policy claims.
     *
     * @return the claims value.
     */
    public List<OpenAuthenticationPolicyClaim> claims() {
        return this.claims;
    }

    /**
     * Set the claims property: The access policy claims.
     *
     * @param claims the claims value to set.
     * @return the OpenAuthenticationAccessPolicy object itself.
     */
    public OpenAuthenticationAccessPolicy withClaims(List<OpenAuthenticationPolicyClaim> claims) {
        this.claims = claims;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (claims() != null) {
            claims().forEach(e -> e.validate());
        }
    }
}
