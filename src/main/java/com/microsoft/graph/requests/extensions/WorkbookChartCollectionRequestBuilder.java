// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookWorksheet;
import com.microsoft.graph.models.extensions.WorkbookChart;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IWorkbookChartCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartCollectionRequest;
import com.microsoft.graph.requests.extensions.IWorkbookChartAddRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartItemAtRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartCountRequestBuilder;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Collection Request Builder.
 */
public class WorkbookChartCollectionRequestBuilder extends BaseRequestBuilder implements IWorkbookChartCollectionRequestBuilder {

    /**
     * The request builder for this collection of WorkbookWorksheet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IWorkbookChartCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IWorkbookChartCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new WorkbookChartCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IWorkbookChartRequestBuilder byId(final String id) {
        return new WorkbookChartRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    public IWorkbookChartAddRequestBuilder add(final String type, final com.google.gson.JsonElement sourceData, final String seriesBy) {
        return new WorkbookChartAddRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.add"), getClient(), null, type, sourceData, seriesBy);
    }

    public IWorkbookChartItemRequestBuilder item(final String name) {
        return new WorkbookChartItemRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.item"), getClient(), null, name);
    }

    public IWorkbookChartItemAtRequestBuilder itemAt(final Integer index) {
        return new WorkbookChartItemAtRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.itemAt"), getClient(), null, index);
    }

    public IWorkbookChartCountRequestBuilder count() {
        return new WorkbookChartCountRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.count"), getClient(), null);
    }
}
