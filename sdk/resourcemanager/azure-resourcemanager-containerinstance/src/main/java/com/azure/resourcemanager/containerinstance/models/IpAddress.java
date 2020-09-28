// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** IP address for the container group. */
@Fluent
public final class IpAddress {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IpAddress.class);

    /*
     * The list of ports exposed on the container group.
     */
    @JsonProperty(value = "ports", required = true)
    private List<Port> ports;

    /*
     * Specifies if the IP is exposed to the public internet or private VNET.
     */
    @JsonProperty(value = "type", required = true)
    private ContainerGroupIpAddressType type;

    /*
     * The IP exposed to the public internet.
     */
    @JsonProperty(value = "ip")
    private String ip;

    /*
     * The Dns name label for the IP.
     */
    @JsonProperty(value = "dnsNameLabel")
    private String dnsNameLabel;

    /*
     * The FQDN for the IP.
     */
    @JsonProperty(value = "fqdn", access = JsonProperty.Access.WRITE_ONLY)
    private String fqdn;

    /**
     * Get the ports property: The list of ports exposed on the container group.
     *
     * @return the ports value.
     */
    public List<Port> ports() {
        return this.ports;
    }

    /**
     * Set the ports property: The list of ports exposed on the container group.
     *
     * @param ports the ports value to set.
     * @return the IpAddress object itself.
     */
    public IpAddress withPorts(List<Port> ports) {
        this.ports = ports;
        return this;
    }

    /**
     * Get the type property: Specifies if the IP is exposed to the public internet or private VNET.
     *
     * @return the type value.
     */
    public ContainerGroupIpAddressType type() {
        return this.type;
    }

    /**
     * Set the type property: Specifies if the IP is exposed to the public internet or private VNET.
     *
     * @param type the type value to set.
     * @return the IpAddress object itself.
     */
    public IpAddress withType(ContainerGroupIpAddressType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the ip property: The IP exposed to the public internet.
     *
     * @return the ip value.
     */
    public String ip() {
        return this.ip;
    }

    /**
     * Set the ip property: The IP exposed to the public internet.
     *
     * @param ip the ip value to set.
     * @return the IpAddress object itself.
     */
    public IpAddress withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * Get the dnsNameLabel property: The Dns name label for the IP.
     *
     * @return the dnsNameLabel value.
     */
    public String dnsNameLabel() {
        return this.dnsNameLabel;
    }

    /**
     * Set the dnsNameLabel property: The Dns name label for the IP.
     *
     * @param dnsNameLabel the dnsNameLabel value to set.
     * @return the IpAddress object itself.
     */
    public IpAddress withDnsNameLabel(String dnsNameLabel) {
        this.dnsNameLabel = dnsNameLabel;
        return this;
    }

    /**
     * Get the fqdn property: The FQDN for the IP.
     *
     * @return the fqdn value.
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ports() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property ports in model IpAddress"));
        } else {
            ports().forEach(e -> e.validate());
        }
        if (type() == null) {
            throw logger
                .logExceptionAsError(new IllegalArgumentException("Missing required property type in model IpAddress"));
        }
    }
}
