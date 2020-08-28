// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ServicePrincipal;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Service Principal Request.
 */
public interface IServicePrincipalRequest extends IHttpRequest {

    /**
     * Gets the ServicePrincipal from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<ServicePrincipal> callback);

    /**
     * Gets the ServicePrincipal from the service
     *
     * @return the ServicePrincipal from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ServicePrincipal get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<ServicePrincipal> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ServicePrincipal with a source
     *
     * @param sourceServicePrincipal the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ServicePrincipal sourceServicePrincipal, final ICallback<ServicePrincipal> callback);

    /**
     * Patches this ServicePrincipal with a source
     *
     * @param sourceServicePrincipal the source object with updates
     * @return the updated ServicePrincipal
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ServicePrincipal patch(final ServicePrincipal sourceServicePrincipal) throws ClientException;

    /**
     * Posts a ServicePrincipal with a new object
     *
     * @param newServicePrincipal the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ServicePrincipal newServicePrincipal, final ICallback<ServicePrincipal> callback);

    /**
     * Posts a ServicePrincipal with a new object
     *
     * @param newServicePrincipal the new object to create
     * @return the created ServicePrincipal
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ServicePrincipal post(final ServicePrincipal newServicePrincipal) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IServicePrincipalRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IServicePrincipalRequest expand(final String value);

}

