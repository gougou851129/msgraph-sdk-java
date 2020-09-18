// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Call;
import com.microsoft.graph.callrecords.models.extensions.CallRecord;
import com.microsoft.graph.models.extensions.OnlineMeeting;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.CallCollectionResponse;
import com.microsoft.graph.requests.extensions.CallCollectionPage;
import com.microsoft.graph.callrecords.requests.extensions.CallRecordCollectionResponse;
import com.microsoft.graph.callrecords.requests.extensions.CallRecordCollectionPage;
import com.microsoft.graph.requests.extensions.OnlineMeetingCollectionResponse;
import com.microsoft.graph.requests.extensions.OnlineMeetingCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud Communications.
 */
public class CloudCommunications extends Entity implements IJsonBackedObject {


    /**
     * The Calls.
     * 
     */
    @SerializedName("calls")
    @Expose
    public CallCollectionPage calls;

    /**
     * The Call Records.
     * 
     */
    @SerializedName("callRecords")
    @Expose
    public CallRecordCollectionPage callRecords;

    /**
     * The Online Meetings.
     * 
     */
    @SerializedName("onlineMeetings")
    @Expose
    public OnlineMeetingCollectionPage onlineMeetings;


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


        if (json.has("calls")) {
            final CallCollectionResponse response = new CallCollectionResponse();
            if (json.has("calls@odata.nextLink")) {
                response.nextLink = json.get("calls@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("calls").toString(), JsonObject[].class);
            final Call[] array = new Call[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Call.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            calls = new CallCollectionPage(response, null);
        }

        if (json.has("callRecords")) {
            final CallRecordCollectionResponse response = new CallRecordCollectionResponse();
            if (json.has("callRecords@odata.nextLink")) {
                response.nextLink = json.get("callRecords@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("callRecords").toString(), JsonObject[].class);
            final CallRecord[] array = new CallRecord[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), CallRecord.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            callRecords = new CallRecordCollectionPage(response, null);
        }

        if (json.has("onlineMeetings")) {
            final OnlineMeetingCollectionResponse response = new OnlineMeetingCollectionResponse();
            if (json.has("onlineMeetings@odata.nextLink")) {
                response.nextLink = json.get("onlineMeetings@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("onlineMeetings").toString(), JsonObject[].class);
            final OnlineMeeting[] array = new OnlineMeeting[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), OnlineMeeting.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            onlineMeetings = new OnlineMeetingCollectionPage(response, null);
        }
    }
}
