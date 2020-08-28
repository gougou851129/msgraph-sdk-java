// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ManagedDeviceDeleteUserFromSharedAppleDeviceBody;
import com.microsoft.graph.requests.extensions.IManagedDeviceDeleteUserFromSharedAppleDeviceRequest;
import com.microsoft.graph.requests.extensions.ManagedDeviceDeleteUserFromSharedAppleDeviceRequest;

import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Delete User From Shared Apple Device Request.
 */
public class ManagedDeviceDeleteUserFromSharedAppleDeviceRequest extends BaseRequest implements IManagedDeviceDeleteUserFromSharedAppleDeviceRequest {
    protected final ManagedDeviceDeleteUserFromSharedAppleDeviceBody body;

    /**
     * The request for this ManagedDeviceDeleteUserFromSharedAppleDevice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceDeleteUserFromSharedAppleDeviceRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Void.class);
        body = new ManagedDeviceDeleteUserFromSharedAppleDeviceBody();
    }

    public void post(final ICallback<Void> callback) {
        send(HttpMethod.POST, callback, body);
    }

    public Void post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IManagedDeviceDeleteUserFromSharedAppleDeviceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ManagedDeviceDeleteUserFromSharedAppleDeviceRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IManagedDeviceDeleteUserFromSharedAppleDeviceRequest top(final int value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (ManagedDeviceDeleteUserFromSharedAppleDeviceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IManagedDeviceDeleteUserFromSharedAppleDeviceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ManagedDeviceDeleteUserFromSharedAppleDeviceRequest)this;
    }

}
