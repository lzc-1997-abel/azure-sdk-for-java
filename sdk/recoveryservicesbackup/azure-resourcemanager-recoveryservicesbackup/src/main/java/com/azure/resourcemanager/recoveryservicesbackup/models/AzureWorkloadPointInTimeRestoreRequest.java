// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.Map;

/** AzureWorkload SAP Hana -specific restore. Specifically for PointInTime/Log restore. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("AzureWorkloadPointInTimeRestoreRequest")
@Fluent
public final class AzureWorkloadPointInTimeRestoreRequest extends AzureWorkloadRestoreRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureWorkloadPointInTimeRestoreRequest.class);

    /*
     * PointInTime value
     */
    @JsonProperty(value = "pointInTime")
    private OffsetDateTime pointInTime;

    /**
     * Get the pointInTime property: PointInTime value.
     *
     * @return the pointInTime value.
     */
    public OffsetDateTime pointInTime() {
        return this.pointInTime;
    }

    /**
     * Set the pointInTime property: PointInTime value.
     *
     * @param pointInTime the pointInTime value to set.
     * @return the AzureWorkloadPointInTimeRestoreRequest object itself.
     */
    public AzureWorkloadPointInTimeRestoreRequest withPointInTime(OffsetDateTime pointInTime) {
        this.pointInTime = pointInTime;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadPointInTimeRestoreRequest withRecoveryType(RecoveryType recoveryType) {
        super.withRecoveryType(recoveryType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadPointInTimeRestoreRequest withSourceResourceId(String sourceResourceId) {
        super.withSourceResourceId(sourceResourceId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadPointInTimeRestoreRequest withPropertyBag(Map<String, String> propertyBag) {
        super.withPropertyBag(propertyBag);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadPointInTimeRestoreRequest withTargetInfo(TargetRestoreInfo targetInfo) {
        super.withTargetInfo(targetInfo);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadPointInTimeRestoreRequest withRecoveryMode(RecoveryMode recoveryMode) {
        super.withRecoveryMode(recoveryMode);
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
