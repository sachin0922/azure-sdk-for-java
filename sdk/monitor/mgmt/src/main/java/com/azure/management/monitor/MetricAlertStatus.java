// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The MetricAlertStatus model.
 */
@Fluent
public final class MetricAlertStatus {
    /*
     * The status name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The alert rule arm id.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The extended resource type name.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * The alert status properties of the metric alert status.
     */
    @JsonProperty(value = "properties")
    private MetricAlertStatusProperties properties;

    /**
     * Get the name property: The status name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The status name.
     * 
     * @param name the name value to set.
     * @return the MetricAlertStatus object itself.
     */
    public MetricAlertStatus withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the id property: The alert rule arm id.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The alert rule arm id.
     * 
     * @param id the id value to set.
     * @return the MetricAlertStatus object itself.
     */
    public MetricAlertStatus withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the type property: The extended resource type name.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The extended resource type name.
     * 
     * @param type the type value to set.
     * @return the MetricAlertStatus object itself.
     */
    public MetricAlertStatus withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the properties property: The alert status properties of the metric
     * alert status.
     * 
     * @return the properties value.
     */
    public MetricAlertStatusProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The alert status properties of the metric
     * alert status.
     * 
     * @param properties the properties value to set.
     * @return the MetricAlertStatus object itself.
     */
    public MetricAlertStatus withProperties(MetricAlertStatusProperties properties) {
        this.properties = properties;
        return this;
    }
}