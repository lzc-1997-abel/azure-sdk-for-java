// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.resourcehealth.models.AvailabilityStatusProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** availabilityStatus of a resource. */
@Fluent
public final class AvailabilityStatusInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AvailabilityStatusInner.class);

    /*
     * Azure Resource Manager Identity for the availabilityStatuses resource.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * current.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Microsoft.ResourceHealth/AvailabilityStatuses.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Azure Resource Manager geo location of the resource.
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Properties of availability state.
     */
    @JsonProperty(value = "properties")
    private AvailabilityStatusProperties properties;

    /**
     * Get the id property: Azure Resource Manager Identity for the availabilityStatuses resource.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Azure Resource Manager Identity for the availabilityStatuses resource.
     *
     * @param id the id value to set.
     * @return the AvailabilityStatusInner object itself.
     */
    public AvailabilityStatusInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: current.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: current.
     *
     * @param name the name value to set.
     * @return the AvailabilityStatusInner object itself.
     */
    public AvailabilityStatusInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Microsoft.ResourceHealth/AvailabilityStatuses.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Microsoft.ResourceHealth/AvailabilityStatuses.
     *
     * @param type the type value to set.
     * @return the AvailabilityStatusInner object itself.
     */
    public AvailabilityStatusInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the location property: Azure Resource Manager geo location of the resource.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Azure Resource Manager geo location of the resource.
     *
     * @param location the location value to set.
     * @return the AvailabilityStatusInner object itself.
     */
    public AvailabilityStatusInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the properties property: Properties of availability state.
     *
     * @return the properties value.
     */
    public AvailabilityStatusProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of availability state.
     *
     * @param properties the properties value to set.
     * @return the AvailabilityStatusInner object itself.
     */
    public AvailabilityStatusInner withProperties(AvailabilityStatusProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
