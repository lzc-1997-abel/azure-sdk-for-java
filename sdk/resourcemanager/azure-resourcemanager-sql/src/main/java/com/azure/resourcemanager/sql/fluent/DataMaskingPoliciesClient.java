// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.fluent.models.DataMaskingPolicyInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DataMaskingPoliciesClient. */
public interface DataMaskingPoliciesClient {
    /**
     * Creates or updates a database data masking policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param parameters Represents a database data masking policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a database data masking policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<DataMaskingPolicyInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String serverName, String databaseName, DataMaskingPolicyInner parameters);

    /**
     * Creates or updates a database data masking policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param parameters Represents a database data masking policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a database data masking policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DataMaskingPolicyInner> createOrUpdateAsync(
        String resourceGroupName, String serverName, String databaseName, DataMaskingPolicyInner parameters);

    /**
     * Creates or updates a database data masking policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param parameters Represents a database data masking policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a database data masking policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataMaskingPolicyInner createOrUpdate(
        String resourceGroupName, String serverName, String databaseName, DataMaskingPolicyInner parameters);

    /**
     * Creates or updates a database data masking policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param parameters Represents a database data masking policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a database data masking policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DataMaskingPolicyInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        DataMaskingPolicyInner parameters,
        Context context);

    /**
     * Gets a database data masking policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database data masking policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<DataMaskingPolicyInner>> getWithResponseAsync(
        String resourceGroupName, String serverName, String databaseName);

    /**
     * Gets a database data masking policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database data masking policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DataMaskingPolicyInner> getAsync(String resourceGroupName, String serverName, String databaseName);

    /**
     * Gets a database data masking policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database data masking policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataMaskingPolicyInner get(String resourceGroupName, String serverName, String databaseName);

    /**
     * Gets a database data masking policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database data masking policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DataMaskingPolicyInner> getWithResponse(
        String resourceGroupName, String serverName, String databaseName, Context context);
}
