// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption;

import com.azure.core.util.Context;

/** Samples for LotsOperation List. */
public final class LotsOperationListSamples {
    /**
     * Sample code: LotsList-Modern.
     *
     * @param consumptionManager Entry point to ConsumptionManager. Consumption management client provides access to
     *     consumption resources for Azure Enterprise Subscriptions.
     */
    public static void lotsListModern(com.azure.resourcemanager.consumption.ConsumptionManager consumptionManager) {
        consumptionManager
            .lotsOperations()
            .list("providers/Microsoft.Billing/billingAccounts/1234:5678/customers/2468", Context.NONE);
    }

    /**
     * Sample code: LotsListByBillingProfile.
     *
     * @param consumptionManager Entry point to ConsumptionManager. Consumption management client provides access to
     *     consumption resources for Azure Enterprise Subscriptions.
     */
    public static void lotsListByBillingProfile(
        com.azure.resourcemanager.consumption.ConsumptionManager consumptionManager) {
        consumptionManager
            .lotsOperations()
            .list("providers/Microsoft.Billing/billingAccounts/1234:5678/billingProfiles/2468", Context.NONE);
    }
}
