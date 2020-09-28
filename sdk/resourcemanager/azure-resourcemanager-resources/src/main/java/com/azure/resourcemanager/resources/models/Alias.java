// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The alias type. */
@Fluent
public final class Alias {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Alias.class);

    /*
     * The alias name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The paths for an alias.
     */
    @JsonProperty(value = "paths")
    private List<AliasPath> paths;

    /*
     * The type of the alias.
     */
    @JsonProperty(value = "type")
    private AliasType type;

    /*
     * The default path for an alias.
     */
    @JsonProperty(value = "defaultPath")
    private String defaultPath;

    /*
     * The default pattern for an alias.
     */
    @JsonProperty(value = "defaultPattern")
    private AliasPattern defaultPattern;

    /*
     * The default alias path metadata. Applies to the default path and to any
     * alias path that doesn't have metadata
     */
    @JsonProperty(value = "defaultMetadata", access = JsonProperty.Access.WRITE_ONLY)
    private AliasPathMetadata defaultMetadata;

    /**
     * Get the name property: The alias name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The alias name.
     *
     * @param name the name value to set.
     * @return the Alias object itself.
     */
    public Alias withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the paths property: The paths for an alias.
     *
     * @return the paths value.
     */
    public List<AliasPath> paths() {
        return this.paths;
    }

    /**
     * Set the paths property: The paths for an alias.
     *
     * @param paths the paths value to set.
     * @return the Alias object itself.
     */
    public Alias withPaths(List<AliasPath> paths) {
        this.paths = paths;
        return this;
    }

    /**
     * Get the type property: The type of the alias.
     *
     * @return the type value.
     */
    public AliasType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of the alias.
     *
     * @param type the type value to set.
     * @return the Alias object itself.
     */
    public Alias withType(AliasType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the defaultPath property: The default path for an alias.
     *
     * @return the defaultPath value.
     */
    public String defaultPath() {
        return this.defaultPath;
    }

    /**
     * Set the defaultPath property: The default path for an alias.
     *
     * @param defaultPath the defaultPath value to set.
     * @return the Alias object itself.
     */
    public Alias withDefaultPath(String defaultPath) {
        this.defaultPath = defaultPath;
        return this;
    }

    /**
     * Get the defaultPattern property: The default pattern for an alias.
     *
     * @return the defaultPattern value.
     */
    public AliasPattern defaultPattern() {
        return this.defaultPattern;
    }

    /**
     * Set the defaultPattern property: The default pattern for an alias.
     *
     * @param defaultPattern the defaultPattern value to set.
     * @return the Alias object itself.
     */
    public Alias withDefaultPattern(AliasPattern defaultPattern) {
        this.defaultPattern = defaultPattern;
        return this;
    }

    /**
     * Get the defaultMetadata property: The default alias path metadata. Applies to the default path and to any alias
     * path that doesn't have metadata.
     *
     * @return the defaultMetadata value.
     */
    public AliasPathMetadata defaultMetadata() {
        return this.defaultMetadata;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (paths() != null) {
            paths().forEach(e -> e.validate());
        }
        if (defaultPattern() != null) {
            defaultPattern().validate();
        }
        if (defaultMetadata() != null) {
            defaultMetadata().validate();
        }
    }
}
