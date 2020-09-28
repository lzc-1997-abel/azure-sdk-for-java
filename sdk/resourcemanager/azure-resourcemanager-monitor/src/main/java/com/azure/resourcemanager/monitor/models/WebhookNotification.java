// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Webhook notification of an autoscale event. */
@Fluent
public final class WebhookNotification {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WebhookNotification.class);

    /*
     * the service address to receive the notification.
     */
    @JsonProperty(value = "serviceUri")
    private String serviceUri;

    /*
     * a property bag of settings. This value can be empty.
     */
    @JsonProperty(value = "properties")
    private Map<String, String> properties;

    /**
     * Get the serviceUri property: the service address to receive the notification.
     *
     * @return the serviceUri value.
     */
    public String serviceUri() {
        return this.serviceUri;
    }

    /**
     * Set the serviceUri property: the service address to receive the notification.
     *
     * @param serviceUri the serviceUri value to set.
     * @return the WebhookNotification object itself.
     */
    public WebhookNotification withServiceUri(String serviceUri) {
        this.serviceUri = serviceUri;
        return this;
    }

    /**
     * Get the properties property: a property bag of settings. This value can be empty.
     *
     * @return the properties value.
     */
    public Map<String, String> properties() {
        return this.properties;
    }

    /**
     * Set the properties property: a property bag of settings. This value can be empty.
     *
     * @param properties the properties value to set.
     * @return the WebhookNotification object itself.
     */
    public WebhookNotification withProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
