// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.policyinsights.models.ComponentEventDetails;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Policy event record. */
@Fluent
public final class PolicyEventInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PolicyEventInner.class);

    /*
     * OData entity ID; always set to null since policy event records do not
     * have an entity ID.
     */
    @JsonProperty(value = "@odata.id")
    private String odataId;

    /*
     * OData context string; used by OData clients to resolve type information
     * based on metadata.
     */
    @JsonProperty(value = "@odata.context")
    private String odataContext;

    /*
     * Timestamp for the policy event record.
     */
    @JsonProperty(value = "timestamp")
    private OffsetDateTime timestamp;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /*
     * Policy assignment ID.
     */
    @JsonProperty(value = "policyAssignmentId")
    private String policyAssignmentId;

    /*
     * Policy definition ID.
     */
    @JsonProperty(value = "policyDefinitionId")
    private String policyDefinitionId;

    /*
     * Effective parameters for the policy assignment.
     */
    @JsonProperty(value = "effectiveParameters")
    private String effectiveParameters;

    /*
     * Flag which states whether the resource is compliant against the policy
     * assignment it was evaluated against.
     */
    @JsonProperty(value = "isCompliant")
    private Boolean isCompliant;

    /*
     * Subscription ID.
     */
    @JsonProperty(value = "subscriptionId")
    private String subscriptionId;

    /*
     * Resource type.
     */
    @JsonProperty(value = "resourceType")
    private String resourceType;

    /*
     * Resource location.
     */
    @JsonProperty(value = "resourceLocation")
    private String resourceLocation;

    /*
     * Resource group name.
     */
    @JsonProperty(value = "resourceGroup")
    private String resourceGroup;

    /*
     * List of resource tags.
     */
    @JsonProperty(value = "resourceTags")
    private String resourceTags;

    /*
     * Policy assignment name.
     */
    @JsonProperty(value = "policyAssignmentName")
    private String policyAssignmentName;

    /*
     * Policy assignment owner.
     */
    @JsonProperty(value = "policyAssignmentOwner")
    private String policyAssignmentOwner;

    /*
     * Policy assignment parameters.
     */
    @JsonProperty(value = "policyAssignmentParameters")
    private String policyAssignmentParameters;

    /*
     * Policy assignment scope.
     */
    @JsonProperty(value = "policyAssignmentScope")
    private String policyAssignmentScope;

    /*
     * Policy definition name.
     */
    @JsonProperty(value = "policyDefinitionName")
    private String policyDefinitionName;

    /*
     * Policy definition action, i.e. effect.
     */
    @JsonProperty(value = "policyDefinitionAction")
    private String policyDefinitionAction;

    /*
     * Policy definition category.
     */
    @JsonProperty(value = "policyDefinitionCategory")
    private String policyDefinitionCategory;

    /*
     * Policy set definition ID, if the policy assignment is for a policy set.
     */
    @JsonProperty(value = "policySetDefinitionId")
    private String policySetDefinitionId;

    /*
     * Policy set definition name, if the policy assignment is for a policy
     * set.
     */
    @JsonProperty(value = "policySetDefinitionName")
    private String policySetDefinitionName;

    /*
     * Policy set definition owner, if the policy assignment is for a policy
     * set.
     */
    @JsonProperty(value = "policySetDefinitionOwner")
    private String policySetDefinitionOwner;

    /*
     * Policy set definition category, if the policy assignment is for a policy
     * set.
     */
    @JsonProperty(value = "policySetDefinitionCategory")
    private String policySetDefinitionCategory;

    /*
     * Policy set definition parameters, if the policy assignment is for a
     * policy set.
     */
    @JsonProperty(value = "policySetDefinitionParameters")
    private String policySetDefinitionParameters;

    /*
     * Comma separated list of management group IDs, which represent the
     * hierarchy of the management groups the resource is under.
     */
    @JsonProperty(value = "managementGroupIds")
    private String managementGroupIds;

    /*
     * Reference ID for the policy definition inside the policy set, if the
     * policy assignment is for a policy set.
     */
    @JsonProperty(value = "policyDefinitionReferenceId")
    private String policyDefinitionReferenceId;

    /*
     * Compliance state of the resource.
     */
    @JsonProperty(value = "complianceState")
    private String complianceState;

    /*
     * Tenant ID for the policy event record.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /*
     * Principal object ID for the user who initiated the resource operation
     * that triggered the policy event.
     */
    @JsonProperty(value = "principalOid")
    private String principalOid;

    /*
     * Components events records populated only when URL contains
     * $expand=components clause.
     */
    @JsonProperty(value = "components")
    private List<ComponentEventDetails> components;

    /*
     * Policy event record.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the odataId property: OData entity ID; always set to null since policy event records do not have an entity
     * ID.
     *
     * @return the odataId value.
     */
    public String odataId() {
        return this.odataId;
    }

    /**
     * Set the odataId property: OData entity ID; always set to null since policy event records do not have an entity
     * ID.
     *
     * @param odataId the odataId value to set.
     * @return the PolicyEventInner object itself.
     */
    public PolicyEventInner withOdataId(String odataId) {
        this.odataId = odataId;
        return this;
    }

    /**
     * Get the odataContext property: OData context string; used by OData clients to resolve type information based on
     * metadata.
     *
     * @return the odataContext value.
     */
    public String odataContext() {
        return this.odataContext;
    }

    /**
     * Set the odataContext property: OData context string; used by OData clients to resolve type information based on
     * metadata.
     *
     * @param odataContext the odataContext value to set.
     * @return the PolicyEventInner object itself.
     */
    public PolicyEventInner withOdataContext(String odataContext) {
        this.odataContext = odataContext;
        return this;
    }

    /**
     * Get the timestamp property: Timestamp for the policy event record.
     *
     * @return the timestamp value.
     */
    public OffsetDateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Set the timestamp property: Timestamp for the policy event record.
     *
     * @param timestamp the timestamp value to set.
     * @return the PolicyEventInner object itself.
     */
    public PolicyEventInner withTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get the resourceId property: Resource ID.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: Resource ID.
     *
     * @param resourceId the resourceId value to set.
     * @return the PolicyEventInner object itself.
     */
    public PolicyEventInner withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the policyAssignmentId property: Policy assignment ID.
     *
     * @return the policyAssignmentId value.
     */
    public String policyAssignmentId() {
        return this.policyAssignmentId;
    }

    /**
     * Set the policyAssignmentId property: Policy assignment ID.
     *
     * @param policyAssignmentId the policyAssignmentId value to set.
     * @return the PolicyEventInner object itself.
     */
    public PolicyEventInner withPolicyAssignmentId(String policyAssignmentId) {
        this.policyAssignmentId = policyAssignmentId;
        return this;
    }

    /**
     * Get the policyDefinitionId property: Policy definition ID.
     *
     * @return the policyDefinitionId value.
     */
    public String policyDefinitionId() {
        return this.policyDefinitionId;
    }

    /**
     * Set the policyDefinitionId property: Policy definition ID.
     *
     * @param policyDefinitionId the policyDefinitionId value to set.
     * @return the PolicyEventInner object itself.
     */
    public PolicyEventInner withPolicyDefinitionId(String policyDefinitionId) {
        this.policyDefinitionId = policyDefinitionId;
        return this;
    }

    /**
     * Get the effectiveParameters property: Effective parameters for the policy assignment.
     *
     * @return the effectiveParameters value.
     */
    public String effectiveParameters() {
        return this.effectiveParameters;
    }

    /**
     * Set the effectiveParameters property: Effective parameters for the policy assignment.
     *
     * @param effectiveParameters the effectiveParameters value to set.
     * @return the PolicyEventInner object itself.
     */
    public PolicyEventInner withEffectiveParameters(String effectiveParameters) {
        this.effectiveParameters = effectiveParameters;
        return this;
    }

    /**
     * Get the isCompliant property: Flag which states whether the resource is compliant against the policy assignment
     * it was evaluated against.
     *
     * @return the isCompliant value.
     */
    public Boolean isCompliant() {
        return this.isCompliant;
    }

    /**
     * Set the isCompliant property: Flag which states whether the resource is compliant against the policy assignment
     * it was evaluated against.
     *
     * @param isCompliant the isCompliant value to set.
     * @return the PolicyEventInner object itself.
     */
    public PolicyEventInner withIsCompliant(Boolean isCompliant) {
        this.isCompliant = isCompliant;
        return this;
    }

    /**
     * Get the subscriptionId property: Subscription ID.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: Subscription ID.
     *
     * @param subscriptionId the subscriptionId value to set.
     * @return the PolicyEventInner object itself.
     */
    public PolicyEventInner withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the resourceType property: Resource type.
     *
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: Resource type.
     *
     * @param resourceType the resourceType value to set.
     * @return the PolicyEventInner object itself.
     */
    public PolicyEventInner withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the resourceLocation property: Resource location.
     *
     * @return the resourceLocation value.
     */
    public String resourceLocation() {
        return this.resourceLocation;
    }

    /**
     * Set the resourceLocation property: Resource location.
     *
     * @param resourceLocation the resourceLocation value to set.
     * @return the PolicyEventInner object itself.
     */
    public PolicyEventInner withResourceLocation(String resourceLocation) {
        this.resourceLocation = resourceLocation;
        return this;
    }

    /**
     * Get the resourceGroup property: Resource group name.
     *
     * @return the resourceGroup value.
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Set the resourceGroup property: Resource group name.
     *
     * @param resourceGroup the resourceGroup value to set.
     * @return the PolicyEventInner object itself.
     */
    public PolicyEventInner withResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }

    /**
     * Get the resourceTags property: List of resource tags.
     *
     * @return the resourceTags value.
     */
    public String resourceTags() {
        return this.resourceTags;
    }

    /**
     * Set the resourceTags property: List of resource tags.
     *
     * @param resourceTags the resourceTags value to set.
     * @return the PolicyEventInner object itself.
     */
    public PolicyEventInner withResourceTags(String resourceTags) {
        this.resourceTags = resourceTags;
        return this;
    }

    /**
     * Get the policyAssignmentName property: Policy assignment name.
     *
     * @return the policyAssignmentName value.
     */
    public String policyAssignmentName() {
        return this.policyAssignmentName;
    }

    /**
     * Set the policyAssignmentName property: Policy assignment name.
     *
     * @param policyAssignmentName the policyAssignmentName value to set.
     * @return the PolicyEventInner object itself.
     */
    public PolicyEventInner withPolicyAssignmentName(String policyAssignmentName) {
        this.policyAssignmentName = policyAssignmentName;
        return this;
    }

    /**
     * Get the policyAssignmentOwner property: Policy assignment owner.
     *
     * @return the policyAssignmentOwner value.
     */
    public String policyAssignmentOwner() {
        return this.policyAssignmentOwner;
    }

    /**
     * Set the policyAssignmentOwner property: Policy assignment owner.
     *
     * @param policyAssignmentOwner the policyAssignmentOwner value to set.
     * @return the PolicyEventInner object itself.
     */
    public PolicyEventInner withPolicyAssignmentOwner(String policyAssignmentOwner) {
        this.policyAssignmentOwner = policyAssignmentOwner;
        return this;
    }

    /**
     * Get the policyAssignmentParameters property: Policy assignment parameters.
     *
     * @return the policyAssignmentParameters value.
     */
    public String policyAssignmentParameters() {
        return this.policyAssignmentParameters;
    }

    /**
     * Set the policyAssignmentParameters property: Policy assignment parameters.
     *
     * @param policyAssignmentParameters the policyAssignmentParameters value to set.
     * @return the PolicyEventInner object itself.
     */
    public PolicyEventInner withPolicyAssignmentParameters(String policyAssignmentParameters) {
        this.policyAssignmentParameters = policyAssignmentParameters;
        return this;
    }

    /**
     * Get the policyAssignmentScope property: Policy assignment scope.
     *
     * @return the policyAssignmentScope value.
     */
    public String policyAssignmentScope() {
        return this.policyAssignmentScope;
    }

    /**
     * Set the policyAssignmentScope property: Policy assignment scope.
     *
     * @param policyAssignmentScope the policyAssignmentScope value to set.
     * @return the PolicyEventInner object itself.
     */
    public PolicyEventInner withPolicyAssignmentScope(String policyAssignmentScope) {
        this.policyAssignmentScope = policyAssignmentScope;
        return this;
    }

    /**
     * Get the policyDefinitionName property: Policy definition name.
     *
     * @return the policyDefinitionName value.
     */
    public String policyDefinitionName() {
        return this.policyDefinitionName;
    }

    /**
     * Set the policyDefinitionName property: Policy definition name.
     *
     * @param policyDefinitionName the policyDefinitionName value to set.
     * @return the PolicyEventInner object itself.
     */
    public PolicyEventInner withPolicyDefinitionName(String policyDefinitionName) {
        this.policyDefinitionName = policyDefinitionName;
        return this;
    }

    /**
     * Get the policyDefinitionAction property: Policy definition action, i.e. effect.
     *
     * @return the policyDefinitionAction value.
     */
    public String policyDefinitionAction() {
        return this.policyDefinitionAction;
    }

    /**
     * Set the policyDefinitionAction property: Policy definition action, i.e. effect.
     *
     * @param policyDefinitionAction the policyDefinitionAction value to set.
     * @return the PolicyEventInner object itself.
     */
    public PolicyEventInner withPolicyDefinitionAction(String policyDefinitionAction) {
        this.policyDefinitionAction = policyDefinitionAction;
        return this;
    }

    /**
     * Get the policyDefinitionCategory property: Policy definition category.
     *
     * @return the policyDefinitionCategory value.
     */
    public String policyDefinitionCategory() {
        return this.policyDefinitionCategory;
    }

    /**
     * Set the policyDefinitionCategory property: Policy definition category.
     *
     * @param policyDefinitionCategory the policyDefinitionCategory value to set.
     * @return the PolicyEventInner object itself.
     */
    public PolicyEventInner withPolicyDefinitionCategory(String policyDefinitionCategory) {
        this.policyDefinitionCategory = policyDefinitionCategory;
        return this;
    }

    /**
     * Get the policySetDefinitionId property: Policy set definition ID, if the policy assignment is for a policy set.
     *
     * @return the policySetDefinitionId value.
     */
    public String policySetDefinitionId() {
        return this.policySetDefinitionId;
    }

    /**
     * Set the policySetDefinitionId property: Policy set definition ID, if the policy assignment is for a policy set.
     *
     * @param policySetDefinitionId the policySetDefinitionId value to set.
     * @return the PolicyEventInner object itself.
     */
    public PolicyEventInner withPolicySetDefinitionId(String policySetDefinitionId) {
        this.policySetDefinitionId = policySetDefinitionId;
        return this;
    }

    /**
     * Get the policySetDefinitionName property: Policy set definition name, if the policy assignment is for a policy
     * set.
     *
     * @return the policySetDefinitionName value.
     */
    public String policySetDefinitionName() {
        return this.policySetDefinitionName;
    }

    /**
     * Set the policySetDefinitionName property: Policy set definition name, if the policy assignment is for a policy
     * set.
     *
     * @param policySetDefinitionName the policySetDefinitionName value to set.
     * @return the PolicyEventInner object itself.
     */
    public PolicyEventInner withPolicySetDefinitionName(String policySetDefinitionName) {
        this.policySetDefinitionName = policySetDefinitionName;
        return this;
    }

    /**
     * Get the policySetDefinitionOwner property: Policy set definition owner, if the policy assignment is for a policy
     * set.
     *
     * @return the policySetDefinitionOwner value.
     */
    public String policySetDefinitionOwner() {
        return this.policySetDefinitionOwner;
    }

    /**
     * Set the policySetDefinitionOwner property: Policy set definition owner, if the policy assignment is for a policy
     * set.
     *
     * @param policySetDefinitionOwner the policySetDefinitionOwner value to set.
     * @return the PolicyEventInner object itself.
     */
    public PolicyEventInner withPolicySetDefinitionOwner(String policySetDefinitionOwner) {
        this.policySetDefinitionOwner = policySetDefinitionOwner;
        return this;
    }

    /**
     * Get the policySetDefinitionCategory property: Policy set definition category, if the policy assignment is for a
     * policy set.
     *
     * @return the policySetDefinitionCategory value.
     */
    public String policySetDefinitionCategory() {
        return this.policySetDefinitionCategory;
    }

    /**
     * Set the policySetDefinitionCategory property: Policy set definition category, if the policy assignment is for a
     * policy set.
     *
     * @param policySetDefinitionCategory the policySetDefinitionCategory value to set.
     * @return the PolicyEventInner object itself.
     */
    public PolicyEventInner withPolicySetDefinitionCategory(String policySetDefinitionCategory) {
        this.policySetDefinitionCategory = policySetDefinitionCategory;
        return this;
    }

    /**
     * Get the policySetDefinitionParameters property: Policy set definition parameters, if the policy assignment is for
     * a policy set.
     *
     * @return the policySetDefinitionParameters value.
     */
    public String policySetDefinitionParameters() {
        return this.policySetDefinitionParameters;
    }

    /**
     * Set the policySetDefinitionParameters property: Policy set definition parameters, if the policy assignment is for
     * a policy set.
     *
     * @param policySetDefinitionParameters the policySetDefinitionParameters value to set.
     * @return the PolicyEventInner object itself.
     */
    public PolicyEventInner withPolicySetDefinitionParameters(String policySetDefinitionParameters) {
        this.policySetDefinitionParameters = policySetDefinitionParameters;
        return this;
    }

    /**
     * Get the managementGroupIds property: Comma separated list of management group IDs, which represent the hierarchy
     * of the management groups the resource is under.
     *
     * @return the managementGroupIds value.
     */
    public String managementGroupIds() {
        return this.managementGroupIds;
    }

    /**
     * Set the managementGroupIds property: Comma separated list of management group IDs, which represent the hierarchy
     * of the management groups the resource is under.
     *
     * @param managementGroupIds the managementGroupIds value to set.
     * @return the PolicyEventInner object itself.
     */
    public PolicyEventInner withManagementGroupIds(String managementGroupIds) {
        this.managementGroupIds = managementGroupIds;
        return this;
    }

    /**
     * Get the policyDefinitionReferenceId property: Reference ID for the policy definition inside the policy set, if
     * the policy assignment is for a policy set.
     *
     * @return the policyDefinitionReferenceId value.
     */
    public String policyDefinitionReferenceId() {
        return this.policyDefinitionReferenceId;
    }

    /**
     * Set the policyDefinitionReferenceId property: Reference ID for the policy definition inside the policy set, if
     * the policy assignment is for a policy set.
     *
     * @param policyDefinitionReferenceId the policyDefinitionReferenceId value to set.
     * @return the PolicyEventInner object itself.
     */
    public PolicyEventInner withPolicyDefinitionReferenceId(String policyDefinitionReferenceId) {
        this.policyDefinitionReferenceId = policyDefinitionReferenceId;
        return this;
    }

    /**
     * Get the complianceState property: Compliance state of the resource.
     *
     * @return the complianceState value.
     */
    public String complianceState() {
        return this.complianceState;
    }

    /**
     * Set the complianceState property: Compliance state of the resource.
     *
     * @param complianceState the complianceState value to set.
     * @return the PolicyEventInner object itself.
     */
    public PolicyEventInner withComplianceState(String complianceState) {
        this.complianceState = complianceState;
        return this;
    }

    /**
     * Get the tenantId property: Tenant ID for the policy event record.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: Tenant ID for the policy event record.
     *
     * @param tenantId the tenantId value to set.
     * @return the PolicyEventInner object itself.
     */
    public PolicyEventInner withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the principalOid property: Principal object ID for the user who initiated the resource operation that
     * triggered the policy event.
     *
     * @return the principalOid value.
     */
    public String principalOid() {
        return this.principalOid;
    }

    /**
     * Set the principalOid property: Principal object ID for the user who initiated the resource operation that
     * triggered the policy event.
     *
     * @param principalOid the principalOid value to set.
     * @return the PolicyEventInner object itself.
     */
    public PolicyEventInner withPrincipalOid(String principalOid) {
        this.principalOid = principalOid;
        return this;
    }

    /**
     * Get the components property: Components events records populated only when URL contains $expand=components
     * clause.
     *
     * @return the components value.
     */
    public List<ComponentEventDetails> components() {
        return this.components;
    }

    /**
     * Set the components property: Components events records populated only when URL contains $expand=components
     * clause.
     *
     * @param components the components value to set.
     * @return the PolicyEventInner object itself.
     */
    public PolicyEventInner withComponents(List<ComponentEventDetails> components) {
        this.components = components;
        return this;
    }

    /**
     * Get the additionalProperties property: Policy event record.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Policy event record.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the PolicyEventInner object itself.
     */
    public PolicyEventInner withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (components() != null) {
            components().forEach(e -> e.validate());
        }
    }
}
