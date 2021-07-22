// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.resourcemanager.security.fluent.models.DiscoveredSecuritySolutionInner;
import com.azure.resourcemanager.security.models.DiscoveredSecuritySolution;
import com.azure.resourcemanager.security.models.SecurityFamily;

public final class DiscoveredSecuritySolutionImpl implements DiscoveredSecuritySolution {
    private DiscoveredSecuritySolutionInner innerObject;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    DiscoveredSecuritySolutionImpl(
        DiscoveredSecuritySolutionInner innerObject,
        com.azure.resourcemanager.security.SecurityManager serviceManager) {
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

    public SecurityFamily securityFamily() {
        return this.innerModel().securityFamily();
    }

    public String offer() {
        return this.innerModel().offer();
    }

    public String publisher() {
        return this.innerModel().publisher();
    }

    public String sku() {
        return this.innerModel().sku();
    }

    public String location() {
        return this.innerModel().location();
    }

    public DiscoveredSecuritySolutionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}
