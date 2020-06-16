// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.INamedLocationRequest;
import com.microsoft.graph.requests.extensions.NamedLocationRequest;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Named Location Request Builder.
 */
public class NamedLocationRequestBuilder extends BaseRequestBuilder implements INamedLocationRequestBuilder {

    /**
     * The request builder for the NamedLocation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public NamedLocationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the INamedLocationRequest instance
     */
    public INamedLocationRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the INamedLocationRequest instance
     */
    public INamedLocationRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new NamedLocationRequest(getRequestUrl(), getClient(), requestOptions);
    }


}
