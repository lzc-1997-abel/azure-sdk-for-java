// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batchai.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Name-value pair. */
@Fluent
public final class NameValuePair {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NameValuePair.class);

    /*
     * The name in the name-value pair.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The value in the name-value pair.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the name property: The name in the name-value pair.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name in the name-value pair.
     *
     * @param name the name value to set.
     * @return the NameValuePair object itself.
     */
    public NameValuePair withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: The value in the name-value pair.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The value in the name-value pair.
     *
     * @param value the value value to set.
     * @return the NameValuePair object itself.
     */
    public NameValuePair withValue(String value) {
        this.value = value;
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
