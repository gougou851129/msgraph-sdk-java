// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DateTimeTimeZone;
import com.microsoft.graph.models.generated.FreeBusyStatus;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Schedule Item.
 */
public class ScheduleItem implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The End.
     * The date, time, and time zone that the corresponding event ends.
     */
    @SerializedName("end")
    @Expose
    public DateTimeTimeZone end;

    /**
     * The Is Private.
     * The sensitivity of the corresponding event. True if the event is marked private, false otherwise. Optional.
     */
    @SerializedName("isPrivate")
    @Expose
    public Boolean isPrivate;

    /**
     * The Location.
     * The location where the corresponding event is held or attended from. Optional.
     */
    @SerializedName("location")
    @Expose
    public String location;

    /**
     * The Start.
     * The date, time, and time zone that the corresponding event starts.
     */
    @SerializedName("start")
    @Expose
    public DateTimeTimeZone start;

    /**
     * The Status.
     * The availability status of the user or resource during the corresponding event. The possible values are: free, tentative, busy, oof, workingElsewhere, unknown.
     */
    @SerializedName("status")
    @Expose
    public FreeBusyStatus status;

    /**
     * The Subject.
     * The corresponding event's subject line. Optional.
     */
    @SerializedName("subject")
    @Expose
    public String subject;


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
