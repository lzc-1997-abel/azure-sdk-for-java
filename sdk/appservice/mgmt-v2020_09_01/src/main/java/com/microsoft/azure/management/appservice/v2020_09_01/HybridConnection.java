/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2020_09_01.implementation.HybridConnectionInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2020_09_01.implementation.AppServiceManager;

/**
 * Type representing HybridConnection.
 */
public interface HybridConnection extends HasInner<HybridConnectionInner>, HasManager<AppServiceManager> {
    /**
     * @return the hostname value.
     */
    String hostname();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the port value.
     */
    Integer port();

    /**
     * @return the relayArmUri value.
     */
    String relayArmUri();

    /**
     * @return the relayName value.
     */
    String relayName();

    /**
     * @return the sendKeyName value.
     */
    String sendKeyName();

    /**
     * @return the sendKeyValue value.
     */
    String sendKeyValue();

    /**
     * @return the serviceBusNamespace value.
     */
    String serviceBusNamespace();

    /**
     * @return the serviceBusSuffix value.
     */
    String serviceBusSuffix();

    /**
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * @return the type value.
     */
    String type();

}
