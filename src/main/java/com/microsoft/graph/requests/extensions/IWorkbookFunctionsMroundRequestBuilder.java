// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsMroundRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Mround Request Builder.
 */
public interface IWorkbookFunctionsMroundRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsMroundRequest
     *
     * @return the IWorkbookFunctionsMroundRequest instance
     */
    IWorkbookFunctionsMroundRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsMroundRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsMroundRequest instance
     */
    IWorkbookFunctionsMroundRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
