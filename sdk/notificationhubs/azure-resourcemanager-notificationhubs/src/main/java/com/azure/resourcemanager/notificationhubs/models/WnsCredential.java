// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Description of a NotificationHub WnsCredential. */
@JsonFlatten
@Fluent
public class WnsCredential {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WnsCredential.class);

    /*
     * The package ID for this credential.
     */
    @JsonProperty(value = "properties.packageSid")
    private String packageSid;

    /*
     * The secret key.
     */
    @JsonProperty(value = "properties.secretKey")
    private String secretKey;

    /*
     * The Windows Live endpoint.
     */
    @JsonProperty(value = "properties.windowsLiveEndpoint")
    private String windowsLiveEndpoint;

    /**
     * Get the packageSid property: The package ID for this credential.
     *
     * @return the packageSid value.
     */
    public String packageSid() {
        return this.packageSid;
    }

    /**
     * Set the packageSid property: The package ID for this credential.
     *
     * @param packageSid the packageSid value to set.
     * @return the WnsCredential object itself.
     */
    public WnsCredential withPackageSid(String packageSid) {
        this.packageSid = packageSid;
        return this;
    }

    /**
     * Get the secretKey property: The secret key.
     *
     * @return the secretKey value.
     */
    public String secretKey() {
        return this.secretKey;
    }

    /**
     * Set the secretKey property: The secret key.
     *
     * @param secretKey the secretKey value to set.
     * @return the WnsCredential object itself.
     */
    public WnsCredential withSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    /**
     * Get the windowsLiveEndpoint property: The Windows Live endpoint.
     *
     * @return the windowsLiveEndpoint value.
     */
    public String windowsLiveEndpoint() {
        return this.windowsLiveEndpoint;
    }

    /**
     * Set the windowsLiveEndpoint property: The Windows Live endpoint.
     *
     * @param windowsLiveEndpoint the windowsLiveEndpoint value to set.
     * @return the WnsCredential object itself.
     */
    public WnsCredential withWindowsLiveEndpoint(String windowsLiveEndpoint) {
        this.windowsLiveEndpoint = windowsLiveEndpoint;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
