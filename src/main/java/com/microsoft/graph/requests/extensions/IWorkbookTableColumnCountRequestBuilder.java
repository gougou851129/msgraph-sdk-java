// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookTableColumnCountRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Table Column Count Request Builder.
 */
public interface IWorkbookTableColumnCountRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookTableColumnCountRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookTableColumnCountRequest instance
     */
    IWorkbookTableColumnCountRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookTableColumnCountRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookTableColumnCountRequest instance
     */
    IWorkbookTableColumnCountRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}