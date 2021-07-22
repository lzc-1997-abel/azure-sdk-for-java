// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.attestation.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DataType. */
public final class DataType extends ExpandableStringEnum<DataType> {
    /** Static value Binary for DataType. */
    public static final DataType BINARY = fromString("Binary");

    /** Static value JSON for DataType. */
    public static final DataType JSON = fromString("JSON");

    /**
     * Creates or finds a DataType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DataType.
     */
    @JsonCreator
    public static DataType fromString(String name) {
        return fromString(name, DataType.class);
    }

    /** @return known DataType values. */
    public static Collection<DataType> values() {
        return values(DataType.class);
    }
}
