/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerservice.v2020_09_01.implementation.ContainerServiceManager;
import com.microsoft.azure.management.containerservice.v2020_09_01.implementation.OperationValueInner;

/**
 * Type representing OperationValue.
 */
public interface OperationValue extends HasInner<OperationValueInner>, HasManager<ContainerServiceManager> {
    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the operation value.
     */
    String operation();

    /**
     * @return the origin value.
     */
    String origin();

    /**
     * @return the provider value.
     */
    String provider();

    /**
     * @return the resource value.
     */
    String resource();

}
