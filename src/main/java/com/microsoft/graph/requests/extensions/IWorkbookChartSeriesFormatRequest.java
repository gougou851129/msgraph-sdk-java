// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookChartSeriesFormat;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Chart Series Format Request.
 */
public interface IWorkbookChartSeriesFormatRequest extends IHttpRequest {

    /**
     * Gets the WorkbookChartSeriesFormat from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super WorkbookChartSeriesFormat> callback);

    /**
     * Gets the WorkbookChartSeriesFormat from the service
     *
     * @return the WorkbookChartSeriesFormat from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChartSeriesFormat get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super WorkbookChartSeriesFormat> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WorkbookChartSeriesFormat with a source
     *
     * @param sourceWorkbookChartSeriesFormat the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WorkbookChartSeriesFormat sourceWorkbookChartSeriesFormat, final ICallback<? super WorkbookChartSeriesFormat> callback);

    /**
     * Patches this WorkbookChartSeriesFormat with a source
     *
     * @param sourceWorkbookChartSeriesFormat the source object with updates
     * @return the updated WorkbookChartSeriesFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChartSeriesFormat patch(final WorkbookChartSeriesFormat sourceWorkbookChartSeriesFormat) throws ClientException;

    /**
     * Posts a WorkbookChartSeriesFormat with a new object
     *
     * @param newWorkbookChartSeriesFormat the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WorkbookChartSeriesFormat newWorkbookChartSeriesFormat, final ICallback<? super WorkbookChartSeriesFormat> callback);

    /**
     * Posts a WorkbookChartSeriesFormat with a new object
     *
     * @param newWorkbookChartSeriesFormat the new object to create
     * @return the created WorkbookChartSeriesFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChartSeriesFormat post(final WorkbookChartSeriesFormat newWorkbookChartSeriesFormat) throws ClientException;

    /**
     * Posts a WorkbookChartSeriesFormat with a new object
     *
     * @param newWorkbookChartSeriesFormat the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final WorkbookChartSeriesFormat newWorkbookChartSeriesFormat, final ICallback<? super WorkbookChartSeriesFormat> callback);

    /**
     * Posts a WorkbookChartSeriesFormat with a new object
     *
     * @param newWorkbookChartSeriesFormat the object to create/update
     * @return the created WorkbookChartSeriesFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChartSeriesFormat put(final WorkbookChartSeriesFormat newWorkbookChartSeriesFormat) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWorkbookChartSeriesFormatRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWorkbookChartSeriesFormatRequest expand(final String value);

}
