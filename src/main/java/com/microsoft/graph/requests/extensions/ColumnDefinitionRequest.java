// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ColumnDefinition;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Column Definition Request.
 */
public class ColumnDefinitionRequest extends BaseRequest implements IColumnDefinitionRequest {
	
    /**
     * The request for the ColumnDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ColumnDefinitionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ColumnDefinition.class);
    }

    /**
     * Gets the ColumnDefinition from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<ColumnDefinition> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ColumnDefinition from the service
     *
     * @return the ColumnDefinition from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ColumnDefinition get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<ColumnDefinition> callback) {
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
     * Patches this ColumnDefinition with a source
     *
     * @param sourceColumnDefinition the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ColumnDefinition sourceColumnDefinition, final ICallback<ColumnDefinition> callback) {
        send(HttpMethod.PATCH, callback, sourceColumnDefinition);
    }

    /**
     * Patches this ColumnDefinition with a source
     *
     * @param sourceColumnDefinition the source object with updates
     * @return the updated ColumnDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ColumnDefinition patch(final ColumnDefinition sourceColumnDefinition) throws ClientException {
        return send(HttpMethod.PATCH, sourceColumnDefinition);
    }

    /**
     * Creates a ColumnDefinition with a new object
     *
     * @param newColumnDefinition the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ColumnDefinition newColumnDefinition, final ICallback<ColumnDefinition> callback) {
        send(HttpMethod.POST, callback, newColumnDefinition);
    }

    /**
     * Creates a ColumnDefinition with a new object
     *
     * @param newColumnDefinition the new object to create
     * @return the created ColumnDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ColumnDefinition post(final ColumnDefinition newColumnDefinition) throws ClientException {
        return send(HttpMethod.POST, newColumnDefinition);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IColumnDefinitionRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ColumnDefinitionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IColumnDefinitionRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ColumnDefinitionRequest)this;
     }

}

