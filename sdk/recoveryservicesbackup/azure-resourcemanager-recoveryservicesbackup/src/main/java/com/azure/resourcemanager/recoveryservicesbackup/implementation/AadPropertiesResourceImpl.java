// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.AadPropertiesResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.AadProperties;
import com.azure.resourcemanager.recoveryservicesbackup.models.AadPropertiesResource;
import java.util.Collections;
import java.util.Map;

public final class AadPropertiesResourceImpl implements AadPropertiesResource {
    private AadPropertiesResourceInner innerObject;

    private final com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager;

    AadPropertiesResourceImpl(
        AadPropertiesResourceInner innerObject,
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public AadProperties properties() {
        return this.innerModel().properties();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public AadPropertiesResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}
