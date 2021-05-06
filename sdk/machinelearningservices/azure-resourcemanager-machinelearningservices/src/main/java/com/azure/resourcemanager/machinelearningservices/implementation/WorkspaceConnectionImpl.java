// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearningservices.fluent.models.WorkspaceConnectionInner;
import com.azure.resourcemanager.machinelearningservices.models.ValueFormat;
import com.azure.resourcemanager.machinelearningservices.models.WorkspaceConnection;
import com.azure.resourcemanager.machinelearningservices.models.WorkspaceConnectionDto;

public final class WorkspaceConnectionImpl implements WorkspaceConnection, WorkspaceConnection.Definition {
    private WorkspaceConnectionInner innerObject;

    private final com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager serviceManager;

    WorkspaceConnectionImpl(
        WorkspaceConnectionInner innerObject,
        com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String category() {
        return this.innerModel().category();
    }

    public String target() {
        return this.innerModel().target();
    }

    public String authType() {
        return this.innerModel().authType();
    }

    public String value() {
        return this.innerModel().value();
    }

    public ValueFormat valueFormat() {
        return this.innerModel().valueFormat();
    }

    public WorkspaceConnectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private String connectionName;

    private WorkspaceConnectionDto createParameters;

    public WorkspaceConnectionImpl withExistingWorkspace(String resourceGroupName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

    public WorkspaceConnection create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaceConnections()
                .createWithResponse(resourceGroupName, workspaceName, connectionName, createParameters, Context.NONE)
                .getValue();
        return this;
    }

    public WorkspaceConnection create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaceConnections()
                .createWithResponse(resourceGroupName, workspaceName, connectionName, createParameters, context)
                .getValue();
        return this;
    }

    WorkspaceConnectionImpl(
        String name, com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager serviceManager) {
        this.innerObject = new WorkspaceConnectionInner();
        this.serviceManager = serviceManager;
        this.connectionName = name;
        this.createParameters = new WorkspaceConnectionDto();
    }

    public WorkspaceConnection refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaceConnections()
                .getWithResponse(resourceGroupName, workspaceName, connectionName, Context.NONE)
                .getValue();
        return this;
    }

    public WorkspaceConnection refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaceConnections()
                .getWithResponse(resourceGroupName, workspaceName, connectionName, context)
                .getValue();
        return this;
    }

    public WorkspaceConnectionImpl withName(String name) {
        this.createParameters.withName(name);
        return this;
    }

    public WorkspaceConnectionImpl withCategory(String category) {
        this.createParameters.withCategory(category);
        return this;
    }

    public WorkspaceConnectionImpl withTarget(String target) {
        this.createParameters.withTarget(target);
        return this;
    }

    public WorkspaceConnectionImpl withAuthType(String authType) {
        this.createParameters.withAuthType(authType);
        return this;
    }

    public WorkspaceConnectionImpl withValue(String value) {
        this.createParameters.withValue(value);
        return this;
    }

    public WorkspaceConnectionImpl withValueFormat(ValueFormat valueFormat) {
        this.createParameters.withValueFormat(valueFormat);
        return this;
    }
}
