// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The disk billing meters. */
@Fluent
public final class DiskBillingMeters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DiskBillingMeters.class);

    /*
     * The managed disk meter guid.
     */
    @JsonProperty(value = "diskRpMeter")
    private String diskRpMeter;

    /*
     * The managed disk billing sku, P30 or S30.
     */
    @JsonProperty(value = "sku")
    private String sku;

    /*
     * The managed disk billing tier, Standard or Premium.
     */
    @JsonProperty(value = "tier")
    private Tier tier;

    /**
     * Get the diskRpMeter property: The managed disk meter guid.
     *
     * @return the diskRpMeter value.
     */
    public String diskRpMeter() {
        return this.diskRpMeter;
    }

    /**
     * Set the diskRpMeter property: The managed disk meter guid.
     *
     * @param diskRpMeter the diskRpMeter value to set.
     * @return the DiskBillingMeters object itself.
     */
    public DiskBillingMeters withDiskRpMeter(String diskRpMeter) {
        this.diskRpMeter = diskRpMeter;
        return this;
    }

    /**
     * Get the sku property: The managed disk billing sku, P30 or S30.
     *
     * @return the sku value.
     */
    public String sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The managed disk billing sku, P30 or S30.
     *
     * @param sku the sku value to set.
     * @return the DiskBillingMeters object itself.
     */
    public DiskBillingMeters withSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the tier property: The managed disk billing tier, Standard or Premium.
     *
     * @return the tier value.
     */
    public Tier tier() {
        return this.tier;
    }

    /**
     * Set the tier property: The managed disk billing tier, Standard or Premium.
     *
     * @param tier the tier value to set.
     * @return the DiskBillingMeters object itself.
     */
    public DiskBillingMeters withTier(Tier tier) {
        this.tier = tier;
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
