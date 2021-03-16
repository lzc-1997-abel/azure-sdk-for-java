// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for Protocol. */
public enum Protocol {
    /** Enum value http. */
    HTTP("http"),

    /** Enum value https. */
    HTTPS("https");

    /** The actual serialized value for a Protocol instance. */
    private final String value;

    Protocol(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a Protocol instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed Protocol object, or null if unable to parse.
     */
    @JsonCreator
    public static Protocol fromString(String value) {
        Protocol[] items = Protocol.values();
        for (Protocol item : items) {
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
