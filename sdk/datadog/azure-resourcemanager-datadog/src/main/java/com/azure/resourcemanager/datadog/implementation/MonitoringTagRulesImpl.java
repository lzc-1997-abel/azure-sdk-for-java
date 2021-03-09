// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.datadog.fluent.models.MonitoringTagRulesInner;
import com.azure.resourcemanager.datadog.models.MonitoringTagRules;
import com.azure.resourcemanager.datadog.models.MonitoringTagRulesProperties;

public final class MonitoringTagRulesImpl
    implements MonitoringTagRules, MonitoringTagRules.Definition, MonitoringTagRules.Update {
    private MonitoringTagRulesInner innerObject;

    private final com.azure.resourcemanager.datadog.MicrosoftDatadogManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public MonitoringTagRulesProperties properties() {
        return this.innerModel().properties();
    }

    public MonitoringTagRulesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datadog.MicrosoftDatadogManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String monitorName;

    private String ruleSetName;

    public MonitoringTagRulesImpl withExistingMonitor(String resourceGroupName, String monitorName) {
        this.resourceGroupName = resourceGroupName;
        this.monitorName = monitorName;
        return this;
    }

    public MonitoringTagRules create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTagRules()
                .createOrUpdateWithResponse(
                    resourceGroupName, monitorName, ruleSetName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public MonitoringTagRules create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTagRules()
                .createOrUpdateWithResponse(resourceGroupName, monitorName, ruleSetName, this.innerModel(), context)
                .getValue();
        return this;
    }

    MonitoringTagRulesImpl(String name, com.azure.resourcemanager.datadog.MicrosoftDatadogManager serviceManager) {
        this.innerObject = new MonitoringTagRulesInner();
        this.serviceManager = serviceManager;
        this.ruleSetName = name;
    }

    public MonitoringTagRulesImpl update() {
        return this;
    }

    public MonitoringTagRules apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTagRules()
                .createOrUpdateWithResponse(
                    resourceGroupName, monitorName, ruleSetName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public MonitoringTagRules apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTagRules()
                .createOrUpdateWithResponse(resourceGroupName, monitorName, ruleSetName, this.innerModel(), context)
                .getValue();
        return this;
    }

    MonitoringTagRulesImpl(
        MonitoringTagRulesInner innerObject, com.azure.resourcemanager.datadog.MicrosoftDatadogManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.monitorName = Utils.getValueFromIdByName(innerObject.id(), "monitors");
        this.ruleSetName = Utils.getValueFromIdByName(innerObject.id(), "tagRules");
    }

    public MonitoringTagRules refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTagRules()
                .getWithResponse(resourceGroupName, monitorName, ruleSetName, Context.NONE)
                .getValue();
        return this;
    }

    public MonitoringTagRules refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTagRules()
                .getWithResponse(resourceGroupName, monitorName, ruleSetName, context)
                .getValue();
        return this;
    }

    public MonitoringTagRulesImpl withProperties(MonitoringTagRulesProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
