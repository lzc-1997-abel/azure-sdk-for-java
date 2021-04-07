// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Contains a document found by a search query, plus associated metadata. */
@Fluent
public final class SearchResult {
    /*
     * The relevance score of the document compared to other documents returned
     * by the query.
     */
    @JsonProperty(value = "@search.score", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private double score;

    /*
     * The relevance score computed by the semantic ranker for the top search
     * results. Search results are sorted by the RerankerScore first and then
     * by the Score. RerankerScore is only returned for queries of type
     * 'semantic'.
     */
    @JsonProperty(value = "@search.rerankerScore", access = JsonProperty.Access.WRITE_ONLY)
    private Double rerankerScore;

    /*
     * Text fragments from the document that indicate the matching search
     * terms, organized by each applicable field; null if hit highlighting was
     * not enabled for the query.
     */
    @JsonProperty(value = "@search.highlights", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, List<String>> highlights;

    /*
     * Captions are the most representative passages from the document
     * relatively to the search query. They are often used as document summary.
     * Captions are only returned for queries of type 'semantic'.
     */
    @JsonProperty(value = "@search.captions", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, List<CaptionResult>> captions;

    /*
     * Contains a document found by a search query, plus associated metadata.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of SearchResult class.
     *
     * @param score the score value to set.
     */
    @JsonCreator
    public SearchResult(
            @JsonProperty(value = "@search.score", required = true, access = JsonProperty.Access.WRITE_ONLY)
                    double score) {
        this.score = score;
    }

    /**
     * Get the score property: The relevance score of the document compared to other documents returned by the query.
     *
     * @return the score value.
     */
    public double getScore() {
        return this.score;
    }

    /**
     * Get the rerankerScore property: The relevance score computed by the semantic ranker for the top search results.
     * Search results are sorted by the RerankerScore first and then by the Score. RerankerScore is only returned for
     * queries of type 'semantic'.
     *
     * @return the rerankerScore value.
     */
    public Double getRerankerScore() {
        return this.rerankerScore;
    }

    /**
     * Get the highlights property: Text fragments from the document that indicate the matching search terms, organized
     * by each applicable field; null if hit highlighting was not enabled for the query.
     *
     * @return the highlights value.
     */
    public Map<String, List<String>> getHighlights() {
        return this.highlights;
    }

    /**
     * Get the captions property: Captions are the most representative passages from the document relatively to the
     * search query. They are often used as document summary. Captions are only returned for queries of type 'semantic'.
     *
     * @return the captions value.
     */
    public Map<String, List<CaptionResult>> getCaptions() {
        return this.captions;
    }

    /**
     * Get the additionalProperties property: Contains a document found by a search query, plus associated metadata.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Contains a document found by a search query, plus associated metadata.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the SearchResult object itself.
     */
    public SearchResult setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}
