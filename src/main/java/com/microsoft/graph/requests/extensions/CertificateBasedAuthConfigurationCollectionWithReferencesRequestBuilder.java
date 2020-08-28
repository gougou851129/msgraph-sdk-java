// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Organization;
import com.microsoft.graph.models.extensions.CertificateBasedAuthConfiguration;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Certificate Based Auth Configuration Collection With References Request Builder.
 */
public class CertificateBasedAuthConfigurationCollectionWithReferencesRequestBuilder extends BaseRequestBuilder implements ICertificateBasedAuthConfigurationCollectionWithReferencesRequestBuilder {

    /**
     * The request builder for this collection of Organization
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CertificateBasedAuthConfigurationCollectionWithReferencesRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public ICertificateBasedAuthConfigurationCollectionWithReferencesRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public ICertificateBasedAuthConfigurationCollectionWithReferencesRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new CertificateBasedAuthConfigurationCollectionWithReferencesRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ICertificateBasedAuthConfigurationWithReferenceRequestBuilder byId(final String id) {
        return new CertificateBasedAuthConfigurationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }

    public ICertificateBasedAuthConfigurationCollectionReferenceRequestBuilder references(){
        return new CertificateBasedAuthConfigurationCollectionReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }
}
