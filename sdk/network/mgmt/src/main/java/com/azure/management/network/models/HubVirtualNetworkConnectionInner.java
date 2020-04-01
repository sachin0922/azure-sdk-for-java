// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.management.network.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The HubVirtualNetworkConnection model.
 */
@JsonFlatten
@Fluent
public class HubVirtualNetworkConnectionInner extends SubResource {
    /*
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Reference to another subresource.
     */
    @JsonProperty(value = "properties.remoteVirtualNetwork")
    private SubResource remoteVirtualNetwork;

    /*
     * VirtualHub to RemoteVnet transit to enabled or not.
     */
    @JsonProperty(value = "properties.allowHubToRemoteVnetTransit")
    private Boolean allowHubToRemoteVnetTransit;

    /*
     * Allow RemoteVnet to use Virtual Hub's gateways.
     */
    @JsonProperty(value = "properties.allowRemoteVnetToUseHubVnetGateways")
    private Boolean allowRemoteVnetToUseHubVnetGateways;

    /*
     * Enable internet security.
     */
    @JsonProperty(value = "properties.enableInternetSecurity")
    private Boolean enableInternetSecurity;

    /*
     * The current provisioning state.
     */
    @JsonProperty(value = "properties.provisioningState")
    private ProvisioningState provisioningState;

    /**
     * Get the name property: The name of the resource that is unique within a
     * resource group. This name can be used to access the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a
     * resource group. This name can be used to access the resource.
     * 
     * @param name the name value to set.
     * @return the HubVirtualNetworkConnectionInner object itself.
     */
    public HubVirtualNetworkConnectionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: Gets a unique read-only string that changes
     * whenever the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the remoteVirtualNetwork property: Reference to another subresource.
     * 
     * @return the remoteVirtualNetwork value.
     */
    public SubResource remoteVirtualNetwork() {
        return this.remoteVirtualNetwork;
    }

    /**
     * Set the remoteVirtualNetwork property: Reference to another subresource.
     * 
     * @param remoteVirtualNetwork the remoteVirtualNetwork value to set.
     * @return the HubVirtualNetworkConnectionInner object itself.
     */
    public HubVirtualNetworkConnectionInner withRemoteVirtualNetwork(SubResource remoteVirtualNetwork) {
        this.remoteVirtualNetwork = remoteVirtualNetwork;
        return this;
    }

    /**
     * Get the allowHubToRemoteVnetTransit property: VirtualHub to RemoteVnet
     * transit to enabled or not.
     * 
     * @return the allowHubToRemoteVnetTransit value.
     */
    public Boolean allowHubToRemoteVnetTransit() {
        return this.allowHubToRemoteVnetTransit;
    }

    /**
     * Set the allowHubToRemoteVnetTransit property: VirtualHub to RemoteVnet
     * transit to enabled or not.
     * 
     * @param allowHubToRemoteVnetTransit the allowHubToRemoteVnetTransit value
     * to set.
     * @return the HubVirtualNetworkConnectionInner object itself.
     */
    public HubVirtualNetworkConnectionInner withAllowHubToRemoteVnetTransit(Boolean allowHubToRemoteVnetTransit) {
        this.allowHubToRemoteVnetTransit = allowHubToRemoteVnetTransit;
        return this;
    }

    /**
     * Get the allowRemoteVnetToUseHubVnetGateways property: Allow RemoteVnet
     * to use Virtual Hub's gateways.
     * 
     * @return the allowRemoteVnetToUseHubVnetGateways value.
     */
    public Boolean allowRemoteVnetToUseHubVnetGateways() {
        return this.allowRemoteVnetToUseHubVnetGateways;
    }

    /**
     * Set the allowRemoteVnetToUseHubVnetGateways property: Allow RemoteVnet
     * to use Virtual Hub's gateways.
     * 
     * @param allowRemoteVnetToUseHubVnetGateways the
     * allowRemoteVnetToUseHubVnetGateways value to set.
     * @return the HubVirtualNetworkConnectionInner object itself.
     */
    public HubVirtualNetworkConnectionInner withAllowRemoteVnetToUseHubVnetGateways(Boolean allowRemoteVnetToUseHubVnetGateways) {
        this.allowRemoteVnetToUseHubVnetGateways = allowRemoteVnetToUseHubVnetGateways;
        return this;
    }

    /**
     * Get the enableInternetSecurity property: Enable internet security.
     * 
     * @return the enableInternetSecurity value.
     */
    public Boolean enableInternetSecurity() {
        return this.enableInternetSecurity;
    }

    /**
     * Set the enableInternetSecurity property: Enable internet security.
     * 
     * @param enableInternetSecurity the enableInternetSecurity value to set.
     * @return the HubVirtualNetworkConnectionInner object itself.
     */
    public HubVirtualNetworkConnectionInner withEnableInternetSecurity(Boolean enableInternetSecurity) {
        this.enableInternetSecurity = enableInternetSecurity;
        return this;
    }

    /**
     * Get the provisioningState property: The current provisioning state.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The current provisioning state.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the HubVirtualNetworkConnectionInner object itself.
     */
    public HubVirtualNetworkConnectionInner withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }
}