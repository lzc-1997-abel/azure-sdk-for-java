// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.fluent.SqlPoolColumnsClient;
import com.azure.resourcemanager.synapse.fluent.models.SqlPoolColumnInner;
import com.azure.resourcemanager.synapse.models.SqlPoolColumn;
import com.azure.resourcemanager.synapse.models.SqlPoolColumns;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class SqlPoolColumnsImpl implements SqlPoolColumns {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SqlPoolColumnsImpl.class);

    private final SqlPoolColumnsClient innerClient;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    public SqlPoolColumnsImpl(
        SqlPoolColumnsClient innerClient, com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public SqlPoolColumn get(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        String schemaName,
        String tableName,
        String columnName) {
        SqlPoolColumnInner inner =
            this.serviceClient().get(resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName, columnName);
        if (inner != null) {
            return new SqlPoolColumnImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SqlPoolColumn> getWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        String schemaName,
        String tableName,
        String columnName,
        Context context) {
        Response<SqlPoolColumnInner> inner =
            this
                .serviceClient()
                .getWithResponse(
                    resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName, columnName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SqlPoolColumnImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private SqlPoolColumnsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }
}
