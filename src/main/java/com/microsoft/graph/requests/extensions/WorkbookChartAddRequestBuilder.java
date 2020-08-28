// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookChartAddRequest;
import com.microsoft.graph.requests.extensions.WorkbookChartAddRequest;
import com.microsoft.graph.models.extensions.WorkbookChart;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Add Request Builder.
 */
public class WorkbookChartAddRequestBuilder extends BaseActionRequestBuilder implements IWorkbookChartAddRequestBuilder {

    /**
     * The request builder for this WorkbookChartAdd
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param type the type
     * @param sourceData the sourceData
     * @param seriesBy the seriesBy
     */
    public WorkbookChartAddRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String type, final com.google.gson.JsonElement sourceData, final String seriesBy) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("type", type);
        bodyParams.put("sourceData", sourceData);
        bodyParams.put("seriesBy", seriesBy);
    }

    /**
     * Creates the IWorkbookChartAddRequest
     *
     * @return the IWorkbookChartAddRequest instance
     */
    public IWorkbookChartAddRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookChartAddRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookChartAddRequest instance
     */
    public IWorkbookChartAddRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookChartAddRequest request = new WorkbookChartAddRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("type")) {
            request.body.type = getParameter("type");
        }

        if (hasParameter("sourceData")) {
            request.body.sourceData = getParameter("sourceData");
        }

        if (hasParameter("seriesBy")) {
            request.body.seriesBy = getParameter("seriesBy");
        }

        return request;
    }
}
