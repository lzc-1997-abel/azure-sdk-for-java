// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Schedule availability for given sku in a region. */
@Immutable
public final class ScheduleAvailabilityResponse {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ScheduleAvailabilityResponse.class);

    /*
     * List of dates available to schedule
     */
    @JsonProperty(value = "availableDates", access = JsonProperty.Access.WRITE_ONLY)
    private List<OffsetDateTime> availableDates;

    /**
     * Get the availableDates property: List of dates available to schedule.
     *
     * @return the availableDates value.
     */
    public List<OffsetDateTime> availableDates() {
        return this.availableDates;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
