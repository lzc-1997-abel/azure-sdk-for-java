// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for QueryLanguage. */
public final class QueryLanguage extends ExpandableStringEnum<QueryLanguage> {
    /** Static value none for QueryLanguage. */
    public static final QueryLanguage NONE = fromString("none");

    /** Static value en-us for QueryLanguage. */
    public static final QueryLanguage EN_US = fromString("en-us");

    /**
     * Creates or finds a QueryLanguage from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding QueryLanguage.
     */
    @JsonCreator
    public static QueryLanguage fromString(String name) {
        return fromString(name, QueryLanguage.class);
    }

    /** @return known QueryLanguage values. */
    public static Collection<QueryLanguage> values() {
        return values(QueryLanguage.class);
    }
}
