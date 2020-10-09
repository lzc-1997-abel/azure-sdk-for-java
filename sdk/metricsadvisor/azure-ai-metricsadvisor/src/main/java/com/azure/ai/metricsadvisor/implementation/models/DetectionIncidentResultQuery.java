// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The DetectionIncidentResultQuery model. */
@Fluent
public final class DetectionIncidentResultQuery {
    /*
     * start time
     */
    @JsonProperty(value = "startTime", required = true)
    private OffsetDateTime startTime;

    /*
     * end time
     */
    @JsonProperty(value = "endTime", required = true)
    private OffsetDateTime endTime;

    /*
     * The filter property.
     */
    @JsonProperty(value = "filter")
    private DetectionIncidentFilterCondition filter;

    /**
     * Get the startTime property: start time.
     *
     * @return the startTime value.
     */
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: start time.
     *
     * @param startTime the startTime value to set.
     * @return the DetectionIncidentResultQuery object itself.
     */
    public DetectionIncidentResultQuery setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: end time.
     *
     * @return the endTime value.
     */
    public OffsetDateTime getEndTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: end time.
     *
     * @param endTime the endTime value to set.
     * @return the DetectionIncidentResultQuery object itself.
     */
    public DetectionIncidentResultQuery setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the filter property: The filter property.
     *
     * @return the filter value.
     */
    public DetectionIncidentFilterCondition getFilter() {
        return this.filter;
    }

    /**
     * Set the filter property: The filter property.
     *
     * @param filter the filter value to set.
     * @return the DetectionIncidentResultQuery object itself.
     */
    public DetectionIncidentResultQuery setFilter(DetectionIncidentFilterCondition filter) {
        this.filter = filter;
        return this;
    }
}
