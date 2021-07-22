// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Configures where to store the OMS agent data for workspaces under a scope. */
@JsonFlatten
@Fluent
public class WorkspaceSettingInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WorkspaceSettingInner.class);

    /*
     * The full Azure ID of the workspace to save the data in
     */
    @JsonProperty(value = "properties.workspaceId")
    private String workspaceId;

    /*
     * All the VMs in this scope will send their security data to the mentioned
     * workspace unless overridden by a setting with more specific scope
     */
    @JsonProperty(value = "properties.scope")
    private String scope;

    /**
     * Get the workspaceId property: The full Azure ID of the workspace to save the data in.
     *
     * @return the workspaceId value.
     */
    public String workspaceId() {
        return this.workspaceId;
    }

    /**
     * Set the workspaceId property: The full Azure ID of the workspace to save the data in.
     *
     * @param workspaceId the workspaceId value to set.
     * @return the WorkspaceSettingInner object itself.
     */
    public WorkspaceSettingInner withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * Get the scope property: All the VMs in this scope will send their security data to the mentioned workspace unless
     * overridden by a setting with more specific scope.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope property: All the VMs in this scope will send their security data to the mentioned workspace unless
     * overridden by a setting with more specific scope.
     *
     * @param scope the scope value to set.
     * @return the WorkspaceSettingInner object itself.
     */
    public WorkspaceSettingInner withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
