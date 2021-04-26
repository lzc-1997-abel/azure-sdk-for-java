// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.managedapplications.fluent.models.ApplicationDefinitionInner;

/** An instance of this class provides access to all the operations defined in ApplicationDefinitionsClient. */
public interface ApplicationDefinitionsClient {
    /**
     * Gets the managed application definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managed application definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationDefinitionInner getByResourceGroup(String resourceGroupName, String applicationDefinitionName);

    /**
     * Gets the managed application definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managed application definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplicationDefinitionInner> getByResourceGroupWithResponse(
        String resourceGroupName, String applicationDefinitionName, Context context);

    /**
     * Deletes the managed application definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String applicationDefinitionName);

    /**
     * Deletes the managed application definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String applicationDefinitionName, Context context);

    /**
     * Deletes the managed application definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String applicationDefinitionName);

    /**
     * Deletes the managed application definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String applicationDefinitionName, Context context);

    /**
     * Creates a new managed application definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @param parameters Parameters supplied to the create or update an managed application definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about managed application definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ApplicationDefinitionInner>, ApplicationDefinitionInner> beginCreateOrUpdate(
        String resourceGroupName, String applicationDefinitionName, ApplicationDefinitionInner parameters);

    /**
     * Creates a new managed application definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @param parameters Parameters supplied to the create or update an managed application definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about managed application definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ApplicationDefinitionInner>, ApplicationDefinitionInner> beginCreateOrUpdate(
        String resourceGroupName,
        String applicationDefinitionName,
        ApplicationDefinitionInner parameters,
        Context context);

    /**
     * Creates a new managed application definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @param parameters Parameters supplied to the create or update an managed application definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about managed application definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationDefinitionInner createOrUpdate(
        String resourceGroupName, String applicationDefinitionName, ApplicationDefinitionInner parameters);

    /**
     * Creates a new managed application definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @param parameters Parameters supplied to the create or update an managed application definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about managed application definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationDefinitionInner createOrUpdate(
        String resourceGroupName,
        String applicationDefinitionName,
        ApplicationDefinitionInner parameters,
        Context context);

    /**
     * Lists the managed application definitions in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of managed application definitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplicationDefinitionInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists the managed application definitions in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of managed application definitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplicationDefinitionInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets the managed application definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managed application definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationDefinitionInner getById(String resourceGroupName, String applicationDefinitionName);

    /**
     * Gets the managed application definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managed application definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplicationDefinitionInner> getByIdWithResponse(
        String resourceGroupName, String applicationDefinitionName, Context context);

    /**
     * Deletes the managed application definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDeleteById(String resourceGroupName, String applicationDefinitionName);

    /**
     * Deletes the managed application definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDeleteById(
        String resourceGroupName, String applicationDefinitionName, Context context);

    /**
     * Deletes the managed application definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteById(String resourceGroupName, String applicationDefinitionName);

    /**
     * Deletes the managed application definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteById(String resourceGroupName, String applicationDefinitionName, Context context);

    /**
     * Creates a new managed application definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @param parameters Parameters supplied to the create or update a managed application definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about managed application definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ApplicationDefinitionInner>, ApplicationDefinitionInner> beginCreateOrUpdateById(
        String resourceGroupName, String applicationDefinitionName, ApplicationDefinitionInner parameters);

    /**
     * Creates a new managed application definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @param parameters Parameters supplied to the create or update a managed application definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about managed application definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ApplicationDefinitionInner>, ApplicationDefinitionInner> beginCreateOrUpdateById(
        String resourceGroupName,
        String applicationDefinitionName,
        ApplicationDefinitionInner parameters,
        Context context);

    /**
     * Creates a new managed application definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @param parameters Parameters supplied to the create or update a managed application definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about managed application definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationDefinitionInner createOrUpdateById(
        String resourceGroupName, String applicationDefinitionName, ApplicationDefinitionInner parameters);

    /**
     * Creates a new managed application definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @param parameters Parameters supplied to the create or update a managed application definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.managedapplications.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about managed application definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationDefinitionInner createOrUpdateById(
        String resourceGroupName,
        String applicationDefinitionName,
        ApplicationDefinitionInner parameters,
        Context context);
}
