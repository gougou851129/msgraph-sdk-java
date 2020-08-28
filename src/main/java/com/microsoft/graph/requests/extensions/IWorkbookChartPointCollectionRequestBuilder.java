// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartSeries;
import com.microsoft.graph.models.extensions.WorkbookChartPoint;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IWorkbookChartPointRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartPointCollectionRequest;
import com.microsoft.graph.requests.extensions.IWorkbookChartPointItemAtRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartPointCountRequestBuilder;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Chart Point Collection Request Builder.
 */
public interface IWorkbookChartPointCollectionRequestBuilder extends IRequestBuilder {

    IWorkbookChartPointCollectionRequest buildRequest();

    IWorkbookChartPointCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IWorkbookChartPointRequestBuilder byId(final String id);

    IWorkbookChartPointItemAtRequestBuilder itemAt(final Integer index);
    IWorkbookChartPointCountRequestBuilder count();
}
