// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** AKS properties. */
@Fluent
public final class AksProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AksProperties.class);

    /*
     * Cluster full qualified domain name
     */
    @JsonProperty(value = "clusterFqdn")
    private String clusterFqdn;

    /*
     * System services
     */
    @JsonProperty(value = "systemServices", access = JsonProperty.Access.WRITE_ONLY)
    private List<SystemService> systemServices;

    /*
     * Number of agents
     */
    @JsonProperty(value = "agentCount")
    private Integer agentCount;

    /*
     * Agent virtual machine size
     */
    @JsonProperty(value = "agentVmSize")
    private String agentVmSize;

    /*
     * Intended usage of the cluster
     */
    @JsonProperty(value = "clusterPurpose")
    private ClusterPurpose clusterPurpose;

    /*
     * SSL configuration
     */
    @JsonProperty(value = "sslConfiguration")
    private SslConfiguration sslConfiguration;

    /*
     * AKS networking configuration for vnet
     */
    @JsonProperty(value = "aksNetworkingConfiguration")
    private AksNetworkingConfiguration aksNetworkingConfiguration;

    /*
     * Load Balancer Type
     */
    @JsonProperty(value = "loadBalancerType")
    private LoadBalancerType loadBalancerType;

    /*
     * Load Balancer Subnet
     */
    @JsonProperty(value = "loadBalancerSubnet")
    private String loadBalancerSubnet;

    /**
     * Get the clusterFqdn property: Cluster full qualified domain name.
     *
     * @return the clusterFqdn value.
     */
    public String clusterFqdn() {
        return this.clusterFqdn;
    }

    /**
     * Set the clusterFqdn property: Cluster full qualified domain name.
     *
     * @param clusterFqdn the clusterFqdn value to set.
     * @return the AksProperties object itself.
     */
    public AksProperties withClusterFqdn(String clusterFqdn) {
        this.clusterFqdn = clusterFqdn;
        return this;
    }

    /**
     * Get the systemServices property: System services.
     *
     * @return the systemServices value.
     */
    public List<SystemService> systemServices() {
        return this.systemServices;
    }

    /**
     * Get the agentCount property: Number of agents.
     *
     * @return the agentCount value.
     */
    public Integer agentCount() {
        return this.agentCount;
    }

    /**
     * Set the agentCount property: Number of agents.
     *
     * @param agentCount the agentCount value to set.
     * @return the AksProperties object itself.
     */
    public AksProperties withAgentCount(Integer agentCount) {
        this.agentCount = agentCount;
        return this;
    }

    /**
     * Get the agentVmSize property: Agent virtual machine size.
     *
     * @return the agentVmSize value.
     */
    public String agentVmSize() {
        return this.agentVmSize;
    }

    /**
     * Set the agentVmSize property: Agent virtual machine size.
     *
     * @param agentVmSize the agentVmSize value to set.
     * @return the AksProperties object itself.
     */
    public AksProperties withAgentVmSize(String agentVmSize) {
        this.agentVmSize = agentVmSize;
        return this;
    }

    /**
     * Get the clusterPurpose property: Intended usage of the cluster.
     *
     * @return the clusterPurpose value.
     */
    public ClusterPurpose clusterPurpose() {
        return this.clusterPurpose;
    }

    /**
     * Set the clusterPurpose property: Intended usage of the cluster.
     *
     * @param clusterPurpose the clusterPurpose value to set.
     * @return the AksProperties object itself.
     */
    public AksProperties withClusterPurpose(ClusterPurpose clusterPurpose) {
        this.clusterPurpose = clusterPurpose;
        return this;
    }

    /**
     * Get the sslConfiguration property: SSL configuration.
     *
     * @return the sslConfiguration value.
     */
    public SslConfiguration sslConfiguration() {
        return this.sslConfiguration;
    }

    /**
     * Set the sslConfiguration property: SSL configuration.
     *
     * @param sslConfiguration the sslConfiguration value to set.
     * @return the AksProperties object itself.
     */
    public AksProperties withSslConfiguration(SslConfiguration sslConfiguration) {
        this.sslConfiguration = sslConfiguration;
        return this;
    }

    /**
     * Get the aksNetworkingConfiguration property: AKS networking configuration for vnet.
     *
     * @return the aksNetworkingConfiguration value.
     */
    public AksNetworkingConfiguration aksNetworkingConfiguration() {
        return this.aksNetworkingConfiguration;
    }

    /**
     * Set the aksNetworkingConfiguration property: AKS networking configuration for vnet.
     *
     * @param aksNetworkingConfiguration the aksNetworkingConfiguration value to set.
     * @return the AksProperties object itself.
     */
    public AksProperties withAksNetworkingConfiguration(AksNetworkingConfiguration aksNetworkingConfiguration) {
        this.aksNetworkingConfiguration = aksNetworkingConfiguration;
        return this;
    }

    /**
     * Get the loadBalancerType property: Load Balancer Type.
     *
     * @return the loadBalancerType value.
     */
    public LoadBalancerType loadBalancerType() {
        return this.loadBalancerType;
    }

    /**
     * Set the loadBalancerType property: Load Balancer Type.
     *
     * @param loadBalancerType the loadBalancerType value to set.
     * @return the AksProperties object itself.
     */
    public AksProperties withLoadBalancerType(LoadBalancerType loadBalancerType) {
        this.loadBalancerType = loadBalancerType;
        return this;
    }

    /**
     * Get the loadBalancerSubnet property: Load Balancer Subnet.
     *
     * @return the loadBalancerSubnet value.
     */
    public String loadBalancerSubnet() {
        return this.loadBalancerSubnet;
    }

    /**
     * Set the loadBalancerSubnet property: Load Balancer Subnet.
     *
     * @param loadBalancerSubnet the loadBalancerSubnet value to set.
     * @return the AksProperties object itself.
     */
    public AksProperties withLoadBalancerSubnet(String loadBalancerSubnet) {
        this.loadBalancerSubnet = loadBalancerSubnet;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (systemServices() != null) {
            systemServices().forEach(e -> e.validate());
        }
        if (sslConfiguration() != null) {
            sslConfiguration().validate();
        }
        if (aksNetworkingConfiguration() != null) {
            aksNetworkingConfiguration().validate();
        }
    }
}
