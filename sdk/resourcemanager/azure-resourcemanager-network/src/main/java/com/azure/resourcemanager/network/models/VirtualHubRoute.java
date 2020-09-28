// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** VirtualHub route. */
@Fluent
public final class VirtualHubRoute {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualHubRoute.class);

    /*
     * List of all addressPrefixes.
     */
    @JsonProperty(value = "addressPrefixes")
    private List<String> addressPrefixes;

    /*
     * NextHop ip address.
     */
    @JsonProperty(value = "nextHopIpAddress")
    private String nextHopIpAddress;

    /**
     * Get the addressPrefixes property: List of all addressPrefixes.
     *
     * @return the addressPrefixes value.
     */
    public List<String> addressPrefixes() {
        return this.addressPrefixes;
    }

    /**
     * Set the addressPrefixes property: List of all addressPrefixes.
     *
     * @param addressPrefixes the addressPrefixes value to set.
     * @return the VirtualHubRoute object itself.
     */
    public VirtualHubRoute withAddressPrefixes(List<String> addressPrefixes) {
        this.addressPrefixes = addressPrefixes;
        return this;
    }

    /**
     * Get the nextHopIpAddress property: NextHop ip address.
     *
     * @return the nextHopIpAddress value.
     */
    public String nextHopIpAddress() {
        return this.nextHopIpAddress;
    }

    /**
     * Set the nextHopIpAddress property: NextHop ip address.
     *
     * @param nextHopIpAddress the nextHopIpAddress value to set.
     * @return the VirtualHubRoute object itself.
     */
    public VirtualHubRoute withNextHopIpAddress(String nextHopIpAddress) {
        this.nextHopIpAddress = nextHopIpAddress;
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
