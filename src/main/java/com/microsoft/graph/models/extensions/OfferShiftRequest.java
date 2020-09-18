// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ScheduleChangeRequest;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Offer Shift Request.
 */
public class OfferShiftRequest extends ScheduleChangeRequest implements IJsonBackedObject {


    /**
     * The Recipient Action Date Time.
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName("recipientActionDateTime")
    @Expose
    public java.util.Calendar recipientActionDateTime;

    /**
     * The Recipient Action Message.
     * Custom message sent by recipient of the offer shift request.
     */
    @SerializedName("recipientActionMessage")
    @Expose
    public String recipientActionMessage;

    /**
     * The Recipient User Id.
     * User ID of the recipient of the offer shift request.
     */
    @SerializedName("recipientUserId")
    @Expose
    public String recipientUserId;

    /**
     * The Sender Shift Id.
     * User ID of the sender of the offer shift request.
     */
    @SerializedName("senderShiftId")
    @Expose
    public String senderShiftId;


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
