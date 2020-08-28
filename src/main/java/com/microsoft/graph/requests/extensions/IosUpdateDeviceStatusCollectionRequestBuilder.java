// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.IosUpdateDeviceStatus;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IIosUpdateDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosUpdateDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosUpdateDeviceStatusCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Update Device Status Collection Request Builder.
 */
public class IosUpdateDeviceStatusCollectionRequestBuilder extends BaseRequestBuilder implements IIosUpdateDeviceStatusCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosUpdateDeviceStatusCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IIosUpdateDeviceStatusCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IIosUpdateDeviceStatusCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new IosUpdateDeviceStatusCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IIosUpdateDeviceStatusRequestBuilder byId(final String id) {
        return new IosUpdateDeviceStatusRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
