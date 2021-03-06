/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_08_01;

import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Metadata for search results.
 */
public class SearchMetadata {
    /**
     * The request id of the search.
     */
    @JsonProperty(value = "requestId")
    private String searchId;

    /**
     * The search result type.
     */
    @JsonProperty(value = "resultType")
    private String resultType;

    /**
     * The total number of search results.
     */
    @JsonProperty(value = "total")
    private Long total;

    /**
     * The number of top search results.
     */
    @JsonProperty(value = "top")
    private Long top;

    /**
     * The id of the search results request.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The core summaries.
     */
    @JsonProperty(value = "coreSummaries")
    private List<CoreSummary> coreSummaries;

    /**
     * The status of the search results.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * The start time for the search.
     */
    @JsonProperty(value = "startTime")
    private DateTime startTime;

    /**
     * The time of last update.
     */
    @JsonProperty(value = "lastUpdated")
    private DateTime lastUpdated;

    /**
     * The ETag of the search results.
     */
    @JsonProperty(value = "eTag")
    private String eTag;

    /**
     * How the results are sorted.
     */
    @JsonProperty(value = "sort")
    private List<SearchSort> sort;

    /**
     * The request time.
     */
    @JsonProperty(value = "requestTime")
    private Long requestTime;

    /**
     * The aggregated value field.
     */
    @JsonProperty(value = "aggregatedValueField")
    private String aggregatedValueField;

    /**
     * The aggregated grouping fields.
     */
    @JsonProperty(value = "aggregatedGroupingFields")
    private String aggregatedGroupingFields;

    /**
     * The sum of all aggregates returned in the result set.
     */
    @JsonProperty(value = "sum")
    private Long sum;

    /**
     * The max of all aggregates returned in the result set.
     */
    @JsonProperty(value = "max")
    private Long max;

    /**
     * The schema.
     */
    @JsonProperty(value = "schema")
    private SearchMetadataSchema schema;

    /**
     * Get the request id of the search.
     *
     * @return the searchId value
     */
    public String searchId() {
        return this.searchId;
    }

    /**
     * Set the request id of the search.
     *
     * @param searchId the searchId value to set
     * @return the SearchMetadata object itself.
     */
    public SearchMetadata withSearchId(String searchId) {
        this.searchId = searchId;
        return this;
    }

    /**
     * Get the search result type.
     *
     * @return the resultType value
     */
    public String resultType() {
        return this.resultType;
    }

    /**
     * Set the search result type.
     *
     * @param resultType the resultType value to set
     * @return the SearchMetadata object itself.
     */
    public SearchMetadata withResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }

    /**
     * Get the total number of search results.
     *
     * @return the total value
     */
    public Long total() {
        return this.total;
    }

    /**
     * Set the total number of search results.
     *
     * @param total the total value to set
     * @return the SearchMetadata object itself.
     */
    public SearchMetadata withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * Get the number of top search results.
     *
     * @return the top value
     */
    public Long top() {
        return this.top;
    }

    /**
     * Set the number of top search results.
     *
     * @param top the top value to set
     * @return the SearchMetadata object itself.
     */
    public SearchMetadata withTop(Long top) {
        this.top = top;
        return this;
    }

    /**
     * Get the id of the search results request.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id of the search results request.
     *
     * @param id the id value to set
     * @return the SearchMetadata object itself.
     */
    public SearchMetadata withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the core summaries.
     *
     * @return the coreSummaries value
     */
    public List<CoreSummary> coreSummaries() {
        return this.coreSummaries;
    }

    /**
     * Set the core summaries.
     *
     * @param coreSummaries the coreSummaries value to set
     * @return the SearchMetadata object itself.
     */
    public SearchMetadata withCoreSummaries(List<CoreSummary> coreSummaries) {
        this.coreSummaries = coreSummaries;
        return this;
    }

    /**
     * Get the status of the search results.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status of the search results.
     *
     * @param status the status value to set
     * @return the SearchMetadata object itself.
     */
    public SearchMetadata withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the start time for the search.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the start time for the search.
     *
     * @param startTime the startTime value to set
     * @return the SearchMetadata object itself.
     */
    public SearchMetadata withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the time of last update.
     *
     * @return the lastUpdated value
     */
    public DateTime lastUpdated() {
        return this.lastUpdated;
    }

    /**
     * Set the time of last update.
     *
     * @param lastUpdated the lastUpdated value to set
     * @return the SearchMetadata object itself.
     */
    public SearchMetadata withLastUpdated(DateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    /**
     * Get the ETag of the search results.
     *
     * @return the eTag value
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set the ETag of the search results.
     *
     * @param eTag the eTag value to set
     * @return the SearchMetadata object itself.
     */
    public SearchMetadata withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get how the results are sorted.
     *
     * @return the sort value
     */
    public List<SearchSort> sort() {
        return this.sort;
    }

    /**
     * Set how the results are sorted.
     *
     * @param sort the sort value to set
     * @return the SearchMetadata object itself.
     */
    public SearchMetadata withSort(List<SearchSort> sort) {
        this.sort = sort;
        return this;
    }

    /**
     * Get the request time.
     *
     * @return the requestTime value
     */
    public Long requestTime() {
        return this.requestTime;
    }

    /**
     * Set the request time.
     *
     * @param requestTime the requestTime value to set
     * @return the SearchMetadata object itself.
     */
    public SearchMetadata withRequestTime(Long requestTime) {
        this.requestTime = requestTime;
        return this;
    }

    /**
     * Get the aggregated value field.
     *
     * @return the aggregatedValueField value
     */
    public String aggregatedValueField() {
        return this.aggregatedValueField;
    }

    /**
     * Set the aggregated value field.
     *
     * @param aggregatedValueField the aggregatedValueField value to set
     * @return the SearchMetadata object itself.
     */
    public SearchMetadata withAggregatedValueField(String aggregatedValueField) {
        this.aggregatedValueField = aggregatedValueField;
        return this;
    }

    /**
     * Get the aggregated grouping fields.
     *
     * @return the aggregatedGroupingFields value
     */
    public String aggregatedGroupingFields() {
        return this.aggregatedGroupingFields;
    }

    /**
     * Set the aggregated grouping fields.
     *
     * @param aggregatedGroupingFields the aggregatedGroupingFields value to set
     * @return the SearchMetadata object itself.
     */
    public SearchMetadata withAggregatedGroupingFields(String aggregatedGroupingFields) {
        this.aggregatedGroupingFields = aggregatedGroupingFields;
        return this;
    }

    /**
     * Get the sum of all aggregates returned in the result set.
     *
     * @return the sum value
     */
    public Long sum() {
        return this.sum;
    }

    /**
     * Set the sum of all aggregates returned in the result set.
     *
     * @param sum the sum value to set
     * @return the SearchMetadata object itself.
     */
    public SearchMetadata withSum(Long sum) {
        this.sum = sum;
        return this;
    }

    /**
     * Get the max of all aggregates returned in the result set.
     *
     * @return the max value
     */
    public Long max() {
        return this.max;
    }

    /**
     * Set the max of all aggregates returned in the result set.
     *
     * @param max the max value to set
     * @return the SearchMetadata object itself.
     */
    public SearchMetadata withMax(Long max) {
        this.max = max;
        return this;
    }

    /**
     * Get the schema.
     *
     * @return the schema value
     */
    public SearchMetadataSchema schema() {
        return this.schema;
    }

    /**
     * Set the schema.
     *
     * @param schema the schema value to set
     * @return the SearchMetadata object itself.
     */
    public SearchMetadata withSchema(SearchMetadataSchema schema) {
        this.schema = schema;
        return this;
    }

}
