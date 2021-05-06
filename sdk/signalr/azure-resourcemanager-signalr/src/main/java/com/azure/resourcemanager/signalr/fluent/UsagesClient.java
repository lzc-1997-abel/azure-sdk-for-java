// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.signalr.fluent.models.SignalRUsageInner;

/** An instance of this class provides access to all the operations defined in UsagesClient. */
public interface UsagesClient {
    /**
     * List resource usage quotas by location.
     *
     * @param location the location like "eastus".
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of the resource usages and a possible link for next set.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SignalRUsageInner> list(String location);

    /**
     * List resource usage quotas by location.
     *
     * @param location the location like "eastus".
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of the resource usages and a possible link for next set.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SignalRUsageInner> list(String location, Context context);
}
