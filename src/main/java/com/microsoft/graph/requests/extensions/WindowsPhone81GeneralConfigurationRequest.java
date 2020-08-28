// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsPhone81GeneralConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Phone81General Configuration Request.
 */
public class WindowsPhone81GeneralConfigurationRequest extends BaseRequest implements IWindowsPhone81GeneralConfigurationRequest {
	
    /**
     * The request for the WindowsPhone81GeneralConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsPhone81GeneralConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsPhone81GeneralConfiguration.class);
    }

    /**
     * Gets the WindowsPhone81GeneralConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WindowsPhone81GeneralConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsPhone81GeneralConfiguration from the service
     *
     * @return the WindowsPhone81GeneralConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsPhone81GeneralConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<WindowsPhone81GeneralConfiguration> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WindowsPhone81GeneralConfiguration with a source
     *
     * @param sourceWindowsPhone81GeneralConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WindowsPhone81GeneralConfiguration sourceWindowsPhone81GeneralConfiguration, final ICallback<WindowsPhone81GeneralConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsPhone81GeneralConfiguration);
    }

    /**
     * Patches this WindowsPhone81GeneralConfiguration with a source
     *
     * @param sourceWindowsPhone81GeneralConfiguration the source object with updates
     * @return the updated WindowsPhone81GeneralConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsPhone81GeneralConfiguration patch(final WindowsPhone81GeneralConfiguration sourceWindowsPhone81GeneralConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsPhone81GeneralConfiguration);
    }

    /**
     * Creates a WindowsPhone81GeneralConfiguration with a new object
     *
     * @param newWindowsPhone81GeneralConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WindowsPhone81GeneralConfiguration newWindowsPhone81GeneralConfiguration, final ICallback<WindowsPhone81GeneralConfiguration> callback) {
        send(HttpMethod.POST, callback, newWindowsPhone81GeneralConfiguration);
    }

    /**
     * Creates a WindowsPhone81GeneralConfiguration with a new object
     *
     * @param newWindowsPhone81GeneralConfiguration the new object to create
     * @return the created WindowsPhone81GeneralConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsPhone81GeneralConfiguration post(final WindowsPhone81GeneralConfiguration newWindowsPhone81GeneralConfiguration) throws ClientException {
        return send(HttpMethod.POST, newWindowsPhone81GeneralConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindowsPhone81GeneralConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WindowsPhone81GeneralConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindowsPhone81GeneralConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WindowsPhone81GeneralConfigurationRequest)this;
     }

}

