// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Status. */
public final class Status extends ExpandableStringEnum<Status> {
    /** Static value open for Status. */
    public static final Status OPEN = fromString("open");

    /** Static value closed for Status. */
    public static final Status CLOSED = fromString("closed");

    /**
     * Creates or finds a Status from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Status.
     */
    @JsonCreator
    public static Status fromString(String name) {
        return fromString(name, Status.class);
    }

    /** @return known Status values. */
    public static Collection<Status> values() {
        return values(Status.class);
    }
}
