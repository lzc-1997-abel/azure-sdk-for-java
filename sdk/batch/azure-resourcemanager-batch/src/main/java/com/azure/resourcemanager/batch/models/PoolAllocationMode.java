// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for PoolAllocationMode. */
public enum PoolAllocationMode {
    /** Enum value BatchService. */
    BATCH_SERVICE("BatchService"),

    /** Enum value UserSubscription. */
    USER_SUBSCRIPTION("UserSubscription");

    /** The actual serialized value for a PoolAllocationMode instance. */
    private final String value;

    PoolAllocationMode(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a PoolAllocationMode instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed PoolAllocationMode object, or null if unable to parse.
     */
    @JsonCreator
    public static PoolAllocationMode fromString(String value) {
        PoolAllocationMode[] items = PoolAllocationMode.values();
        for (PoolAllocationMode item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
