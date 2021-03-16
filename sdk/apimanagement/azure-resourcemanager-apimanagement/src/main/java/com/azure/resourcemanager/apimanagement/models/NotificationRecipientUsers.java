// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of NotificationRecipientUsers. */
public interface NotificationRecipientUsers {
    /**
     * Gets the list of the Notification Recipient User subscribed to the notification.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param notificationName Notification Name Identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of the Notification Recipient User subscribed to the notification.
     */
    RecipientUserCollection listByNotification(
        String resourceGroupName, String serviceName, NotificationName notificationName);

    /**
     * Gets the list of the Notification Recipient User subscribed to the notification.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param notificationName Notification Name Identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of the Notification Recipient User subscribed to the notification.
     */
    Response<RecipientUserCollection> listByNotificationWithResponse(
        String resourceGroupName, String serviceName, NotificationName notificationName, Context context);

    /**
     * Determine if the Notification Recipient User is subscribed to the notification.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param notificationName Notification Name Identifier.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return whether resource exists.
     */
    boolean checkEntityExists(
        String resourceGroupName, String serviceName, NotificationName notificationName, String userId);

    /**
     * Determine if the Notification Recipient User is subscribed to the notification.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param notificationName Notification Name Identifier.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Boolean> checkEntityExistsWithResponse(
        String resourceGroupName,
        String serviceName,
        NotificationName notificationName,
        String userId,
        Context context);

    /**
     * Adds the API Management User to the list of Recipients for the Notification.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param notificationName Notification Name Identifier.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return recipient User details.
     */
    RecipientUserContract createOrUpdate(
        String resourceGroupName, String serviceName, NotificationName notificationName, String userId);

    /**
     * Adds the API Management User to the list of Recipients for the Notification.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param notificationName Notification Name Identifier.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return recipient User details.
     */
    Response<RecipientUserContract> createOrUpdateWithResponse(
        String resourceGroupName,
        String serviceName,
        NotificationName notificationName,
        String userId,
        Context context);

    /**
     * Removes the API Management user from the list of Notification.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param notificationName Notification Name Identifier.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String serviceName, NotificationName notificationName, String userId);

    /**
     * Removes the API Management user from the list of Notification.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param notificationName Notification Name Identifier.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName,
        String serviceName,
        NotificationName notificationName,
        String userId,
        Context context);
}
