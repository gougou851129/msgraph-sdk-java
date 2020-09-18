// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.PlannerChecklistItems;
import com.microsoft.graph.models.generated.PlannerPreviewType;
import com.microsoft.graph.models.extensions.PlannerExternalReferences;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Task Details.
 */
public class PlannerTaskDetails extends Entity implements IJsonBackedObject {


    /**
     * The Checklist.
     * The collection of checklist items on the task.
     */
    @SerializedName("checklist")
    @Expose
    public PlannerChecklistItems checklist;

    /**
     * The Description.
     * Description of the task
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Preview Type.
     * This sets the type of preview that shows up on the task. The possible values are: automatic, noPreview, checklist, description, reference. When set to automatic the displayed preview is chosen by the app viewing the task.
     */
    @SerializedName("previewType")
    @Expose
    public PlannerPreviewType previewType;

    /**
     * The References.
     * The collection of references on the task.
     */
    @SerializedName("references")
    @Expose
    public PlannerExternalReferences references;


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

    }
}
