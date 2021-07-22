// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.resourcemanager.security.fluent.models.PricingInner;
import com.azure.resourcemanager.security.fluent.models.PricingListInner;
import com.azure.resourcemanager.security.models.Pricing;
import com.azure.resourcemanager.security.models.PricingList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class PricingListImpl implements PricingList {
    private PricingListInner innerObject;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    PricingListImpl(PricingListInner innerObject, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<Pricing> value() {
        List<PricingInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner.stream().map(inner1 -> new PricingImpl(inner1, this.manager())).collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public PricingListInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}
