// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.AttendeeAvailability;
import com.microsoft.graph.models.extensions.Location;
import com.microsoft.graph.models.extensions.TimeSlot;
import com.microsoft.graph.models.generated.FreeBusyStatus;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Meeting Time Suggestion.
 */
public class MeetingTimeSuggestion implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Attendee Availability.
     * An array that shows the availability status of each attendee for this meeting suggestion.
     */
    @SerializedName("attendeeAvailability")
    @Expose
    public java.util.List<AttendeeAvailability> attendeeAvailability;

    /**
     * The Confidence.
     * A percentage that represents the likelhood of all the attendees attending.
     */
    @SerializedName("confidence")
    @Expose
    public Double confidence;

    /**
     * The Locations.
     * An array that specifies the name and geographic location of each meeting location for this meeting suggestion.
     */
    @SerializedName("locations")
    @Expose
    public java.util.List<Location> locations;

    /**
     * The Meeting Time Slot.
     * A time period suggested for the meeting.
     */
    @SerializedName("meetingTimeSlot")
    @Expose
    public TimeSlot meetingTimeSlot;

    /**
     * The Order.
     * Order of meeting time suggestions sorted by their computed confidence value from high to low, then by chronology if there are suggestions with the same confidence.
     */
    @SerializedName("order")
    @Expose
    public Integer order;

    /**
     * The Organizer Availability.
     * Availability of the meeting organizer for this meeting suggestion. The possible values are: free, tentative, busy, oof, workingElsewhere, unknown.
     */
    @SerializedName("organizerAvailability")
    @Expose
    public FreeBusyStatus organizerAvailability;

    /**
     * The Suggestion Reason.
     * Reason for suggesting the meeting time.
     */
    @SerializedName("suggestionReason")
    @Expose
    public String suggestionReason;


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
