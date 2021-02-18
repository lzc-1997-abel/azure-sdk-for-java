/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specification for using a Virtual Network.
 */
public class VirtualNetworkProfile {
    /**
     * Resource id of the Virtual Network.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Name of the Virtual Network (read-only).
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Resource type of the Virtual Network (read-only).
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Subnet within the Virtual Network.
     */
    @JsonProperty(value = "subnet")
    private String subnet;

    /**
     * Get resource id of the Virtual Network.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource id of the Virtual Network.
     *
     * @param id the id value to set
     * @return the VirtualNetworkProfile object itself.
     */
    public VirtualNetworkProfile withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get name of the Virtual Network (read-only).
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get resource type of the Virtual Network (read-only).
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get subnet within the Virtual Network.
     *
     * @return the subnet value
     */
    public String subnet() {
        return this.subnet;
    }

    /**
     * Set subnet within the Virtual Network.
     *
     * @param subnet the subnet value to set
     * @return the VirtualNetworkProfile object itself.
     */
    public VirtualNetworkProfile withSubnet(String subnet) {
        this.subnet = subnet;
        return this;
    }

}
