// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TeamsTemplate;
import com.microsoft.graph.requests.extensions.ITeamsTemplateCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.TeamsTemplateCollectionPage;
import com.microsoft.graph.requests.extensions.TeamsTemplateCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams Template Collection Page.
 */
public class TeamsTemplateCollectionPage extends BaseCollectionPage<TeamsTemplate, ITeamsTemplateCollectionRequestBuilder> implements ITeamsTemplateCollectionPage {

    /**
     * A collection page for TeamsTemplate
     *
     * @param response the serialized TeamsTemplateCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public TeamsTemplateCollectionPage(final TeamsTemplateCollectionResponse response, final ITeamsTemplateCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
