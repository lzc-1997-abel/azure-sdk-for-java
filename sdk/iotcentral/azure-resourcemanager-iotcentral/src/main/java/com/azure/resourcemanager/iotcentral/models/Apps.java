// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotcentral.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Apps. */
public interface Apps {
    /**
     * Get the metadata of an IoT Central application.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT Central application.
     * @param resourceName The ARM resource name of the IoT Central application.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the metadata of an IoT Central application.
     */
    App getByResourceGroup(String resourceGroupName, String resourceName);

    /**
     * Get the metadata of an IoT Central application.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT Central application.
     * @param resourceName The ARM resource name of the IoT Central application.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the metadata of an IoT Central application.
     */
    Response<App> getByResourceGroupWithResponse(String resourceGroupName, String resourceName, Context context);

    /**
     * Delete an IoT Central application.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT Central application.
     * @param resourceName The ARM resource name of the IoT Central application.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String resourceName);

    /**
     * Delete an IoT Central application.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT Central application.
     * @param resourceName The ARM resource name of the IoT Central application.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String resourceName, Context context);

    /**
     * Get all IoT Central Applications in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all IoT Central Applications in a subscription.
     */
    PagedIterable<App> list();

    /**
     * Get all IoT Central Applications in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all IoT Central Applications in a subscription.
     */
    PagedIterable<App> list(Context context);

    /**
     * Get all the IoT Central Applications in a resource group.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT Central application.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the IoT Central Applications in a resource group.
     */
    PagedIterable<App> listByResourceGroup(String resourceGroupName);

    /**
     * Get all the IoT Central Applications in a resource group.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT Central application.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the IoT Central Applications in a resource group.
     */
    PagedIterable<App> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Check if an IoT Central application name is available.
     *
     * @param operationInputs Set the name parameter in the OperationInputs structure to the name of the IoT Central
     *     application to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties indicating whether a given IoT Central application name or subdomain is available.
     */
    AppAvailabilityInfo checkNameAvailability(OperationInputs operationInputs);

    /**
     * Check if an IoT Central application name is available.
     *
     * @param operationInputs Set the name parameter in the OperationInputs structure to the name of the IoT Central
     *     application to check.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties indicating whether a given IoT Central application name or subdomain is available.
     */
    Response<AppAvailabilityInfo> checkNameAvailabilityWithResponse(OperationInputs operationInputs, Context context);

    /**
     * Check if an IoT Central application subdomain is available.
     *
     * @param operationInputs Set the name parameter in the OperationInputs structure to the subdomain of the IoT
     *     Central application to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties indicating whether a given IoT Central application name or subdomain is available.
     */
    AppAvailabilityInfo checkSubdomainAvailability(OperationInputs operationInputs);

    /**
     * Check if an IoT Central application subdomain is available.
     *
     * @param operationInputs Set the name parameter in the OperationInputs structure to the subdomain of the IoT
     *     Central application to check.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties indicating whether a given IoT Central application name or subdomain is available.
     */
    Response<AppAvailabilityInfo> checkSubdomainAvailabilityWithResponse(
        OperationInputs operationInputs, Context context);

    /**
     * Get all available application templates.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available application templates.
     */
    PagedIterable<AppTemplate> listTemplates();

    /**
     * Get all available application templates.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available application templates.
     */
    PagedIterable<AppTemplate> listTemplates(Context context);

    /**
     * Get the metadata of an IoT Central application.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the metadata of an IoT Central application.
     */
    App getById(String id);

    /**
     * Get the metadata of an IoT Central application.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the metadata of an IoT Central application.
     */
    Response<App> getByIdWithResponse(String id, Context context);

    /**
     * Delete an IoT Central application.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete an IoT Central application.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new App resource.
     *
     * @param name resource name.
     * @return the first stage of the new App definition.
     */
    App.DefinitionStages.Blank define(String name);
}
