// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Supported deployment runtime version descriptor. */
@Fluent
public final class SupportedRuntimeVersion {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SupportedRuntimeVersion.class);

    /*
     * The raw value which could be passed to deployment CRUD operations.
     */
    @JsonProperty(value = "value")
    private SupportedRuntimeValue value;

    /*
     * The platform of this runtime version (possible values: "Java" or
     * ".NET").
     */
    @JsonProperty(value = "platform")
    private SupportedRuntimePlatform platform;

    /*
     * The detailed version (major.minor) of the platform.
     */
    @JsonProperty(value = "version")
    private String version;

    /**
     * Get the value property: The raw value which could be passed to deployment CRUD operations.
     *
     * @return the value value.
     */
    public SupportedRuntimeValue value() {
        return this.value;
    }

    /**
     * Set the value property: The raw value which could be passed to deployment CRUD operations.
     *
     * @param value the value value to set.
     * @return the SupportedRuntimeVersion object itself.
     */
    public SupportedRuntimeVersion withValue(SupportedRuntimeValue value) {
        this.value = value;
        return this;
    }

    /**
     * Get the platform property: The platform of this runtime version (possible values: "Java" or ".NET").
     *
     * @return the platform value.
     */
    public SupportedRuntimePlatform platform() {
        return this.platform;
    }

    /**
     * Set the platform property: The platform of this runtime version (possible values: "Java" or ".NET").
     *
     * @param platform the platform value to set.
     * @return the SupportedRuntimeVersion object itself.
     */
    public SupportedRuntimeVersion withPlatform(SupportedRuntimePlatform platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Get the version property: The detailed version (major.minor) of the platform.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: The detailed version (major.minor) of the platform.
     *
     * @param version the version value to set.
     * @return the SupportedRuntimeVersion object itself.
     */
    public SupportedRuntimeVersion withVersion(String version) {
        this.version = version;
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
