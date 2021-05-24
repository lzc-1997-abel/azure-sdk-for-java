// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry;

import com.azure.containers.containerregistry.models.ArtifactManifestProperties;
import com.azure.containers.containerregistry.models.ArtifactTagProperties;
import com.azure.containers.containerregistry.models.TagOrderBy;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * This class provides a helper type that contains all the operations for artifacts in a given repository.
 *
 * <p><strong>Instantiating Registry Artifact </strong></p>
 *
 * {@codesnippet com.azure.containers.containerregistry.registryartifact.instantiation}
 */
public final class RegistryArtifact {
    private final RegistryArtifactAsync asyncClient;

    /**
     * Creates a RegistryArtifact type that sends requests to the given repository in the container registry service at {@code endpoint}.
     * Each service call goes through the {@code pipeline}.
     * @param asyncClient The async client for the given repository.
     */
    RegistryArtifact(RegistryArtifactAsync asyncClient) {
        this.asyncClient = asyncClient;
    }

    /**
     * Gets the Azure Container Registry service endpoint for the current instance.
     * @return The service endpoint for the current instance.
     */
    public String getRegistryEndpoint() {
        return this.asyncClient.getRegistryEndpoint();
    }

    /**
     * Gets the repository name for the current instance.
     * Gets the repository name for the current instance.
     * @return Name of the repository for the current instance.
     * */
    public String getRepositoryName() {
        return this.asyncClient.getRepositoryName();
    }

    /**
     * Gets the tag or digest for the current instance.
     * @return Tag or digest information for the current instance.
     * */
    public String getDigest() {
        return this.asyncClient.getDigest();
    }

    /**
     * Gets the fully qualified name for the current instance.
     * @return Fully qualified name of the current instance.
     * */
    public String getFullyQualifiedName() {
        return this.asyncClient.getFullyQualifiedName();
    }

