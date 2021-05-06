// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AccessPolicyUpdateParameters model. */
@JsonFlatten
@Fluent
public class AccessPolicyUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AccessPolicyUpdateParameters.class);

    /*
     * An description of the access policy.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * The list of roles the principal is assigned on the environment.
     */
    @JsonProperty(value = "properties.roles")
    private List<AccessPolicyRole> roles;

    /**
     * Get the description property: An description of the access policy.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: An description of the access policy.
     *
     * @param description the description value to set.
     * @return the AccessPolicyUpdateParameters object itself.
     */
    public AccessPolicyUpdateParameters withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the roles property: The list of roles the principal is assigned on the environment.
     *
     * @return the roles value.
     */
    public List<AccessPolicyRole> roles() {
        return this.roles;
    }

    /**
     * Set the roles property: The list of roles the principal is assigned on the environment.
     *
     * @param roles the roles value to set.
     * @return the AccessPolicyUpdateParameters object itself.
     */
    public AccessPolicyUpdateParameters withRoles(List<AccessPolicyRole> roles) {
        this.roles = roles;
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
