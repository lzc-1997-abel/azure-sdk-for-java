// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.streamanalytics.fluent.models.OutputInner;

/** Resource collection API of Outputs. */
public interface Outputs {
    /**
     * Deletes an output from the streaming job.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param outputName The name of the output.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String jobName, String outputName);

    /**
     * Deletes an output from the streaming job.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param outputName The name of the output.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String jobName, String outputName, Context context);

    /**
     * Gets details about the specified output.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param outputName The name of the output.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about the specified output.
     */
    Output get(String resourceGroupName, String jobName, String outputName);

    /**
     * Gets details about the specified output.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param outputName The name of the output.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about the specified output.
     */
    Response<Output> getWithResponse(String resourceGroupName, String jobName, String outputName, Context context);

    /**
     * Lists all of the outputs under the specified streaming job.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object containing a list of outputs under a streaming job.
     */
    PagedIterable<Output> listByStreamingJob(String resourceGroupName, String jobName);

    /**
     * Lists all of the outputs under the specified streaming job.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param select The $select OData query parameter. This is a comma-separated list of structural properties to
     *     include in the response, or "*" to include all properties. By default, all properties are returned except
     *     diagnostics. Currently only accepts '*' as a valid value.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object containing a list of outputs under a streaming job.
     */
    PagedIterable<Output> listByStreamingJob(String resourceGroupName, String jobName, String select, Context context);

    /**
     * Tests whether an output’s datasource is reachable and usable by the Azure Stream Analytics service.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param outputName The name of the output.
     * @param output If the output specified does not already exist, this parameter must contain the full output
     *     definition intended to be tested. If the output specified already exists, this parameter can be left null to
     *     test the existing output as is or if specified, the properties specified will overwrite the corresponding
     *     properties in the existing output (exactly like a PATCH operation) and the resulting output will be tested.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the status of the test operation along with error information, if applicable.
     */
    ResourceTestStatus test(String resourceGroupName, String jobName, String outputName, OutputInner output);

    /**
     * Tests whether an output’s datasource is reachable and usable by the Azure Stream Analytics service.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param outputName The name of the output.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the status of the test operation along with error information, if applicable.
     */
    ResourceTestStatus test(String resourceGroupName, String jobName, String outputName);

    /**
     * Tests whether an output’s datasource is reachable and usable by the Azure Stream Analytics service.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param outputName The name of the output.
     * @param output If the output specified does not already exist, this parameter must contain the full output
     *     definition intended to be tested. If the output specified already exists, this parameter can be left null to
     *     test the existing output as is or if specified, the properties specified will overwrite the corresponding
     *     properties in the existing output (exactly like a PATCH operation) and the resulting output will be tested.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the status of the test operation along with error information, if applicable.
     */
    ResourceTestStatus test(
        String resourceGroupName, String jobName, String outputName, OutputInner output, Context context);

    /**
     * Gets details about the specified output.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about the specified output.
     */
    Output getById(String id);

    /**
     * Gets details about the specified output.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about the specified output.
     */
    Response<Output> getByIdWithResponse(String id, Context context);

    /**
     * Deletes an output from the streaming job.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes an output from the streaming job.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Output resource.
     *
     * @param name resource name.
     * @return the first stage of the new Output definition.
     */
    Output.DefinitionStages.Blank define(String name);
}
