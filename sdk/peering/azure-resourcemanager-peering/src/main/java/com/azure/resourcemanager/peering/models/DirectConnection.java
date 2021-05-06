// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties that define a direct connection. */
@Fluent
public final class DirectConnection {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DirectConnection.class);

    /*
     * The bandwidth of the connection.
     */
    @JsonProperty(value = "bandwidthInMbps")
    private Integer bandwidthInMbps;

    /*
     * The bandwidth that is actually provisioned.
     */
    @JsonProperty(value = "provisionedBandwidthInMbps", access = JsonProperty.Access.WRITE_ONLY)
    private Integer provisionedBandwidthInMbps;

    /*
     * The field indicating if Microsoft provides session ip addresses.
     */
    @JsonProperty(value = "sessionAddressProvider")
    private SessionAddressProvider sessionAddressProvider;

    /*
     * The flag that indicates whether or not the connection is used for
     * peering service.
     */
    @JsonProperty(value = "useForPeeringService")
    private Boolean useForPeeringService;

    /*
     * The ID used within Microsoft's peering provisioning system to track the
     * connection
     */
    @JsonProperty(value = "microsoftTrackingId", access = JsonProperty.Access.WRITE_ONLY)
    private String microsoftTrackingId;

    /*
     * The PeeringDB.com ID of the facility at which the connection has to be
     * set up.
     */
    @JsonProperty(value = "peeringDBFacilityId")
    private Integer peeringDBFacilityId;

    /*
     * The state of the connection.
     */
    @JsonProperty(value = "connectionState", access = JsonProperty.Access.WRITE_ONLY)
    private ConnectionState connectionState;

    /*
     * The BGP session associated with the connection.
     */
    @JsonProperty(value = "bgpSession")
    private BgpSession bgpSession;

    /*
     * The unique identifier (GUID) for the connection.
     */
    @JsonProperty(value = "connectionIdentifier")
    private String connectionIdentifier;

    /*
     * The error message related to the connection state, if any.
     */
    @JsonProperty(value = "errorMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String errorMessage;

    /**
     * Get the bandwidthInMbps property: The bandwidth of the connection.
     *
     * @return the bandwidthInMbps value.
     */
    public Integer bandwidthInMbps() {
        return this.bandwidthInMbps;
    }

    /**
     * Set the bandwidthInMbps property: The bandwidth of the connection.
     *
     * @param bandwidthInMbps the bandwidthInMbps value to set.
     * @return the DirectConnection object itself.
     */
    public DirectConnection withBandwidthInMbps(Integer bandwidthInMbps) {
        this.bandwidthInMbps = bandwidthInMbps;
        return this;
    }

    /**
     * Get the provisionedBandwidthInMbps property: The bandwidth that is actually provisioned.
     *
     * @return the provisionedBandwidthInMbps value.
     */
    public Integer provisionedBandwidthInMbps() {
        return this.provisionedBandwidthInMbps;
    }

    /**
     * Get the sessionAddressProvider property: The field indicating if Microsoft provides session ip addresses.
     *
     * @return the sessionAddressProvider value.
     */
    public SessionAddressProvider sessionAddressProvider() {
        return this.sessionAddressProvider;
    }

    /**
     * Set the sessionAddressProvider property: The field indicating if Microsoft provides session ip addresses.
     *
     * @param sessionAddressProvider the sessionAddressProvider value to set.
     * @return the DirectConnection object itself.
     */
    public DirectConnection withSessionAddressProvider(SessionAddressProvider sessionAddressProvider) {
        this.sessionAddressProvider = sessionAddressProvider;
        return this;
    }

    /**
     * Get the useForPeeringService property: The flag that indicates whether or not the connection is used for peering
     * service.
     *
     * @return the useForPeeringService value.
     */
    public Boolean useForPeeringService() {
        return this.useForPeeringService;
    }

    /**
     * Set the useForPeeringService property: The flag that indicates whether or not the connection is used for peering
     * service.
     *
     * @param useForPeeringService the useForPeeringService value to set.
     * @return the DirectConnection object itself.
     */
    public DirectConnection withUseForPeeringService(Boolean useForPeeringService) {
        this.useForPeeringService = useForPeeringService;
        return this;
    }

    /**
     * Get the microsoftTrackingId property: The ID used within Microsoft's peering provisioning system to track the
     * connection.
     *
     * @return the microsoftTrackingId value.
     */
    public String microsoftTrackingId() {
        return this.microsoftTrackingId;
    }

    /**
     * Get the peeringDBFacilityId property: The PeeringDB.com ID of the facility at which the connection has to be set
     * up.
     *
     * @return the peeringDBFacilityId value.
     */
    public Integer peeringDBFacilityId() {
        return this.peeringDBFacilityId;
    }

    /**
     * Set the peeringDBFacilityId property: The PeeringDB.com ID of the facility at which the connection has to be set
     * up.
     *
     * @param peeringDBFacilityId the peeringDBFacilityId value to set.
     * @return the DirectConnection object itself.
     */
    public DirectConnection withPeeringDBFacilityId(Integer peeringDBFacilityId) {
        this.peeringDBFacilityId = peeringDBFacilityId;
        return this;
    }

    /**
     * Get the connectionState property: The state of the connection.
     *
     * @return the connectionState value.
     */
    public ConnectionState connectionState() {
        return this.connectionState;
    }

    /**
     * Get the bgpSession property: The BGP session associated with the connection.
     *
     * @return the bgpSession value.
     */
    public BgpSession bgpSession() {
        return this.bgpSession;
    }

    /**
     * Set the bgpSession property: The BGP session associated with the connection.
     *
     * @param bgpSession the bgpSession value to set.
     * @return the DirectConnection object itself.
     */
    public DirectConnection withBgpSession(BgpSession bgpSession) {
        this.bgpSession = bgpSession;
        return this;
    }

    /**
     * Get the connectionIdentifier property: The unique identifier (GUID) for the connection.
     *
     * @return the connectionIdentifier value.
     */
    public String connectionIdentifier() {
        return this.connectionIdentifier;
    }

    /**
     * Set the connectionIdentifier property: The unique identifier (GUID) for the connection.
     *
     * @param connectionIdentifier the connectionIdentifier value to set.
     * @return the DirectConnection object itself.
     */
    public DirectConnection withConnectionIdentifier(String connectionIdentifier) {
        this.connectionIdentifier = connectionIdentifier;
        return this;
    }

    /**
     * Get the errorMessage property: The error message related to the connection state, if any.
     *
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (bgpSession() != null) {
            bgpSession().validate();
        }
    }
}
