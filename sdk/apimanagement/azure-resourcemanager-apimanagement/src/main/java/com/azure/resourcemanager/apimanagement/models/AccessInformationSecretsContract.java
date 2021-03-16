// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.resourcemanager.apimanagement.fluent.models.AccessInformationSecretsContractInner;

/** An immutable client-side representation of AccessInformationSecretsContract. */
public interface AccessInformationSecretsContract {
    /**
     * Gets the id property: Access Information type ('access' or 'gitAccess').
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the principalId property: Principal (User) Identifier.
     *
     * @return the principalId value.
     */
    String principalId();

    /**
     * Gets the primaryKey property: Primary access key. This property will not be filled on 'GET' operations! Use
     * '/listSecrets' POST request to get the value.
     *
     * @return the primaryKey value.
     */
    String primaryKey();

    /**
     * Gets the secondaryKey property: Secondary access key. This property will not be filled on 'GET' operations! Use
     * '/listSecrets' POST request to get the value.
     *
     * @return the secondaryKey value.
     */
    String secondaryKey();

    /**
     * Gets the enabled property: Determines whether direct access is enabled.
     *
     * @return the enabled value.
     */
    Boolean enabled();

    /**
     * Gets the inner com.azure.resourcemanager.apimanagement.fluent.models.AccessInformationSecretsContractInner
     * object.
     *
     * @return the inner object.
     */
    AccessInformationSecretsContractInner innerModel();
}
