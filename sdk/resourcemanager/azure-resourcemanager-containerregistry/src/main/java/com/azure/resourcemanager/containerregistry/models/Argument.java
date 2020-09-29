// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of a run argument. */
@Fluent
public final class Argument {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Argument.class);

    /*
     * The name of the argument.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The value of the argument.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /*
     * Flag to indicate whether the argument represents a secret and want to be
     * removed from build logs.
     */
    @JsonProperty(value = "isSecret")
    private Boolean isSecret;

    /**
     * Get the name property: The name of the argument.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the argument.
     *
     * @param name the name value to set.
     * @return the Argument object itself.
     */
    public Argument withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: The value of the argument.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The value of the argument.
     *
     * @param value the value value to set.
     * @return the Argument object itself.
     */
    public Argument withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the isSecret property: Flag to indicate whether the argument represents a secret and want to be removed from
     * build logs.
     *
     * @return the isSecret value.
     */
    public Boolean isSecret() {
        return this.isSecret;
    }

    /**
     * Set the isSecret property: Flag to indicate whether the argument represents a secret and want to be removed from
     * build logs.
     *
     * @param isSecret the isSecret value to set.
     * @return the Argument object itself.
     */
    public Argument withIsSecret(Boolean isSecret) {
        this.isSecret = isSecret;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(new IllegalArgumentException("Missing required property name in model Argument"));
        }
        if (value() == null) {
            throw logger
                .logExceptionAsError(new IllegalArgumentException("Missing required property value in model Argument"));
        }
    }
}
