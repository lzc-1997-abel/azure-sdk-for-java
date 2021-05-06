// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SKU availability model. */
@Fluent
public final class SkuAvailabilityInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SkuAvailabilityInner.class);

    /*
     * CloudSimple Availability Zone id
     */
    @JsonProperty(value = "dedicatedAvailabilityZoneId")
    private String dedicatedAvailabilityZoneId;

    /*
     * CloudSimple Availability Zone Name
     */
    @JsonProperty(value = "dedicatedAvailabilityZoneName")
    private String dedicatedAvailabilityZoneName;

    /*
     * CloudSimple Placement Group Id
     */
    @JsonProperty(value = "dedicatedPlacementGroupId")
    private String dedicatedPlacementGroupId;

    /*
     * CloudSimple Placement Group name
     */
    @JsonProperty(value = "dedicatedPlacementGroupName")
    private String dedicatedPlacementGroupName;

    /*
     * indicates how many resources of a given SKU is available in a AZ->PG
     */
    @JsonProperty(value = "limit", required = true)
    private int limit;

    /*
     * resource type e.g. DedicatedCloudNodes
     */
    @JsonProperty(value = "resourceType")
    private String resourceType;

    /*
     * sku id
     */
    @JsonProperty(value = "skuId")
    private String skuId;

    /*
     * sku name
     */
    @JsonProperty(value = "skuName")
    private String skuName;

    /**
     * Get the dedicatedAvailabilityZoneId property: CloudSimple Availability Zone id.
     *
     * @return the dedicatedAvailabilityZoneId value.
     */
    public String dedicatedAvailabilityZoneId() {
        return this.dedicatedAvailabilityZoneId;
    }

    /**
     * Set the dedicatedAvailabilityZoneId property: CloudSimple Availability Zone id.
     *
     * @param dedicatedAvailabilityZoneId the dedicatedAvailabilityZoneId value to set.
     * @return the SkuAvailabilityInner object itself.
     */
    public SkuAvailabilityInner withDedicatedAvailabilityZoneId(String dedicatedAvailabilityZoneId) {
        this.dedicatedAvailabilityZoneId = dedicatedAvailabilityZoneId;
        return this;
    }

    /**
     * Get the dedicatedAvailabilityZoneName property: CloudSimple Availability Zone Name.
     *
     * @return the dedicatedAvailabilityZoneName value.
     */
    public String dedicatedAvailabilityZoneName() {
        return this.dedicatedAvailabilityZoneName;
    }

    /**
     * Set the dedicatedAvailabilityZoneName property: CloudSimple Availability Zone Name.
     *
     * @param dedicatedAvailabilityZoneName the dedicatedAvailabilityZoneName value to set.
     * @return the SkuAvailabilityInner object itself.
     */
    public SkuAvailabilityInner withDedicatedAvailabilityZoneName(String dedicatedAvailabilityZoneName) {
        this.dedicatedAvailabilityZoneName = dedicatedAvailabilityZoneName;
        return this;
    }

    /**
     * Get the dedicatedPlacementGroupId property: CloudSimple Placement Group Id.
     *
     * @return the dedicatedPlacementGroupId value.
     */
    public String dedicatedPlacementGroupId() {
        return this.dedicatedPlacementGroupId;
    }

    /**
     * Set the dedicatedPlacementGroupId property: CloudSimple Placement Group Id.
     *
     * @param dedicatedPlacementGroupId the dedicatedPlacementGroupId value to set.
     * @return the SkuAvailabilityInner object itself.
     */
    public SkuAvailabilityInner withDedicatedPlacementGroupId(String dedicatedPlacementGroupId) {
        this.dedicatedPlacementGroupId = dedicatedPlacementGroupId;
        return this;
    }

    /**
     * Get the dedicatedPlacementGroupName property: CloudSimple Placement Group name.
     *
     * @return the dedicatedPlacementGroupName value.
     */
    public String dedicatedPlacementGroupName() {
        return this.dedicatedPlacementGroupName;
    }

    /**
     * Set the dedicatedPlacementGroupName property: CloudSimple Placement Group name.
     *
     * @param dedicatedPlacementGroupName the dedicatedPlacementGroupName value to set.
     * @return the SkuAvailabilityInner object itself.
     */
    public SkuAvailabilityInner withDedicatedPlacementGroupName(String dedicatedPlacementGroupName) {
        this.dedicatedPlacementGroupName = dedicatedPlacementGroupName;
        return this;
    }

    /**
     * Get the limit property: indicates how many resources of a given SKU is available in a AZ-&gt;PG.
     *
     * @return the limit value.
     */
    public int limit() {
        return this.limit;
    }

    /**
     * Set the limit property: indicates how many resources of a given SKU is available in a AZ-&gt;PG.
     *
     * @param limit the limit value to set.
     * @return the SkuAvailabilityInner object itself.
     */
    public SkuAvailabilityInner withLimit(int limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get the resourceType property: resource type e.g. DedicatedCloudNodes.
     *
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: resource type e.g. DedicatedCloudNodes.
     *
     * @param resourceType the resourceType value to set.
     * @return the SkuAvailabilityInner object itself.
     */
    public SkuAvailabilityInner withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the skuId property: sku id.
     *
     * @return the skuId value.
     */
    public String skuId() {
        return this.skuId;
    }

    /**
     * Set the skuId property: sku id.
     *
     * @param skuId the skuId value to set.
     * @return the SkuAvailabilityInner object itself.
     */
    public SkuAvailabilityInner withSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }

    /**
     * Get the skuName property: sku name.
     *
     * @return the skuName value.
     */
    public String skuName() {
        return this.skuName;
    }

    /**
     * Set the skuName property: sku name.
     *
     * @param skuName the skuName value to set.
     * @return the SkuAvailabilityInner object itself.
     */
    public SkuAvailabilityInner withSkuName(String skuName) {
        this.skuName = skuName;
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
