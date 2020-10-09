// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters for filtering, sorting, fuzzy matching, and other suggestions query behaviors. */
@Fluent
public final class SuggestRequest {
    /*
     * An OData expression that filters the documents considered for
     * suggestions.
     */
    @JsonProperty(value = "filter")
    private String filter;

    /*
     * A value indicating whether to use fuzzy matching for the suggestion
     * query. Default is false. When set to true, the query will find
     * suggestions even if there's a substituted or missing character in the
     * search text. While this provides a better experience in some scenarios,
     * it comes at a performance cost as fuzzy suggestion searches are slower
     * and consume more resources.
     */
    @JsonProperty(value = "fuzzy")
    private Boolean useFuzzyMatching;

    /*
     * A string tag that is appended to hit highlights. Must be set with
     * highlightPreTag. If omitted, hit highlighting of suggestions is
     * disabled.
     */
    @JsonProperty(value = "highlightPostTag")
    private String highlightPostTag;

    /*
     * A string tag that is prepended to hit highlights. Must be set with
     * highlightPostTag. If omitted, hit highlighting of suggestions is
     * disabled.
     */
    @JsonProperty(value = "highlightPreTag")
    private String highlightPreTag;

    /*
     * A number between 0 and 100 indicating the percentage of the index that
     * must be covered by a suggestion query in order for the query to be
     * reported as a success. This parameter can be useful for ensuring search
     * availability even for services with only one replica. The default is 80.
     */
    @JsonProperty(value = "minimumCoverage")
    private Double minimumCoverage;

    /*
     * The comma-separated list of OData $orderby expressions by which to sort
     * the results. Each expression can be either a field name or a call to
     * either the geo.distance() or the search.score() functions. Each
     * expression can be followed by asc to indicate ascending, or desc to
     * indicate descending. The default is ascending order. Ties will be broken
     * by the match scores of documents. If no $orderby is specified, the
     * default sort order is descending by document match score. There can be
     * at most 32 $orderby clauses.
     */
    @JsonProperty(value = "orderby")
    private String orderBy;

    /*
     * The search text to use to suggest documents. Must be at least 1
     * character, and no more than 100 characters.
     */
    @JsonProperty(value = "search", required = true)
    private String searchText;

    /*
     * The comma-separated list of field names to search for the specified
     * search text. Target fields must be included in the specified suggester.
     */
    @JsonProperty(value = "searchFields")
    private String searchFields;

    /*
     * The comma-separated list of fields to retrieve. If unspecified, only the
     * key field will be included in the results.
     */
    @JsonProperty(value = "select")
    private String select;

    /*
     * The name of the suggester as specified in the suggesters collection
     * that's part of the index definition.
     */
    @JsonProperty(value = "suggesterName", required = true)
    private String suggesterName;

    /*
     * The number of suggestions to retrieve. This must be a value between 1
     * and 100. The default is 5.
     */
    @JsonProperty(value = "top")
    private Integer top;

    /**
     * Creates an instance of SuggestRequest class.
     *
     * @param searchText the searchText value to set.
     * @param suggesterName the suggesterName value to set.
     */
    @JsonCreator
    public SuggestRequest(
            @JsonProperty(value = "search", required = true) String searchText,
            @JsonProperty(value = "suggesterName", required = true) String suggesterName) {
        this.searchText = searchText;
        this.suggesterName = suggesterName;
    }

    /**
     * Get the filter property: An OData expression that filters the documents considered for suggestions.
     *
     * @return the filter value.
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * Set the filter property: An OData expression that filters the documents considered for suggestions.
     *
     * @param filter the filter value to set.
     * @return the SuggestRequest object itself.
     */
    public SuggestRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Get the useFuzzyMatching property: A value indicating whether to use fuzzy matching for the suggestion query.
     * Default is false. When set to true, the query will find suggestions even if there's a substituted or missing
     * character in the search text. While this provides a better experience in some scenarios, it comes at a
     * performance cost as fuzzy suggestion searches are slower and consume more resources.
     *
     * @return the useFuzzyMatching value.
     */
    public Boolean isUseFuzzyMatching() {
        return this.useFuzzyMatching;
    }

    /**
     * Set the useFuzzyMatching property: A value indicating whether to use fuzzy matching for the suggestion query.
     * Default is false. When set to true, the query will find suggestions even if there's a substituted or missing
     * character in the search text. While this provides a better experience in some scenarios, it comes at a
     * performance cost as fuzzy suggestion searches are slower and consume more resources.
     *
     * @param useFuzzyMatching the useFuzzyMatching value to set.
     * @return the SuggestRequest object itself.
     */
    public SuggestRequest setUseFuzzyMatching(Boolean useFuzzyMatching) {
        this.useFuzzyMatching = useFuzzyMatching;
        return this;
    }

    /**
     * Get the highlightPostTag property: A string tag that is appended to hit highlights. Must be set with
     * highlightPreTag. If omitted, hit highlighting of suggestions is disabled.
     *
     * @return the highlightPostTag value.
     */
    public String getHighlightPostTag() {
        return this.highlightPostTag;
    }

