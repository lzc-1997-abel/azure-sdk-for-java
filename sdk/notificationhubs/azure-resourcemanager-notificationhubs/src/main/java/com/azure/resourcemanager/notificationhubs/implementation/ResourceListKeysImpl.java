// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.implementation;

import com.azure.resourcemanager.notificationhubs.fluent.models.ResourceListKeysInner;
import com.azure.resourcemanager.notificationhubs.models.ResourceListKeys;

public final class ResourceListKeysImpl implements ResourceListKeys {
    private ResourceListKeysInner innerObject;

    private final com.azure.resourcemanager.notificationhubs.NotificationHubsManager serviceManager;

    ResourceListKeysImpl(
        ResourceListKeysInner innerObject,
        com.azure.resourcemanager.notificationhubs.NotificationHubsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String primaryConnectionString() {
        return this.innerModel().primaryConnectionString();
    }

    public String secondaryConnectionString() {
        return this.innerModel().secondaryConnectionString();
    }

    public String primaryKey() {
        return this.innerModel().primaryKey();
    }

    public String secondaryKey() {
        return this.innerModel().secondaryKey();
    }

    public String keyName() {
        return this.innerModel().keyName();
    }

    public ResourceListKeysInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.notificationhubs.NotificationHubsManager manager() {
        return this.serviceManager;
    }
}
