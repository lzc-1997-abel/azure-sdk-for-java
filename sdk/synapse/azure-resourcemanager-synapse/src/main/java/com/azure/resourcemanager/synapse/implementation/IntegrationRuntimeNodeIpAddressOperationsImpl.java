// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.fluent.IntegrationRuntimeNodeIpAddressOperationsClient;
import com.azure.resourcemanager.synapse.fluent.models.IntegrationRuntimeNodeIpAddressInner;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeNodeIpAddress;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeNodeIpAddressOperations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class IntegrationRuntimeNodeIpAddressOperationsImpl implements IntegrationRuntimeNodeIpAddressOperations {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(IntegrationRuntimeNodeIpAddressOperationsImpl.class);

    private final IntegrationRuntimeNodeIpAddressOperationsClient innerClient;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    public IntegrationRuntimeNodeIpAddressOperationsImpl(
        IntegrationRuntimeNodeIpAddressOperationsClient innerClient,
        com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public IntegrationRuntimeNodeIpAddress get(
        String resourceGroupName, String workspaceName, String integrationRuntimeName, String nodeName) {
        IntegrationRuntimeNodeIpAddressInner inner =
            this.serviceClient().get(resourceGroupName, workspaceName, integrationRuntimeName, nodeName);
        if (inner != null) {
            return new IntegrationRuntimeNodeIpAddressImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IntegrationRuntimeNodeIpAddress> getWithResponse(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        String nodeName,
        Context context) {
        Response<IntegrationRuntimeNodeIpAddressInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, workspaceName, integrationRuntimeName, nodeName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IntegrationRuntimeNodeIpAddressImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private IntegrationRuntimeNodeIpAddressOperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }
}
