// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Connection string for the Cosmos DB account. */
@Immutable
public final class DatabaseAccountConnectionString {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatabaseAccountConnectionString.class);

    /*
     * Value of the connection string
     */
    @JsonProperty(value = "connectionString", access = JsonProperty.Access.WRITE_ONLY)
    private String connectionString;

    /*
     * Description of the connection string
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * Get the connectionString property: Value of the connection string.
     *
     * @return the connectionString value.
     */
    public String connectionString() {
        return this.connectionString;
    }

    /**
     * Get the description property: Description of the connection string.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
