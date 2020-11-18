// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.LinkedResource;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Linked Resource Request.
 */
public class LinkedResourceRequest extends BaseRequest {
	
    /**
     * The request for the LinkedResource
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public LinkedResourceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, LinkedResource.class);
    }

    /**
     * Gets the LinkedResource from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super LinkedResource> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the LinkedResource from the service
     *
     * @return the LinkedResource from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public LinkedResource get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super LinkedResource> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this LinkedResource with a source
     *
     * @param sourceLinkedResource the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final LinkedResource sourceLinkedResource, @Nonnull final ICallback<? super LinkedResource> callback) {
        send(HttpMethod.PATCH, callback, sourceLinkedResource);
    }

    /**
     * Patches this LinkedResource with a source
     *
     * @param sourceLinkedResource the source object with updates
     * @return the updated LinkedResource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public LinkedResource patch(@Nonnull final LinkedResource sourceLinkedResource) throws ClientException {
        return send(HttpMethod.PATCH, sourceLinkedResource);
    }

    /**
     * Creates a LinkedResource with a new object
     *
     * @param newLinkedResource the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final LinkedResource newLinkedResource, @Nonnull final ICallback<? super LinkedResource> callback) {
        send(HttpMethod.POST, callback, newLinkedResource);
    }

    /**
     * Creates a LinkedResource with a new object
     *
     * @param newLinkedResource the new object to create
     * @return the created LinkedResource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public LinkedResource post(@Nonnull final LinkedResource newLinkedResource) throws ClientException {
        return send(HttpMethod.POST, newLinkedResource);
    }

    /**
     * Creates a LinkedResource with a new object
     *
     * @param newLinkedResource the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final LinkedResource newLinkedResource, @Nonnull final ICallback<? super LinkedResource> callback) {
        send(HttpMethod.PUT, callback, newLinkedResource);
    }

    /**
     * Creates a LinkedResource with a new object
     *
     * @param newLinkedResource the object to create/update
     * @return the created LinkedResource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public LinkedResource put(@Nonnull final LinkedResource newLinkedResource) throws ClientException {
        return send(HttpMethod.PUT, newLinkedResource);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public LinkedResourceRequest select(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (LinkedResourceRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public LinkedResourceRequest expand(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (LinkedResourceRequest)this;
     }

}

