/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2020_03_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for Encoding.
 */
public final class Encoding extends ExpandableStringEnum<Encoding> {
    /** Static value UTF8 for Encoding. */
    public static final Encoding UTF8 = fromString("UTF8");

    /**
     * Creates or finds a Encoding from its string representation.
     * @param name a name to look for
     * @return the corresponding Encoding
     */
    @JsonCreator
    public static Encoding fromString(String name) {
        return fromString(name, Encoding.class);
    }

    /**
     * @return known Encoding values
     */
    public static Collection<Encoding> values() {
        return values(Encoding.class);
    }
}
