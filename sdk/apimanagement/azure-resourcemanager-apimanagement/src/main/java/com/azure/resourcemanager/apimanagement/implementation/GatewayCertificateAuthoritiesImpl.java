// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.GatewayCertificateAuthoritiesClient;
import com.azure.resourcemanager.apimanagement.fluent.models.GatewayCertificateAuthorityContractInner;
import com.azure.resourcemanager.apimanagement.models.GatewayCertificateAuthorities;
import com.azure.resourcemanager.apimanagement.models.GatewayCertificateAuthorityContract;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class GatewayCertificateAuthoritiesImpl implements GatewayCertificateAuthorities {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GatewayCertificateAuthoritiesImpl.class);

    private final GatewayCertificateAuthoritiesClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public GatewayCertificateAuthoritiesImpl(
        GatewayCertificateAuthoritiesClient innerClient,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<GatewayCertificateAuthorityContract> listByService(
        String resourceGroupName, String serviceName, String gatewayId) {
        PagedIterable<GatewayCertificateAuthorityContractInner> inner =
            this.serviceClient().listByService(resourceGroupName, serviceName, gatewayId);
        return Utils.mapPage(inner, inner1 -> new GatewayCertificateAuthorityContractImpl(inner1, this.manager()));
    }

    public PagedIterable<GatewayCertificateAuthorityContract> listByService(
        String resourceGroupName,
        String serviceName,
        String gatewayId,
        String filter,
        Integer top,
        Integer skip,
        Context context) {
        PagedIterable<GatewayCertificateAuthorityContractInner> inner =
            this.serviceClient().listByService(resourceGroupName, serviceName, gatewayId, filter, top, skip, context);
        return Utils.mapPage(inner, inner1 -> new GatewayCertificateAuthorityContractImpl(inner1, this.manager()));
    }

    public void getEntityTag(String resourceGroupName, String serviceName, String gatewayId, String certificateId) {
        this.serviceClient().getEntityTag(resourceGroupName, serviceName, gatewayId, certificateId);
    }

    public Response<Void> getEntityTagWithResponse(
        String resourceGroupName, String serviceName, String gatewayId, String certificateId, Context context) {
        return this
            .serviceClient()
            .getEntityTagWithResponse(resourceGroupName, serviceName, gatewayId, certificateId, context);
    }

    public GatewayCertificateAuthorityContract get(
        String resourceGroupName, String serviceName, String gatewayId, String certificateId) {
        GatewayCertificateAuthorityContractInner inner =
            this.serviceClient().get(resourceGroupName, serviceName, gatewayId, certificateId);
        if (inner != null) {
            return new GatewayCertificateAuthorityContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<GatewayCertificateAuthorityContract> getWithResponse(
        String resourceGroupName, String serviceName, String gatewayId, String certificateId, Context context) {
        Response<GatewayCertificateAuthorityContractInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serviceName, gatewayId, certificateId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new GatewayCertificateAuthorityContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(
        String resourceGroupName, String serviceName, String gatewayId, String certificateId, String ifMatch) {
        this.serviceClient().delete(resourceGroupName, serviceName, gatewayId, certificateId, ifMatch);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName,
        String serviceName,
        String gatewayId,
        String certificateId,
        String ifMatch,
        Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(resourceGroupName, serviceName, gatewayId, certificateId, ifMatch, context);
    }

    public GatewayCertificateAuthorityContract getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String gatewayId = Utils.getValueFromIdByName(id, "gateways");
        if (gatewayId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'gateways'.", id)));
        }
        String certificateId = Utils.getValueFromIdByName(id, "certificateAuthorities");
        if (certificateId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'certificateAuthorities'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, serviceName, gatewayId, certificateId, Context.NONE).getValue();
    }

    public Response<GatewayCertificateAuthorityContract> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String gatewayId = Utils.getValueFromIdByName(id, "gateways");
        if (gatewayId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'gateways'.", id)));
        }
        String certificateId = Utils.getValueFromIdByName(id, "certificateAuthorities");
        if (certificateId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'certificateAuthorities'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, serviceName, gatewayId, certificateId, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String gatewayId = Utils.getValueFromIdByName(id, "gateways");
        if (gatewayId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'gateways'.", id)));
        }
        String certificateId = Utils.getValueFromIdByName(id, "certificateAuthorities");
        if (certificateId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'certificateAuthorities'.",
                                id)));
        }
        String localIfMatch = null;
        this
            .deleteWithResponse(resourceGroupName, serviceName, gatewayId, certificateId, localIfMatch, Context.NONE)
            .getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, String ifMatch, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String gatewayId = Utils.getValueFromIdByName(id, "gateways");
        if (gatewayId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'gateways'.", id)));
        }
        String certificateId = Utils.getValueFromIdByName(id, "certificateAuthorities");
        if (certificateId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'certificateAuthorities'.",
                                id)));
        }
        return this.deleteWithResponse(resourceGroupName, serviceName, gatewayId, certificateId, ifMatch, context);
    }

    private GatewayCertificateAuthoritiesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }

    public GatewayCertificateAuthorityContractImpl define(String name) {
        return new GatewayCertificateAuthorityContractImpl(name, this.manager());
    }
}
