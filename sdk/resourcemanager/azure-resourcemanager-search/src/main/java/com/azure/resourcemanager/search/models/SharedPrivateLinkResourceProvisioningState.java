// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for SharedPrivateLinkResourceProvisioningState. */
public enum SharedPrivateLinkResourceProvisioningState {
    /** Enum value Updating. */
    UPDATING("Updating"),

    /** Enum value Deleting. */
    DELETING("Deleting"),

    /** Enum value Failed. */
    FAILED("Failed"),

    /** Enum value Succeeded. */
    SUCCEEDED("Succeeded"),

    /** Enum value Incomplete. */
    INCOMPLETE("Incomplete");

    /** The actual serialized value for a SharedPrivateLinkResourceProvisioningState instance. */
    private final String value;

    SharedPrivateLinkResourceProvisioningState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SharedPrivateLinkResourceProvisioningState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed SharedPrivateLinkResourceProvisioningState object, or null if unable to parse.
     */
    @JsonCreator
    public static SharedPrivateLinkResourceProvisioningState fromString(String value) {
        SharedPrivateLinkResourceProvisioningState[] items = SharedPrivateLinkResourceProvisioningState.values();
        for (SharedPrivateLinkResourceProvisioningState item : items) {
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
