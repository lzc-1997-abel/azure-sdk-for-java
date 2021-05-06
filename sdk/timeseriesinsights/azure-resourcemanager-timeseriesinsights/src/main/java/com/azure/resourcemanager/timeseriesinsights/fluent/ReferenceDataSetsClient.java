// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.timeseriesinsights.fluent.models.ReferenceDataSetListResponseInner;
import com.azure.resourcemanager.timeseriesinsights.fluent.models.ReferenceDataSetResourceInner;
import com.azure.resourcemanager.timeseriesinsights.models.ReferenceDataSetCreateOrUpdateParameters;
import com.azure.resourcemanager.timeseriesinsights.models.ReferenceDataSetUpdateParameters;

/** An instance of this class provides access to all the operations defined in ReferenceDataSetsClient. */
public interface ReferenceDataSetsClient {
    /**
     * Create or update a reference data set in the specified environment.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource
     *     group.
     * @param referenceDataSetName Name of the reference data set.
     * @param parameters Parameters for creating a reference data set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a reference data set provides metadata about the events in an environment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ReferenceDataSetResourceInner createOrUpdate(
        String resourceGroupName,
        String environmentName,
        String referenceDataSetName,
        ReferenceDataSetCreateOrUpdateParameters parameters);

    /**
     * Create or update a reference data set in the specified environment.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource
     *     group.
     * @param referenceDataSetName Name of the reference data set.
     * @param parameters Parameters for creating a reference data set.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a reference data set provides metadata about the events in an environment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ReferenceDataSetResourceInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String environmentName,
        String referenceDataSetName,
        ReferenceDataSetCreateOrUpdateParameters parameters,
        Context context);

    /**
     * Gets the reference data set with the specified name in the specified environment.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource
     *     group.
     * @param referenceDataSetName The name of the Time Series Insights reference data set associated with the specified
     *     environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the reference data set with the specified name in the specified environment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ReferenceDataSetResourceInner get(String resourceGroupName, String environmentName, String referenceDataSetName);

    /**
     * Gets the reference data set with the specified name in the specified environment.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource
     *     group.
     * @param referenceDataSetName The name of the Time Series Insights reference data set associated with the specified
     *     environment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the reference data set with the specified name in the specified environment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ReferenceDataSetResourceInner> getWithResponse(
        String resourceGroupName, String environmentName, String referenceDataSetName, Context context);

    /**
     * Updates the reference data set with the specified name in the specified subscription, resource group, and
     * environment.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource
     *     group.
     * @param referenceDataSetName The name of the Time Series Insights reference data set associated with the specified
     *     environment.
     * @param referenceDataSetUpdateParameters Request object that contains the updated information for the reference
     *     data set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a reference data set provides metadata about the events in an environment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ReferenceDataSetResourceInner update(
        String resourceGroupName,
        String environmentName,
        String referenceDataSetName,
        ReferenceDataSetUpdateParameters referenceDataSetUpdateParameters);

    /**
     * Updates the reference data set with the specified name in the specified subscription, resource group, and
     * environment.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource
     *     group.
     * @param referenceDataSetName The name of the Time Series Insights reference data set associated with the specified
     *     environment.
     * @param referenceDataSetUpdateParameters Request object that contains the updated information for the reference
     *     data set.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a reference data set provides metadata about the events in an environment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ReferenceDataSetResourceInner> updateWithResponse(
        String resourceGroupName,
        String environmentName,
        String referenceDataSetName,
        ReferenceDataSetUpdateParameters referenceDataSetUpdateParameters,
        Context context);

    /**
     * Deletes the reference data set with the specified name in the specified subscription, resource group, and
     * environment.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource
     *     group.
     * @param referenceDataSetName The name of the Time Series Insights reference data set associated with the specified
     *     environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String environmentName, String referenceDataSetName);

    /**
     * Deletes the reference data set with the specified name in the specified subscription, resource group, and
     * environment.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource
     *     group.
     * @param referenceDataSetName The name of the Time Series Insights reference data set associated with the specified
     *     environment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String environmentName, String referenceDataSetName, Context context);

    /**
     * Lists all the available reference data sets associated with the subscription and within the specified resource
     * group and environment.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource
     *     group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Reference Data Sets operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ReferenceDataSetListResponseInner listByEnvironment(String resourceGroupName, String environmentName);

    /**
     * Lists all the available reference data sets associated with the subscription and within the specified resource
     * group and environment.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource
     *     group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Reference Data Sets operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ReferenceDataSetListResponseInner> listByEnvironmentWithResponse(
        String resourceGroupName, String environmentName, Context context);
}
