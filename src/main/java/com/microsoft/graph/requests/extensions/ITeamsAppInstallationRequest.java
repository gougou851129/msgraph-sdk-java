// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TeamsAppInstallation;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Teams App Installation Request.
 */
public interface ITeamsAppInstallationRequest extends IHttpRequest {

    /**
     * Gets the TeamsAppInstallation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super TeamsAppInstallation> callback);

    /**
     * Gets the TeamsAppInstallation from the service
     *
     * @return the TeamsAppInstallation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TeamsAppInstallation get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super TeamsAppInstallation> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this TeamsAppInstallation with a source
     *
     * @param sourceTeamsAppInstallation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final TeamsAppInstallation sourceTeamsAppInstallation, final ICallback<? super TeamsAppInstallation> callback);

    /**
     * Patches this TeamsAppInstallation with a source
     *
     * @param sourceTeamsAppInstallation the source object with updates
     * @return the updated TeamsAppInstallation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TeamsAppInstallation patch(final TeamsAppInstallation sourceTeamsAppInstallation) throws ClientException;

    /**
     * Posts a TeamsAppInstallation with a new object
     *
     * @param newTeamsAppInstallation the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final TeamsAppInstallation newTeamsAppInstallation, final ICallback<? super TeamsAppInstallation> callback);

    /**
     * Posts a TeamsAppInstallation with a new object
     *
     * @param newTeamsAppInstallation the new object to create
     * @return the created TeamsAppInstallation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TeamsAppInstallation post(final TeamsAppInstallation newTeamsAppInstallation) throws ClientException;

    /**
     * Posts a TeamsAppInstallation with a new object
     *
     * @param newTeamsAppInstallation the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final TeamsAppInstallation newTeamsAppInstallation, final ICallback<? super TeamsAppInstallation> callback);

    /**
     * Posts a TeamsAppInstallation with a new object
     *
     * @param newTeamsAppInstallation the object to create/update
     * @return the created TeamsAppInstallation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TeamsAppInstallation put(final TeamsAppInstallation newTeamsAppInstallation) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ITeamsAppInstallationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ITeamsAppInstallationRequest expand(final String value);

}
