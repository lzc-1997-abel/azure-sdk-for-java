// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.vmwarecloudsimple.models.GuestOsnicCustomization;
import com.azure.resourcemanager.vmwarecloudsimple.models.NicType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Virtual NIC model. */
@Fluent
public final class VirtualNicInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualNicInner.class);

    /*
     * guest OS customization for nic
     */
    @JsonProperty(value = "customization")
    private GuestOsnicCustomization customization;

    /*
     * NIC ip address
     */
    @JsonProperty(value = "ipAddresses")
    private List<String> ipAddresses;

    /*
     * NIC MAC address
     */
    @JsonProperty(value = "macAddress")
    private String macAddress;

    /*
     * Virtual Network
     */
    @JsonProperty(value = "network", required = true)
    private VirtualNetworkInner network;

    /*
     * NIC type
     */
    @JsonProperty(value = "nicType", required = true)
    private NicType nicType;

    /*
     * Is NIC powered on/off on boot
     */
    @JsonProperty(value = "powerOnBoot")
    private Boolean powerOnBoot;

    /*
     * NIC id
     */
    @JsonProperty(value = "virtualNicId")
    private String virtualNicId;

    /*
     * NIC name
     */
    @JsonProperty(value = "virtualNicName", access = JsonProperty.Access.WRITE_ONLY)
    private String virtualNicName;

    /**
     * Get the customization property: guest OS customization for nic.
     *
     * @return the customization value.
     */
    public GuestOsnicCustomization customization() {
        return this.customization;
    }

    /**
     * Set the customization property: guest OS customization for nic.
     *
     * @param customization the customization value to set.
     * @return the VirtualNicInner object itself.
     */
    public VirtualNicInner withCustomization(GuestOsnicCustomization customization) {
        this.customization = customization;
        return this;
    }

    /**
     * Get the ipAddresses property: NIC ip address.
     *
     * @return the ipAddresses value.
     */
    public List<String> ipAddresses() {
        return this.ipAddresses;
    }

    /**
     * Set the ipAddresses property: NIC ip address.
     *
     * @param ipAddresses the ipAddresses value to set.
     * @return the VirtualNicInner object itself.
     */
    public VirtualNicInner withIpAddresses(List<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
        return this;
    }

    /**
     * Get the macAddress property: NIC MAC address.
     *
     * @return the macAddress value.
     */
    public String macAddress() {
        return this.macAddress;
    }

    /**
     * Set the macAddress property: NIC MAC address.
     *
     * @param macAddress the macAddress value to set.
     * @return the VirtualNicInner object itself.
     */
    public VirtualNicInner withMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    /**
     * Get the network property: Virtual Network.
     *
     * @return the network value.
     */
    public VirtualNetworkInner network() {
        return this.network;
    }

    /**
     * Set the network property: Virtual Network.
     *
     * @param network the network value to set.
     * @return the VirtualNicInner object itself.
     */
    public VirtualNicInner withNetwork(VirtualNetworkInner network) {
        this.network = network;
        return this;
    }

    /**
     * Get the nicType property: NIC type.
     *
     * @return the nicType value.
     */
    public NicType nicType() {
        return this.nicType;
    }

    /**
     * Set the nicType property: NIC type.
     *
     * @param nicType the nicType value to set.
     * @return the VirtualNicInner object itself.
     */
    public VirtualNicInner withNicType(NicType nicType) {
        this.nicType = nicType;
        return this;
    }

    /**
     * Get the powerOnBoot property: Is NIC powered on/off on boot.
     *
     * @return the powerOnBoot value.
     */
    public Boolean powerOnBoot() {
        return this.powerOnBoot;
    }

    /**
     * Set the powerOnBoot property: Is NIC powered on/off on boot.
     *
     * @param powerOnBoot the powerOnBoot value to set.
     * @return the VirtualNicInner object itself.
     */
    public VirtualNicInner withPowerOnBoot(Boolean powerOnBoot) {
        this.powerOnBoot = powerOnBoot;
        return this;
    }

    /**
     * Get the virtualNicId property: NIC id.
     *
     * @return the virtualNicId value.
     */
    public String virtualNicId() {
        return this.virtualNicId;
    }

    /**
     * Set the virtualNicId property: NIC id.
     *
     * @param virtualNicId the virtualNicId value to set.
     * @return the VirtualNicInner object itself.
     */
    public VirtualNicInner withVirtualNicId(String virtualNicId) {
        this.virtualNicId = virtualNicId;
        return this;
    }

    /**
     * Get the virtualNicName property: NIC name.
     *
     * @return the virtualNicName value.
     */
    public String virtualNicName() {
        return this.virtualNicName;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (customization() != null) {
            customization().validate();
        }
        if (network() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property network in model VirtualNicInner"));
        } else {
            network().validate();
        }
        if (nicType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property nicType in model VirtualNicInner"));
        }
    }
}
