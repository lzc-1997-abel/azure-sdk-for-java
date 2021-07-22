// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql;

import com.azure.core.util.Context;

/** Samples for FirewallRules Delete. */
public final class FirewallRulesDeleteSamples {
    /**
     * Sample code: FirewallRuleDelete.
     *
     * @param postgreSqlManager Entry point to PostgreSqlManager. The Microsoft Azure management API provides create,
     *     read, update, and delete functionality for Azure PostgreSQL resources including servers, databases, firewall
     *     rules, VNET rules, security alert policies, log files and configurations with new business model.
     */
    public static void firewallRuleDelete(com.azure.resourcemanager.postgresql.PostgreSqlManager postgreSqlManager) {
        postgreSqlManager.firewallRules().delete("TestGroup", "testserver", "rule1", Context.NONE);
    }
}
