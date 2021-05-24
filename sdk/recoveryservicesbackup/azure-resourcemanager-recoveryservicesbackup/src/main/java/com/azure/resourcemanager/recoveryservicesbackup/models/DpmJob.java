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
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.List;

/** DPM workload-specific job object. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "jobType")
@JsonTypeName("DpmJob")
@Fluent
public final class DpmJob extends Job {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DpmJob.class);

    /*
     * Time elapsed for job.
     */
    @JsonProperty(value = "duration")
    private Duration duration;

    /*
     * DPM server name managing the backup item or backup job.
     */
    @JsonProperty(value = "dpmServerName")
    private String dpmServerName;

    /*
     * Name of cluster/server protecting current backup item, if any.
     */
    @JsonProperty(value = "containerName")
    private String containerName;

    /*
     * Type of container.
     */
    @JsonProperty(value = "containerType")
    private String containerType;

    /*
     * Type of backup item.
     */
    @JsonProperty(value = "workloadType")
    private String workloadType;

    /*
     * The state/actions applicable on this job like cancel/retry.
     */
    @JsonProperty(value = "actionsInfo")
    private List<JobSupportedAction> actionsInfo;

    /*
     * The errors.
     */
    @JsonProperty(value = "errorDetails")
    private List<DpmErrorInfo> errorDetails;

    /*
     * Additional information for this job.
     */
    @JsonProperty(value = "extendedInfo")
    private DpmJobExtendedInfo extendedInfo;

    /**
     * Get the duration property: Time elapsed for job.
     *
     * @return the duration value.
     */
    public Duration duration() {
        return this.duration;
    }

    /**
     * Set the duration property: Time elapsed for job.
     *
     * @param duration the duration value to set.
     * @return the DpmJob object itself.
     */
    public DpmJob withDuration(Duration duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Get the dpmServerName property: DPM server name managing the backup item or backup job.
     *
     * @return the dpmServerName value.
     */
    public String dpmServerName() {
        return this.dpmServerName;
    }

    /**
     * Set the dpmServerName property: DPM server name managing the backup item or backup job.
     *
     * @param dpmServerName the dpmServerName value to set.
     * @return the DpmJob object itself.
     */
    public DpmJob withDpmServerName(String dpmServerName) {
        this.dpmServerName = dpmServerName;
        return this;
    }

    /**
     * Get the containerName property: Name of cluster/server protecting current backup item, if any.
     *
     * @return the containerName value.
     */
    public String containerName() {
        return this.containerName;
    }

    /**
     * Set the containerName property: Name of cluster/server protecting current backup item, if any.
     *
     * @param containerName the containerName value to set.
     * @return the DpmJob object itself.
     */
    public DpmJob withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * Get the containerType property: Type of container.
     *
     * @return the containerType value.
     */
    public String containerType() {
        return this.containerType;
    }

    /**
     * Set the containerType property: Type of container.
     *
     * @param containerType the containerType value to set.
     * @return the DpmJob object itself.
     */
    public DpmJob withContainerType(String containerType) {
        this.containerType = containerType;
        return this;
    }

    /**
     * Get the workloadType property: Type of backup item.
     *
     * @return the workloadType value.
     */
    public String workloadType() {
        return this.workloadType;
    }

    /**
     * Set the workloadType property: Type of backup item.
     *
     * @param workloadType the workloadType value to set.
     * @return the DpmJob object itself.
     */
    public DpmJob withWorkloadType(String workloadType) {
        this.workloadType = workloadType;
        return this;
    }

    /**
     * Get the actionsInfo property: The state/actions applicable on this job like cancel/retry.
     *
     * @return the actionsInfo value.
     */
    public List<JobSupportedAction> actionsInfo() {
        return this.actionsInfo;
    }

    /**
     * Set the actionsInfo property: The state/actions applicable on this job like cancel/retry.
     *
     * @param actionsInfo the actionsInfo value to set.
     * @return the DpmJob object itself.
     */
    public DpmJob withActionsInfo(List<JobSupportedAction> actionsInfo) {
        this.actionsInfo = actionsInfo;
        return this;
    }

    /**
     * Get the errorDetails property: The errors.
     *
     * @return the errorDetails value.
     */
    public List<DpmErrorInfo> errorDetails() {
        return this.errorDetails;
    }

    /**
     * Set the errorDetails property: The errors.
     *
     * @param errorDetails the errorDetails value to set.
     * @return the DpmJob object itself.
     */
    public DpmJob withErrorDetails(List<DpmErrorInfo> errorDetails) {
        this.errorDetails = errorDetails;
        return this;
    }

    /**
     * Get the extendedInfo property: Additional information for this job.
     *
     * @return the extendedInfo value.
     */
    public DpmJobExtendedInfo extendedInfo() {
        return this.extendedInfo;
    }

    /**
     * Set the extendedInfo property: Additional information for this job.
     *
     * @param extendedInfo the extendedInfo value to set.
     * @return the DpmJob object itself.
     */
    public DpmJob withExtendedInfo(DpmJobExtendedInfo extendedInfo) {
        this.extendedInfo = extendedInfo;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DpmJob withEntityFriendlyName(String entityFriendlyName) {
        super.withEntityFriendlyName(entityFriendlyName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DpmJob withBackupManagementType(BackupManagementType backupManagementType) {
        super.withBackupManagementType(backupManagementType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DpmJob withOperation(String operation) {
        super.withOperation(operation);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DpmJob withStatus(String status) {
        super.withStatus(status);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DpmJob withStartTime(OffsetDateTime startTime) {
        super.withStartTime(startTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DpmJob withEndTime(OffsetDateTime endTime) {
        super.withEndTime(endTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DpmJob withActivityId(String activityId) {
        super.withActivityId(activityId);
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
        if (errorDetails() != null) {
            errorDetails().forEach(e -> e.validate());
        }
        if (extendedInfo() != null) {
            extendedInfo().validate();
        }
    }
}