    /**
     * Set the highlightPostTag property: A string tag that is appended to hit highlights. Must be set with
     * highlightPreTag. If omitted, hit highlighting of suggestions is disabled.
     *
     * @param highlightPostTag the highlightPostTag value to set.
     * @return the SuggestRequest object itself.
     */
    public SuggestRequest setHighlightPostTag(String highlightPostTag) {
        this.highlightPostTag = highlightPostTag;
        return this;
    }

    /**
     * Get the highlightPreTag property: A string tag that is prepended to hit highlights. Must be set with
     * highlightPostTag. If omitted, hit highlighting of suggestions is disabled.
     *
     * @return the highlightPreTag value.
     */
    public String getHighlightPreTag() {
        return this.highlightPreTag;
    }

    /**
     * Set the highlightPreTag property: A string tag that is prepended to hit highlights. Must be set with
     * highlightPostTag. If omitted, hit highlighting of suggestions is disabled.
     *
     * @param highlightPreTag the highlightPreTag value to set.
     * @return the SuggestRequest object itself.
     */
    public SuggestRequest setHighlightPreTag(String highlightPreTag) {
        this.highlightPreTag = highlightPreTag;
        return this;
    }

    /**
     * Get the minimumCoverage property: A number between 0 and 100 indicating the percentage of the index that must be
     * covered by a suggestion query in order for the query to be reported as a success. This parameter can be useful
     * for ensuring search availability even for services with only one replica. The default is 80.
     *
     * @return the minimumCoverage value.
     */
    public Double getMinimumCoverage() {
        return this.minimumCoverage;
    }

    /**
     * Set the minimumCoverage property: A number between 0 and 100 indicating the percentage of the index that must be
     * covered by a suggestion query in order for the query to be reported as a success. This parameter can be useful
     * for ensuring search availability even for services with only one replica. The default is 80.
     *
     * @param minimumCoverage the minimumCoverage value to set.
     * @return the SuggestRequest object itself.
     */
    public SuggestRequest setMinimumCoverage(Double minimumCoverage) {
        this.minimumCoverage = minimumCoverage;
        return this;
    }

    /**
     * Get the orderBy property: The comma-separated list of OData $orderby expressions by which to sort the results.
     * Each expression can be either a field name or a call to either the geo.distance() or the search.score()
     * functions. Each expression can be followed by asc to indicate ascending, or desc to indicate descending. The
     * default is ascending order. Ties will be broken by the match scores of documents. If no $orderby is specified,
     * the default sort order is descending by document match score. There can be at most 32 $orderby clauses.
     *
     * @return the orderBy value.
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * Set the orderBy property: The comma-separated list of OData $orderby expressions by which to sort the results.
     * Each expression can be either a field name or a call to either the geo.distance() or the search.score()
     * functions. Each expression can be followed by asc to indicate ascending, or desc to indicate descending. The
     * default is ascending order. Ties will be broken by the match scores of documents. If no $orderby is specified,
     * the default sort order is descending by document match score. There can be at most 32 $orderby clauses.
     *
     * @param orderBy the orderBy value to set.
     * @return the SuggestRequest object itself.
     */
    public SuggestRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * Get the searchText property: The search text to use to suggest documents. Must be at least 1 character, and no
     * more than 100 characters.
     *
     * @return the searchText value.
     */
    public String getSearchText() {
        return this.searchText;
    }

    /**
     * Get the searchFields property: The comma-separated list of field names to search for the specified search text.
     * Target fields must be included in the specified suggester.
     *
     * @return the searchFields value.
     */
    public String getSearchFields() {
        return this.searchFields;
    }

    /**
     * Set the searchFields property: The comma-separated list of field names to search for the specified search text.
     * Target fields must be included in the specified suggester.
     *
     * @param searchFields the searchFields value to set.
     * @return the SuggestRequest object itself.
     */
    public SuggestRequest setSearchFields(String searchFields) {
        this.searchFields = searchFields;
        return this;
    }

    /**
     * Get the select property: The comma-separated list of fields to retrieve. If unspecified, only the key field will
     * be included in the results.
     *
     * @return the select value.
     */
    public String getSelect() {
        return this.select;
    }

    /**
     * Set the select property: The comma-separated list of fields to retrieve. If unspecified, only the key field will
     * be included in the results.
     *
     * @param select the select value to set.
     * @return the SuggestRequest object itself.
     */
    public SuggestRequest setSelect(String select) {
        this.select = select;
        return this;
    }

    /**
     * Get the suggesterName property: The name of the suggester as specified in the suggesters collection that's part
     * of the index definition.
     *
     * @return the suggesterName value.
     */
    public String getSuggesterName() {
        return this.suggesterName;
    }

    /**
     * Get the top property: The number of suggestions to retrieve. This must be a value between 1 and 100. The default
     * is 5.
     *
     * @return the top value.
     */
    public Integer getTop() {
        return this.top;
    }

    /**
     * Set the top property: The number of suggestions to retrieve. This must be a value between 1 and 100. The default
     * is 5.
     *
     * @param top the top value to set.
     * @return the SuggestRequest object itself.
     */
    public SuggestRequest setTop(Integer top) {
        this.top = top;
        return this;
    }
}
