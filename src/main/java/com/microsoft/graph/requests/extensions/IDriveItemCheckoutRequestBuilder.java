// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDriveItemCheckoutRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Drive Item Checkout Request Builder.
 */
public interface IDriveItemCheckoutRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IDriveItemCheckoutRequest
     *
     * @return the IDriveItemCheckoutRequest instance
     */
    IDriveItemCheckoutRequest buildRequest();

    /**
     * Creates the IDriveItemCheckoutRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IDriveItemCheckoutRequest instance
     */
    IDriveItemCheckoutRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}