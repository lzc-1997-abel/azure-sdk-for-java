// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.DiagnosticContractInner;

/** An instance of this class provides access to all the operations defined in DiagnosticsClient. */
public interface DiagnosticsClient {
    /**
     * Lists all diagnostics of the API Management service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Diagnostic list representation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DiagnosticContractInner> listByService(String resourceGroupName, String serviceName);

    /**
     * Lists all diagnostics of the API Management service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param filter | Field | Usage | Supported operators | Supported functions
     *     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| name | filter | ge, le, eq,
     *     ne, gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;.
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Diagnostic list representation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DiagnosticContractInner> listByService(
        String resourceGroupName, String serviceName, String filter, Integer top, Integer skip, Context context);

    /**
     * Gets the entity state (Etag) version of the Diagnostic specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param diagnosticId Diagnostic identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void getEntityTag(String resourceGroupName, String serviceName, String diagnosticId);

    /**
     * Gets the entity state (Etag) version of the Diagnostic specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param diagnosticId Diagnostic identifier. Must be unique in the current API Management service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the entity state (Etag) version of the Diagnostic specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> getEntityTagWithResponse(
        String resourceGroupName, String serviceName, String diagnosticId, Context context);

    /**
     * Gets the details of the Diagnostic specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param diagnosticId Diagnostic identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the Diagnostic specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiagnosticContractInner get(String resourceGroupName, String serviceName, String diagnosticId);

    /**
     * Gets the details of the Diagnostic specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param diagnosticId Diagnostic identifier. Must be unique in the current API Management service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the Diagnostic specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DiagnosticContractInner> getWithResponse(
        String resourceGroupName, String serviceName, String diagnosticId, Context context);

    /**
     * Creates a new Diagnostic or updates an existing one.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param diagnosticId Diagnostic identifier. Must be unique in the current API Management service instance.
     * @param parameters Create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return diagnostic details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiagnosticContractInner createOrUpdate(
        String resourceGroupName, String serviceName, String diagnosticId, DiagnosticContractInner parameters);

    /**
     * Creates a new Diagnostic or updates an existing one.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param diagnosticId Diagnostic identifier. Must be unique in the current API Management service instance.
     * @param parameters Create parameters.
     * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return diagnostic details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DiagnosticContractInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String serviceName,
        String diagnosticId,
        DiagnosticContractInner parameters,
        String ifMatch,
        Context context);

    /**
     * Updates the details of the Diagnostic specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param diagnosticId Diagnostic identifier. Must be unique in the current API Management service instance.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters Diagnostic Update parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return diagnostic details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiagnosticContractInner update(
        String resourceGroupName,
        String serviceName,
        String diagnosticId,
        String ifMatch,
        DiagnosticContractInner parameters);

    /**
     * Updates the details of the Diagnostic specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param diagnosticId Diagnostic identifier. Must be unique in the current API Management service instance.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters Diagnostic Update parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return diagnostic details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DiagnosticContractInner> updateWithResponse(
        String resourceGroupName,
        String serviceName,
        String diagnosticId,
        String ifMatch,
        DiagnosticContractInner parameters,
        Context context);

    /**
     * Deletes the specified Diagnostic.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param diagnosticId Diagnostic identifier. Must be unique in the current API Management service instance.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serviceName, String diagnosticId, String ifMatch);

    /**
     * Deletes the specified Diagnostic.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param diagnosticId Diagnostic identifier. Must be unique in the current API Management service instance.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String serviceName, String diagnosticId, String ifMatch, Context context);
}
