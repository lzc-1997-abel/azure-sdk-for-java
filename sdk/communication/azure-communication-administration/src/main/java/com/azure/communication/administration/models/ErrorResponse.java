// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.administration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ErrorResponse model. */
@Fluent
public final class ErrorResponse {
    /*
     * Represents a service error response body.
     */
    @JsonProperty(value = "error")
    private ErrorBody error;

    /**
     * Get the error property: Represents a service error response body.
     *
     * @return the error value.
     */
    public ErrorBody getError() {
        return this.error;
    }

    /**
     * Set the error property: Represents a service error response body.
     *
     * @param error the error value to set.
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse setError(ErrorBody error) {
        this.error = error;
        return this;
    }
}
