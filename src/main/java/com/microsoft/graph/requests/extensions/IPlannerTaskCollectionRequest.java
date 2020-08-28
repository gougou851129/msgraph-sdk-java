// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PlannerBucket;
import com.microsoft.graph.models.extensions.PlannerTask;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Planner Task Collection Request.
 */
public interface IPlannerTaskCollectionRequest {

    void get(final ICallback<IPlannerTaskCollectionPage> callback);

    IPlannerTaskCollectionPage get() throws ClientException;

    void post(final PlannerTask newPlannerTask, final ICallback<PlannerTask> callback);

    PlannerTask post(final PlannerTask newPlannerTask) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPlannerTaskCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPlannerTaskCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IPlannerTaskCollectionRequest top(final int value);

}
