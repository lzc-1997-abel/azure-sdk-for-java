// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.apimanagement.fluent.models.SchemaContractInner;

/** Contains all response data for the get operation. */
public final class ApiSchemasGetResponse extends ResponseBase<ApiSchemasGetHeaders, SchemaContractInner> {
    /**
     * Creates an instance of ApiSchemasGetResponse.
     *
     * @param request the request which resulted in this ApiSchemasGetResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public ApiSchemasGetResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        SchemaContractInner value,
        ApiSchemasGetHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public SchemaContractInner getValue() {
        return super.getValue();
    }
}
