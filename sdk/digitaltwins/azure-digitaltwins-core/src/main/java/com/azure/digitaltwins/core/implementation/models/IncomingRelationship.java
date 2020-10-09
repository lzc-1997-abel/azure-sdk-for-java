// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.digitaltwins.core.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An incoming relationship. */
@Fluent
public final class IncomingRelationship {
    /*
     * A user-provided string representing the id of this relationship, unique
     * in the context of the source digital twin, i.e. sourceId +
     * relationshipId is unique in the context of the service.
     */
    @JsonProperty(value = "$relationshipId")
    private String relationshipId;

    /*
     * The id of the source digital twin.
     */
    @JsonProperty(value = "$sourceId")
    private String sourceId;

    /*
     * The name of the relationship.
     */
    @JsonProperty(value = "$relationshipName")
    private String relationshipName;

    /*
     * Link to the relationship, to be used for deletion.
     */
    @JsonProperty(value = "$relationshipLink")
    private String relationshipLink;

    /**
     * Get the relationshipId property: A user-provided string representing the id of this relationship, unique in the
     * context of the source digital twin, i.e. sourceId + relationshipId is unique in the context of the service.
     *
     * @return the relationshipId value.
     */
    public String getRelationshipId() {
        return this.relationshipId;
    }

    /**
     * Set the relationshipId property: A user-provided string representing the id of this relationship, unique in the
     * context of the source digital twin, i.e. sourceId + relationshipId is unique in the context of the service.
     *
     * @param relationshipId the relationshipId value to set.
     * @return the IncomingRelationship object itself.
     */
    public IncomingRelationship setRelationshipId(String relationshipId) {
        this.relationshipId = relationshipId;
        return this;
    }

    /**
     * Get the sourceId property: The id of the source digital twin.
     *
     * @return the sourceId value.
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * Set the sourceId property: The id of the source digital twin.
     *
     * @param sourceId the sourceId value to set.
     * @return the IncomingRelationship object itself.
     */
    public IncomingRelationship setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * Get the relationshipName property: The name of the relationship.
     *
     * @return the relationshipName value.
     */
    public String getRelationshipName() {
        return this.relationshipName;
    }

    /**
     * Set the relationshipName property: The name of the relationship.
     *
     * @param relationshipName the relationshipName value to set.
     * @return the IncomingRelationship object itself.
     */
    public IncomingRelationship setRelationshipName(String relationshipName) {
        this.relationshipName = relationshipName;
        return this;
    }

    /**
     * Get the relationshipLink property: Link to the relationship, to be used for deletion.
     *
     * @return the relationshipLink value.
     */
    public String getRelationshipLink() {
        return this.relationshipLink;
    }

    /**
     * Set the relationshipLink property: Link to the relationship, to be used for deletion.
     *
     * @param relationshipLink the relationshipLink value to set.
     * @return the IncomingRelationship object itself.
     */
    public IncomingRelationship setRelationshipLink(String relationshipLink) {
        this.relationshipLink = relationshipLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {}
}
