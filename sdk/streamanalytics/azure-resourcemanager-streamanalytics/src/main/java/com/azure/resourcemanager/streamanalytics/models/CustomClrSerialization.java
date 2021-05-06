// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes how data from an input is serialized or how data is serialized when written to an output in custom format.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("CustomClr")
@JsonFlatten
@Fluent
public class CustomClrSerialization extends Serialization {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CustomClrSerialization.class);

    /*
     * The serialization library path.
     */
    @JsonProperty(value = "properties.serializationDllPath")
    private String serializationDllPath;

    /*
     * The serialization class name.
     */
    @JsonProperty(value = "properties.serializationClassName")
    private String serializationClassName;

    /**
     * Get the serializationDllPath property: The serialization library path.
     *
     * @return the serializationDllPath value.
     */
    public String serializationDllPath() {
        return this.serializationDllPath;
    }

    /**
     * Set the serializationDllPath property: The serialization library path.
     *
     * @param serializationDllPath the serializationDllPath value to set.
     * @return the CustomClrSerialization object itself.
     */
    public CustomClrSerialization withSerializationDllPath(String serializationDllPath) {
        this.serializationDllPath = serializationDllPath;
        return this;
    }

    /**
     * Get the serializationClassName property: The serialization class name.
     *
     * @return the serializationClassName value.
     */
    public String serializationClassName() {
        return this.serializationClassName;
    }

    /**
     * Set the serializationClassName property: The serialization class name.
     *
     * @param serializationClassName the serializationClassName value to set.
     * @return the CustomClrSerialization object itself.
     */
    public CustomClrSerialization withSerializationClassName(String serializationClassName) {
        this.serializationClassName = serializationClassName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
