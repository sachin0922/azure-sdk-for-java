/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.implementation;

import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.PrivateEndpointConnection;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.PrivateEndpointProperty;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.PrivateLinkServiceConnectionStateProperty;

class PrivateEndpointConnectionImpl extends CreatableUpdatableImpl<PrivateEndpointConnection, PrivateEndpointConnectionInner, PrivateEndpointConnectionImpl> implements PrivateEndpointConnection, PrivateEndpointConnection.Definition, PrivateEndpointConnection.Update {
    private final CosmosDBManager manager;
    private String resourceGroupName;
    private String accountName;
    private String privateEndpointConnectionName;

    PrivateEndpointConnectionImpl(String name, CosmosDBManager manager) {
        super(name, new PrivateEndpointConnectionInner());
        this.manager = manager;
        // Set resource name
        this.privateEndpointConnectionName = name;
        //
    }

    PrivateEndpointConnectionImpl(PrivateEndpointConnectionInner inner, CosmosDBManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.privateEndpointConnectionName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "databaseAccounts");
        this.privateEndpointConnectionName = IdParsingUtils.getValueFromIdByName(inner.id(), "privateEndpointConnections");
        //
    }

    @Override
    public CosmosDBManager manager() {
        return this.manager;
    }

    @Override
    public Observable<PrivateEndpointConnection> createResourceAsync() {
        PrivateEndpointConnectionsInner client = this.manager().inner().privateEndpointConnections();
        return client.createOrUpdateAsync(this.resourceGroupName, this.accountName, this.privateEndpointConnectionName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<PrivateEndpointConnection> updateResourceAsync() {
        PrivateEndpointConnectionsInner client = this.manager().inner().privateEndpointConnections();
        return client.createOrUpdateAsync(this.resourceGroupName, this.accountName, this.privateEndpointConnectionName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<PrivateEndpointConnectionInner> getInnerAsync() {
        PrivateEndpointConnectionsInner client = this.manager().inner().privateEndpointConnections();
        return client.getAsync(this.resourceGroupName, this.accountName, this.privateEndpointConnectionName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String groupId() {
        return this.inner().groupId();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public PrivateEndpointProperty privateEndpoint() {
        return this.inner().privateEndpoint();
    }

    @Override
    public PrivateLinkServiceConnectionStateProperty privateLinkServiceConnectionState() {
        return this.inner().privateLinkServiceConnectionState();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public PrivateEndpointConnectionImpl withExistingDatabaseAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    @Override
    public PrivateEndpointConnectionImpl withGroupId(String groupId) {
        this.inner().withGroupId(groupId);
        return this;
    }

    @Override
    public PrivateEndpointConnectionImpl withPrivateEndpoint(PrivateEndpointProperty privateEndpoint) {
        this.inner().withPrivateEndpoint(privateEndpoint);
        return this;
    }

    @Override
    public PrivateEndpointConnectionImpl withPrivateLinkServiceConnectionState(PrivateLinkServiceConnectionStateProperty privateLinkServiceConnectionState) {
        this.inner().withPrivateLinkServiceConnectionState(privateLinkServiceConnectionState);
        return this;
    }

    @Override
    public PrivateEndpointConnectionImpl withProvisioningState(String provisioningState) {
        this.inner().withProvisioningState(provisioningState);
        return this;
    }

}
