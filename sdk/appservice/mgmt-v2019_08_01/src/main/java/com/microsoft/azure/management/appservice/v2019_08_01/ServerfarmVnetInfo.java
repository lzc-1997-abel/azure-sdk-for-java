/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2019_08_01.implementation.VnetInfoInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2019_08_01.implementation.AppServiceManager;
import java.util.List;

/**
 * Type representing ServerfarmVnetInfo.
 */
public interface ServerfarmVnetInfo extends HasInner<VnetInfoInner>, Indexable, Refreshable<ServerfarmVnetInfo>, HasManager<AppServiceManager> {
    /**
     * @return the certBlob value.
     */
    String certBlob();

    /**
     * @return the certThumbprint value.
     */
    String certThumbprint();

    /**
     * @return the dnsServers value.
     */
    String dnsServers();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the isSwift value.
     */
    Boolean isSwift();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the resyncRequired value.
     */
    Boolean resyncRequired();

    /**
     * @return the routes value.
     */
    List<VnetRoute> routes();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the vnetResourceId value.
     */
    String vnetResourceId();

}
