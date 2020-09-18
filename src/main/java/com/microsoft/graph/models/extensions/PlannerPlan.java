// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.IdentitySet;
import com.microsoft.graph.models.extensions.PlannerBucket;
import com.microsoft.graph.models.extensions.PlannerPlanDetails;
import com.microsoft.graph.models.extensions.PlannerTask;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.PlannerBucketCollectionResponse;
import com.microsoft.graph.requests.extensions.PlannerBucketCollectionPage;
import com.microsoft.graph.requests.extensions.PlannerTaskCollectionResponse;
import com.microsoft.graph.requests.extensions.PlannerTaskCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Plan.
 */
public class PlannerPlan extends Entity implements IJsonBackedObject {


    /**
     * The Created By.
     * Read-only. The user who created the plan.
     */
    @SerializedName("createdBy")
    @Expose
    public IdentitySet createdBy;

    /**
     * The Created Date Time.
     * Read-only. Date and time at which the plan is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Owner.
     * ID of the Group that owns the plan. A valid group must exist before this field can be set. After it is set, this property can’t be updated.
     */
    @SerializedName("owner")
    @Expose
    public String owner;

    /**
     * The Title.
     * Required. Title of the plan.
     */
    @SerializedName("title")
    @Expose
    public String title;

    /**
     * The Buckets.
     * Read-only. Nullable. Collection of buckets in the plan.
     */
    @SerializedName("buckets")
    @Expose
    public PlannerBucketCollectionPage buckets;

    /**
     * The Details.
     * Read-only. Nullable. Additional details about the plan.
     */
    @SerializedName("details")
    @Expose
    public PlannerPlanDetails details;

    /**
     * The Tasks.
     * Read-only. Nullable. Collection of tasks in the plan.
     */
    @SerializedName("tasks")
    @Expose
    public PlannerTaskCollectionPage tasks;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("buckets")) {
            final PlannerBucketCollectionResponse response = new PlannerBucketCollectionResponse();
            if (json.has("buckets@odata.nextLink")) {
                response.nextLink = json.get("buckets@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("buckets").toString(), JsonObject[].class);
            final PlannerBucket[] array = new PlannerBucket[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), PlannerBucket.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            buckets = new PlannerBucketCollectionPage(response, null);
        }

        if (json.has("tasks")) {
            final PlannerTaskCollectionResponse response = new PlannerTaskCollectionResponse();
            if (json.has("tasks@odata.nextLink")) {
                response.nextLink = json.get("tasks@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("tasks").toString(), JsonObject[].class);
            final PlannerTask[] array = new PlannerTask[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), PlannerTask.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            tasks = new PlannerTaskCollectionPage(response, null);
        }
    }
}
