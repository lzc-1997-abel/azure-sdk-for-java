// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for LexicalNormalizerName. */
public final class LexicalNormalizerName extends ExpandableStringEnum<LexicalNormalizerName> {
    /** Static value asciifolding for LexicalNormalizerName. */
    public static final LexicalNormalizerName ASCII_FOLDING = fromString("asciifolding");

    /** Static value elision for LexicalNormalizerName. */
    public static final LexicalNormalizerName ELISION = fromString("elision");

    /** Static value lowercase for LexicalNormalizerName. */
    public static final LexicalNormalizerName LOWERCASE = fromString("lowercase");

    /** Static value standard for LexicalNormalizerName. */
    public static final LexicalNormalizerName STANDARD = fromString("standard");

    /** Static value uppercase for LexicalNormalizerName. */
    public static final LexicalNormalizerName UPPERCASE = fromString("uppercase");

    /**
     * Creates or finds a LexicalNormalizerName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LexicalNormalizerName.
     */
    @JsonCreator
    public static LexicalNormalizerName fromString(String name) {
        return fromString(name, LexicalNormalizerName.class);
    }

    /** @return known LexicalNormalizerName values. */
    public static Collection<LexicalNormalizerName> values() {
        return values(LexicalNormalizerName.class);
    }
}
