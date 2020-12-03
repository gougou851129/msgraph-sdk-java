// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.EventMessage;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Event Message Request.
 */
public interface IEventMessageRequest extends IHttpRequest {

    /**
     * Gets the EventMessage from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super EventMessage> callback);

    /**
     * Gets the EventMessage from the service
     *
     * @return the EventMessage from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EventMessage get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super EventMessage> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this EventMessage with a source
     *
     * @param sourceEventMessage the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final EventMessage sourceEventMessage, final ICallback<? super EventMessage> callback);

    /**
     * Patches this EventMessage with a source
     *
     * @param sourceEventMessage the source object with updates
     * @return the updated EventMessage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EventMessage patch(final EventMessage sourceEventMessage) throws ClientException;

    /**
     * Posts a EventMessage with a new object
     *
     * @param newEventMessage the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final EventMessage newEventMessage, final ICallback<? super EventMessage> callback);

    /**
     * Posts a EventMessage with a new object
     *
     * @param newEventMessage the new object to create
     * @return the created EventMessage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EventMessage post(final EventMessage newEventMessage) throws ClientException;

    /**
     * Posts a EventMessage with a new object
     *
     * @param newEventMessage the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final EventMessage newEventMessage, final ICallback<? super EventMessage> callback);

    /**
     * Posts a EventMessage with a new object
     *
     * @param newEventMessage the object to create/update
     * @return the created EventMessage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EventMessage put(final EventMessage newEventMessage) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IEventMessageRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IEventMessageRequest expand(final String value);

}
