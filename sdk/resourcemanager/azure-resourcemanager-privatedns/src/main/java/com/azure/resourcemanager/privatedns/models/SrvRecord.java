// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.privatedns.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An SRV record. */
@Fluent
public final class SrvRecord {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SrvRecord.class);

    /*
     * The priority value for this SRV record.
     */
    @JsonProperty(value = "priority")
    private Integer priority;

    /*
     * The weight value for this SRV record.
     */
    @JsonProperty(value = "weight")
    private Integer weight;

    /*
     * The port value for this SRV record.
     */
    @JsonProperty(value = "port")
    private Integer port;

    /*
     * The target domain name for this SRV record.
     */
    @JsonProperty(value = "target")
    private String target;

    /**
     * Get the priority property: The priority value for this SRV record.
     *
     * @return the priority value.
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set the priority property: The priority value for this SRV record.
     *
     * @param priority the priority value to set.
     * @return the SrvRecord object itself.
     */
    public SrvRecord withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the weight property: The weight value for this SRV record.
     *
     * @return the weight value.
     */
    public Integer weight() {
        return this.weight;
    }

    /**
     * Set the weight property: The weight value for this SRV record.
     *
     * @param weight the weight value to set.
     * @return the SrvRecord object itself.
     */
    public SrvRecord withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Get the port property: The port value for this SRV record.
     *
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: The port value for this SRV record.
     *
     * @param port the port value to set.
     * @return the SrvRecord object itself.
     */
    public SrvRecord withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get the target property: The target domain name for this SRV record.
     *
     * @return the target value.
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the target property: The target domain name for this SRV record.
     *
     * @param target the target value to set.
     * @return the SrvRecord object itself.
     */
    public SrvRecord withTarget(String target) {
        this.target = target;
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