    /**
     * Deletes the registry artifact with the matching digest {@link #getDigest()} in the given {@link #getRepositoryName() respository}.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Delete the registry artifact.</p>
     *
     * {@codesnippet com.azure.containers.containerregistry.registryartifact.deleteWithResponse}
     *
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A REST response containing the result of the service call.
     * @throws ClientAuthenticationException thrown if the client does not have access to the repository.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(Context context) {
        return this.asyncClient.deleteWithResponse(context).block();
    }

    /**
     * Deletes the registry artifact with the matching digest {@link #getDigest()} in the given {@link #getRepositoryName() respository}.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Delete the registry artifact.</p>
     *
     * {@codesnippet com.azure.containers.containerregistry.registryartifact.delete}
     *
     * @throws ClientAuthenticationException thrown if the client does not have access to modify the namespace.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete() {
        this.deleteWithResponse(Context.NONE).getValue();
    }

    /**
     * Deletes the tag with the matching tag name for the given {@link #getRepositoryName() repository}.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Delete the tag for the given repository.</p>
     *
     * {@codesnippet com.azure.containers.containerregistry.registryartifact.deleteTagWithResponse}
     *
     * @param tag The name of the tag that needs to be deleted.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A REST response containing the result of the service call.
     * @throws ClientAuthenticationException thrown if the client does not have access to modify the namespace.
     * @throws NullPointerException thrown if 'tag' is null.
     * @throws IllegalArgumentException thrown if 'tag' is empty.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteTagWithResponse(String tag, Context context) {
        return this.asyncClient.deleteTagWithResponse(tag, context).block();
    }

    /**
     * Deletes the tag with the matching tag name for the given {@link #getRepositoryName() repository}.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Delete the tag for the given repository.</p>
     *
     * {@codesnippet com.azure.containers.containerregistry.registryartifact.deleteTag}
     *
     * @param tag The name of the tag that needs to be deleted.
     * @throws ClientAuthenticationException thrown if the client does not have access to modify the namespace.
     * @throws NullPointerException thrown if 'tag' is null.
     * @throws IllegalArgumentException throws if 'tag' is empty.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteTag(String tag) {
        this.deleteTagWithResponse(tag, Context.NONE).getValue();
    }


    /**
     * Gets the {@link ArtifactManifestProperties properties} associated with an artifact in given {@link #getRepositoryName() repository}.
     *
     * <p>This method can take in both a digest as well as a tag.<br>
     * In case a tag is provided it calls the service to get the digest associated with the given tag.</p>
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Get the properties for the given repository.</p>
     *
     * {@codesnippet com.azure.containers.containerregistry.registryartifact.getManifestPropertiesWithResponse}
     *
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A REST response containing {@link ArtifactManifestProperties properties} associated with the given {@code Digest}.
     * @throws ClientAuthenticationException thrown if the client's credentials do not have access to modify the namespace.
     * @throws ResourceNotFoundException thrown if the given digest was not found.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ArtifactManifestProperties> getManifestPropertiesWithResponse(Context context) {
        return this.asyncClient.getManifestPropertiesWithResponse(context).block();
    }

    /**
     * Gets the {@link ArtifactManifestProperties properties} associated with an artifact in given {@link #getRepositoryName() repository}.
     *
     * <p>This method can take in both a digest as well as a tag.<br>
     * In case a tag is provided it calls the service to get the digest associated with the given tag.</p>
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Get the registry artifact properties for a given tag or digest.</p>
     *
     * {@codesnippet com.azure.containers.containerregistry.registryartifact.getManifestProperties}.
     *
     * @return The {@link ArtifactManifestProperties properties} associated with the given {@code Digest}.
     * @throws ClientAuthenticationException thrown if the client's credentials do not have access to modify the namespace.
     * @throws ResourceNotFoundException thrown if the given digest was not found.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ArtifactManifestProperties getManifestProperties() {
        return this.getManifestPropertiesWithResponse(Context.NONE).getValue();
    }

    /**
     * Gets the tag properties associated with a given tag in the {@link #getRepositoryName() repository}.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Retrieve the properties associated with the given tag.</p>
     *
     * {@codesnippet com.azure.containers.containerregistry.registryartifact.getTagPropertiesWithResponse}.
     *
     * @param tag name of the tag.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A REST response with the {@link ArtifactTagProperties properties} associated with the given tag.
     * @throws ClientAuthenticationException thrown if the client does not have access to the repository.
     * @throws ResourceNotFoundException thrown if the given tag was not found.
     * @throws NullPointerException thrown if 'tag' is null.
     * @throws IllegalArgumentException throws if 'tag' is empty.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)

    public Response<ArtifactTagProperties> getTagPropertiesWithResponse(String tag, Context context) {
        return this.asyncClient.getTagPropertiesWithResponse(tag, context).block();
    }

    /**
     * Gets the tag properties associated with a given tag in the {@link #getRepositoryName() repository}.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Retrieve the properties associated with the given tag.</p>
     *
     * {@codesnippet com.azure.containers.containerregistry.registryartifact.getTagProperties}.
     *
     * @param tag name of the tag.
     * @return The {@link ArtifactTagProperties properties} associated with the given tag.
     * @throws ClientAuthenticationException thrown if the client does not have access to the repository.
     * @throws ResourceNotFoundException thrown if the given tag was not found.
     * @throws NullPointerException thrown if 'tag' is null.
     * @throws IllegalArgumentException throws if 'tag' is empty.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ArtifactTagProperties getTagProperties(String tag) {
        return getTagPropertiesWithResponse(tag, Context.NONE).getValue();
    }

    /**
     * Fetches all the tags associated with the given {@link #getRepositoryName() repository}.
     *
     * <p> If you would like to specify the order in which the tags are returned please
     * use the overload that takes in the options parameter {@link #listTags(TagOrderBy, Context)}  listTags}
     * No assumptions on the order can be made if no options are provided to the service.
     * </p>
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Retrieve all the tags associated with the given repository from the most recently updated to the last.</p>
     *
     * {@codesnippet com.azure.containers.containerregistry.registryartifact.listTagsWithOptions}.
     *
     * @return {@link PagedIterable} of the artifacts for the given repository in the order specified by the options.
     * @throws ClientAuthenticationException thrown if the client does not have access to the repository.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ArtifactTagProperties> listTags() {
        return listTags(TagOrderBy.NONE, Context.NONE);
    }

    /**
     * Fetches all the tags associated with the given {@link #getRepositoryName() repository}.
     *
     * <p> The method supports options to select the order in which the tags are returned by the service.
     * Currently the service supports an ascending or descending order based on the last updated time of the tag.
     * No assumptions on the order can be made if no options are provided to the service.
     * </p>
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Retrieve all the tags associated with the given repository from the most recently updated to the last.</p>
     *
     * {@codesnippet com.azure.containers.containerregistry.registryartifact.listTagsWithOptionsNoContext}.
     *
     * @param orderBy The order in which the tags should be returned by the service.
     * @return {@link PagedIterable} of the artifacts for the given repository in the order specified by the options.
     * @throws ClientAuthenticationException thrown if the client does not have access to the repository.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ArtifactTagProperties> listTags(TagOrderBy orderBy) {
        return this.listTags(orderBy, Context.NONE);
    }

    /**
     * Fetches all the tags associated with the given {@link #getRepositoryName() repository}.
     *
     * <p> The method supports options to select the order in which the tags are returned by the service.
     * Currently the service supports an ascending or descending order based on the last updated time of the tag.
     * No assumptions on the order can be made if no options are provided to the service.
     * </p>
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Retrieve all the tags associated with the given repository from the most recently updated to the last.</p>
     *
     * {@codesnippet com.azure.containers.containerregistry.registryartifact.listTagsWithOptions}.
     *
     * @param orderBy The order in which the tags should be returned by the service.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return {@link PagedIterable} of the artifacts for the given repository in the order specified by the options.
     * @throws ClientAuthenticationException thrown if the client does not have access to the repository.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ArtifactTagProperties> listTags(TagOrderBy orderBy, Context context) {
        return new PagedIterable<ArtifactTagProperties>(asyncClient.listTags(orderBy, context));
    }

    /**
     * Update the properties {@link ArtifactTagProperties} of the given tag in {@link #getRepositoryName() repository}.
     * These properties set whether the given tag can be updated, deleted and retrieved.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Update the writeable properties of a given tag.</p>
     *
     * {@codesnippet com.azure.containers.containerregistry.registryartifact.updateTagPropertiesWithResponse}.
     *
     * @param tag Name of the tag.
     * @param tagProperties {@link ArtifactTagProperties tagProperties} to be set.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A REST response for the completion.
     * @throws ClientAuthenticationException thrown if the client does not have access to repository.
     * @throws ResourceNotFoundException thrown if the given 'tag' was not found.
     * @throws NullPointerException thrown if 'tag' is null.
     * @throws IllegalArgumentException thrown if 'tag' is empty.
     * @throws NullPointerException thrown if 'tagProperties' is null.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ArtifactTagProperties> updateTagPropertiesWithResponse(String tag, ArtifactTagProperties tagProperties, Context context) {
        return this.asyncClient.updateTagPropertiesWithResponse(tag, tagProperties, context).block();
    }

    /**
     * Update the properties {@link ArtifactTagProperties} of the given {@code tag}.
     * These properties set whether the given tag can be updated, deleted and retrieved.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Update the writeable properties of a given tag.</p>
     *
     * {@codesnippet com.azure.containers.containerregistry.registryartifact.updateTagProperties}.
     *
     * @param tag Name of the tag.
     * @param tagProperties {@link ArtifactTagProperties tagProperties} to be set.
     * @return The updated {@link ArtifactTagProperties properties }
     * @throws ClientAuthenticationException thrown if the client does not have access to repository.
     * @throws ResourceNotFoundException thrown if the given tag was not found.
     * @throws NullPointerException thrown if 'tag' is null.
     * @throws IllegalArgumentException thrown if 'tag' is empty.
     * @throws NullPointerException thrown if 'tagProperties' is null.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ArtifactTagProperties updateTagProperties(String tag, ArtifactTagProperties tagProperties) {
        return this.updateTagPropertiesWithResponse(tag, tagProperties, Context.NONE).getValue();
    }

    /**
     * Update the properties {@link ArtifactTagProperties} of the artifact with the given {@code digest}.
     * These properties set whether the given manifest can be updated, deleted and retrieved.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Update the writeable properties of a given artifact.</p>
     *
     * {@codesnippet com.azure.containers.containerregistry.registryartifact.updateManifestPropertiesWithResponse}.
     *
     * @param manifestProperties {@link ArtifactManifestProperties tagProperties} to be set.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A REST response for the completion.
     * @throws ClientAuthenticationException thrown if the client does not have access to repository.
     * @throws NullPointerException thrown if the value is null.
     * @throws ResourceNotFoundException thrown if the given digest was not found.
     */
    public Response<ArtifactManifestProperties> updateManifestPropertiesWithResponse(ArtifactManifestProperties manifestProperties, Context context) {
        return this.asyncClient.updateManifestPropertiesWithResponse(manifestProperties, context).block();
    }

    /**
     * Update the writeable properties {@link ArtifactTagProperties} of the artifact with the given {@code digest}.
     * These properties set whether the given manifest can be updated, deleted and retrieved.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Update the writeable properties of a given manifest.</p>
     *
     * {@codesnippet com.azure.containers.containerregistry.registryartifact.updateManifestProperties}.
     *
     * @param manifestProperties {@link ArtifactManifestProperties manifestProperties} to be set.
     * @return The updated {@link ArtifactManifestProperties properties }
     * @throws ClientAuthenticationException thrown if the client does not have access to repository.
     * @throws ResourceNotFoundException thrown if the given digest was not found.
     * @throws NullPointerException thrown if the 'value' is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ArtifactManifestProperties updateManifestProperties(ArtifactManifestProperties manifestProperties) {
        return this.updateManifestPropertiesWithResponse(manifestProperties, Context.NONE).getValue();
    }
}
