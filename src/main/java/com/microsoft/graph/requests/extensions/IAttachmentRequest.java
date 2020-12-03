// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Attachment;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Attachment Request.
 */
public interface IAttachmentRequest extends IHttpRequest {

    /**
     * Gets the Attachment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Attachment> callback);

    /**
     * Gets the Attachment from the service
     *
     * @return the Attachment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Attachment get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super Attachment> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Attachment with a source
     *
     * @param sourceAttachment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Attachment sourceAttachment, final ICallback<? super Attachment> callback);

    /**
     * Patches this Attachment with a source
     *
     * @param sourceAttachment the source object with updates
     * @return the updated Attachment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Attachment patch(final Attachment sourceAttachment) throws ClientException;

    /**
     * Posts a Attachment with a new object
     *
     * @param newAttachment the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Attachment newAttachment, final ICallback<? super Attachment> callback);

    /**
     * Posts a Attachment with a new object
     *
     * @param newAttachment the new object to create
     * @return the created Attachment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Attachment post(final Attachment newAttachment) throws ClientException;

    /**
     * Posts a Attachment with a new object
     *
     * @param newAttachment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Attachment newAttachment, final ICallback<? super Attachment> callback);

    /**
     * Posts a Attachment with a new object
     *
     * @param newAttachment the object to create/update
     * @return the created Attachment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Attachment put(final Attachment newAttachment) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAttachmentRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAttachmentRequest expand(final String value);

}
