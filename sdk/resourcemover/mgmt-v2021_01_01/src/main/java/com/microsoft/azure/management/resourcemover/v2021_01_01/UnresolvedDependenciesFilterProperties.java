/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcemover.v2021_01_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The UnresolvedDependenciesFilterProperties model.
 */
public class UnresolvedDependenciesFilterProperties {
    /**
     * The count of the resource.
     */
    @JsonProperty(value = "count")
    private Integer count;

    /**
     * Get the count of the resource.
     *
     * @return the count value
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Set the count of the resource.
     *
     * @param count the count value to set
     * @return the UnresolvedDependenciesFilterProperties object itself.
     */
    public UnresolvedDependenciesFilterProperties withCount(Integer count) {
        this.count = count;
        return this;
    }

}
