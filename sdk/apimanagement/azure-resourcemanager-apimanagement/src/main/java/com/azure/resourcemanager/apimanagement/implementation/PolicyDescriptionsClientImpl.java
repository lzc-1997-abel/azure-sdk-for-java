// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.PolicyDescriptionsClient;
import com.azure.resourcemanager.apimanagement.fluent.models.PolicyDescriptionCollectionInner;
import com.azure.resourcemanager.apimanagement.models.PolicyScopeContract;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in PolicyDescriptionsClient. */
public final class PolicyDescriptionsClientImpl implements PolicyDescriptionsClient {
    private final ClientLogger logger = new ClientLogger(PolicyDescriptionsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final PolicyDescriptionsService service;

    /** The service client containing this operation class. */
    private final ApiManagementClientImpl client;

    /**
     * Initializes an instance of PolicyDescriptionsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    PolicyDescriptionsClientImpl(ApiManagementClientImpl client) {
        this.service =
            RestProxy.create(PolicyDescriptionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ApiManagementClientPolicyDescriptions to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ApiManagementClientP")
    private interface PolicyDescriptionsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement"
                + "/service/{serviceName}/policyDescriptions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PolicyDescriptionCollectionInner>> listByService(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serviceName") String serviceName,
            @QueryParam("scope") PolicyScopeContract scope,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Lists all policy descriptions.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param scope Policy scope.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return descriptions of APIM policies.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PolicyDescriptionCollectionInner>> listByServiceWithResponseAsync(
        String resourceGroupName, String serviceName, PolicyScopeContract scope) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByService(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            serviceName,
                            scope,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Lists all policy descriptions.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param scope Policy scope.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return descriptions of APIM policies.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PolicyDescriptionCollectionInner>> listByServiceWithResponseAsync(
        String resourceGroupName, String serviceName, PolicyScopeContract scope, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByService(
                this.client.getEndpoint(),
                resourceGroupName,
                serviceName,
                scope,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                accept,
                context);
    }

    /**
     * Lists all policy descriptions.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param scope Policy scope.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return descriptions of APIM policies.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PolicyDescriptionCollectionInner> listByServiceAsync(
        String resourceGroupName, String serviceName, PolicyScopeContract scope) {
        return listByServiceWithResponseAsync(resourceGroupName, serviceName, scope)
            .flatMap(
                (Response<PolicyDescriptionCollectionInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Lists all policy descriptions.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return descriptions of APIM policies.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PolicyDescriptionCollectionInner> listByServiceAsync(String resourceGroupName, String serviceName) {
        final PolicyScopeContract scope = null;
        return listByServiceWithResponseAsync(resourceGroupName, serviceName, scope)
            .flatMap(
                (Response<PolicyDescriptionCollectionInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Lists all policy descriptions.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return descriptions of APIM policies.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PolicyDescriptionCollectionInner listByService(String resourceGroupName, String serviceName) {
        final PolicyScopeContract scope = null;
        return listByServiceAsync(resourceGroupName, serviceName, scope).block();
    }

    /**
     * Lists all policy descriptions.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param scope Policy scope.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return descriptions of APIM policies.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PolicyDescriptionCollectionInner> listByServiceWithResponse(
        String resourceGroupName, String serviceName, PolicyScopeContract scope, Context context) {
        return listByServiceWithResponseAsync(resourceGroupName, serviceName, scope, context).block();
    }
}
