// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Win32LobApp;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Win32Lob App Request.
 */
public class Win32LobAppRequest extends BaseRequest implements IWin32LobAppRequest {
	
    /**
     * The request for the Win32LobApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Win32LobAppRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Win32LobApp.class);
    }

    /**
     * Gets the Win32LobApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Win32LobApp> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Win32LobApp from the service
     *
     * @return the Win32LobApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Win32LobApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Win32LobApp> callback) {
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
     * Patches this Win32LobApp with a source
     *
     * @param sourceWin32LobApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Win32LobApp sourceWin32LobApp, final ICallback<Win32LobApp> callback) {
        send(HttpMethod.PATCH, callback, sourceWin32LobApp);
    }

    /**
     * Patches this Win32LobApp with a source
     *
     * @param sourceWin32LobApp the source object with updates
     * @return the updated Win32LobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Win32LobApp patch(final Win32LobApp sourceWin32LobApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceWin32LobApp);
    }

    /**
     * Creates a Win32LobApp with a new object
     *
     * @param newWin32LobApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Win32LobApp newWin32LobApp, final ICallback<Win32LobApp> callback) {
        send(HttpMethod.POST, callback, newWin32LobApp);
    }

    /**
     * Creates a Win32LobApp with a new object
     *
     * @param newWin32LobApp the new object to create
     * @return the created Win32LobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Win32LobApp post(final Win32LobApp newWin32LobApp) throws ClientException {
        return send(HttpMethod.POST, newWin32LobApp);
    }

    /**
     * Creates a Win32LobApp with a new object
     *
     * @param newWin32LobApp the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Win32LobApp newWin32LobApp, final ICallback<Win32LobApp> callback) {
        send(HttpMethod.PUT, callback, newWin32LobApp);
    }

    /**
     * Creates a Win32LobApp with a new object
     *
     * @param newWin32LobApp the object to create/update
     * @return the created Win32LobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Win32LobApp put(final Win32LobApp newWin32LobApp) throws ClientException {
        return send(HttpMethod.PUT, newWin32LobApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWin32LobAppRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (Win32LobAppRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWin32LobAppRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (Win32LobAppRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IWin32LobAppRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (Win32LobAppRequest)this;
     }

}
