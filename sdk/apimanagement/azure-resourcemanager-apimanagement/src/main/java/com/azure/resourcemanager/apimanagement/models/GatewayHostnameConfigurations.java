// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of GatewayHostnameConfigurations. */
public interface GatewayHostnameConfigurations {
    /**
     * Lists the collection of hostname configurations for the specified gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Gateway hostname configuration list representation.
     */
    PagedIterable<GatewayHostnameConfigurationContract> listByService(
        String resourceGroupName, String serviceName, String gatewayId);

    /**
     * Lists the collection of hostname configurations for the specified gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @param filter | Field | Usage | Supported operators | Supported functions
     *     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| name | filter | ge, le, eq,
     *     ne, gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;| hostname | filter | ge, le, eq, ne,
     *     gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;.
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Gateway hostname configuration list representation.
     */
    PagedIterable<GatewayHostnameConfigurationContract> listByService(
        String resourceGroupName,
        String serviceName,
        String gatewayId,
        String filter,
        Integer top,
        Integer skip,
        Context context);

    /**
     * Checks that hostname configuration entity specified by identifier exists for specified Gateway entity.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @param hcId Gateway hostname configuration identifier. Must be unique in the scope of parent Gateway entity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void getEntityTag(String resourceGroupName, String serviceName, String gatewayId, String hcId);

    /**
     * Checks that hostname configuration entity specified by identifier exists for specified Gateway entity.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @param hcId Gateway hostname configuration identifier. Must be unique in the scope of parent Gateway entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> getEntityTagWithResponse(
        String resourceGroupName, String serviceName, String gatewayId, String hcId, Context context);

    /**
     * Get details of a hostname configuration.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @param hcId Gateway hostname configuration identifier. Must be unique in the scope of parent Gateway entity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of a hostname configuration.
     */
    GatewayHostnameConfigurationContract get(
        String resourceGroupName, String serviceName, String gatewayId, String hcId);

    /**
     * Get details of a hostname configuration.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @param hcId Gateway hostname configuration identifier. Must be unique in the scope of parent Gateway entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of a hostname configuration.
     */
    Response<GatewayHostnameConfigurationContract> getWithResponse(
        String resourceGroupName, String serviceName, String gatewayId, String hcId, Context context);

    /**
     * Deletes the specified hostname configuration from the specified Gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @param hcId Gateway hostname configuration identifier. Must be unique in the scope of parent Gateway entity.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String serviceName, String gatewayId, String hcId, String ifMatch);

    /**
     * Deletes the specified hostname configuration from the specified Gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @param hcId Gateway hostname configuration identifier. Must be unique in the scope of parent Gateway entity.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String serviceName, String gatewayId, String hcId, String ifMatch, Context context);

    /**
     * Get details of a hostname configuration.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of a hostname configuration.
     */
    GatewayHostnameConfigurationContract getById(String id);

    /**
     * Get details of a hostname configuration.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of a hostname configuration.
     */
    Response<GatewayHostnameConfigurationContract> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the specified hostname configuration from the specified Gateway.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified hostname configuration from the specified Gateway.
     *
     * @param id the resource ID.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteByIdWithResponse(String id, String ifMatch, Context context);

    /**
     * Begins definition for a new GatewayHostnameConfigurationContract resource.
     *
     * @param name resource name.
     * @return the first stage of the new GatewayHostnameConfigurationContract definition.
     */
    GatewayHostnameConfigurationContract.DefinitionStages.Blank define(String name);
}
