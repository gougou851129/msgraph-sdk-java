// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PlannerPlanDetails;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Plan Details Request.
 */
public class PlannerPlanDetailsRequest extends BaseRequest implements IPlannerPlanDetailsRequest {
	
    /**
     * The request for the PlannerPlanDetails
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlannerPlanDetailsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PlannerPlanDetails.class);
    }

    /**
     * Gets the PlannerPlanDetails from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<PlannerPlanDetails> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PlannerPlanDetails from the service
     *
     * @return the PlannerPlanDetails from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerPlanDetails get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<PlannerPlanDetails> callback) {
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
     * Patches this PlannerPlanDetails with a source
     *
     * @param sourcePlannerPlanDetails the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PlannerPlanDetails sourcePlannerPlanDetails, final ICallback<PlannerPlanDetails> callback) {
        send(HttpMethod.PATCH, callback, sourcePlannerPlanDetails);
    }

    /**
     * Patches this PlannerPlanDetails with a source
     *
     * @param sourcePlannerPlanDetails the source object with updates
     * @return the updated PlannerPlanDetails
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerPlanDetails patch(final PlannerPlanDetails sourcePlannerPlanDetails) throws ClientException {
        return send(HttpMethod.PATCH, sourcePlannerPlanDetails);
    }

    /**
     * Creates a PlannerPlanDetails with a new object
     *
     * @param newPlannerPlanDetails the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PlannerPlanDetails newPlannerPlanDetails, final ICallback<PlannerPlanDetails> callback) {
        send(HttpMethod.POST, callback, newPlannerPlanDetails);
    }

    /**
     * Creates a PlannerPlanDetails with a new object
     *
     * @param newPlannerPlanDetails the new object to create
     * @return the created PlannerPlanDetails
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerPlanDetails post(final PlannerPlanDetails newPlannerPlanDetails) throws ClientException {
        return send(HttpMethod.POST, newPlannerPlanDetails);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPlannerPlanDetailsRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PlannerPlanDetailsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPlannerPlanDetailsRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PlannerPlanDetailsRequest)this;
     }

}

