// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for EndOfSupportStatus. */
public final class EndOfSupportStatus extends ExpandableStringEnum<EndOfSupportStatus> {
    /** Static value None for EndOfSupportStatus. */
    public static final EndOfSupportStatus NONE = fromString("None");

    /** Static value noLongerSupported for EndOfSupportStatus. */
    public static final EndOfSupportStatus NO_LONGER_SUPPORTED = fromString("noLongerSupported");

    /** Static value versionNoLongerSupported for EndOfSupportStatus. */
    public static final EndOfSupportStatus VERSION_NO_LONGER_SUPPORTED = fromString("versionNoLongerSupported");

    /** Static value upcomingNoLongerSupported for EndOfSupportStatus. */
    public static final EndOfSupportStatus UPCOMING_NO_LONGER_SUPPORTED = fromString("upcomingNoLongerSupported");

    /** Static value upcomingVersionNoLongerSupported for EndOfSupportStatus. */
    public static final EndOfSupportStatus UPCOMING_VERSION_NO_LONGER_SUPPORTED =
        fromString("upcomingVersionNoLongerSupported");

    /**
     * Creates or finds a EndOfSupportStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EndOfSupportStatus.
     */
    @JsonCreator
    public static EndOfSupportStatus fromString(String name) {
        return fromString(name, EndOfSupportStatus.class);
    }

    /** @return known EndOfSupportStatus values. */
    public static Collection<EndOfSupportStatus> values() {
        return values(EndOfSupportStatus.class);
    }
}
