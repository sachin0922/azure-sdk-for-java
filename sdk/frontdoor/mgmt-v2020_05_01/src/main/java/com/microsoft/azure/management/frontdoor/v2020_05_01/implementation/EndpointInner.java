/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.frontdoor.v2020_05_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the endpoint properties.
 */
public class EndpointInner {
    /**
     * The name of the endpoint.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The endpoint URL.
     */
    @JsonProperty(value = "endpoint")
    private String endpoint;

    /**
     * Get the name of the endpoint.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the endpoint.
     *
     * @param name the name value to set
     * @return the EndpointInner object itself.
     */
    public EndpointInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the endpoint URL.
     *
     * @return the endpoint value
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint URL.
     *
     * @param endpoint the endpoint value to set
     * @return the EndpointInner object itself.
     */
    public EndpointInner withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

}
