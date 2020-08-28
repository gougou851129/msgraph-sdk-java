// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Participant;
import com.microsoft.graph.requests.extensions.IParticipantCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ParticipantCollectionPage;
import com.microsoft.graph.requests.extensions.ParticipantCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Participant Collection Page.
 */
public class ParticipantCollectionPage extends BaseCollectionPage<Participant, IParticipantCollectionRequestBuilder> implements IParticipantCollectionPage {

    /**
     * A collection page for Participant
     *
     * @param response the serialized ParticipantCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ParticipantCollectionPage(final ParticipantCollectionResponse response, final IParticipantCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
