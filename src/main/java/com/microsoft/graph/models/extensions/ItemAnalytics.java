// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ItemActivityStat;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.ItemActivityStatCollectionResponse;
import com.microsoft.graph.requests.extensions.ItemActivityStatCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Analytics.
 */
public class ItemAnalytics extends Entity implements IJsonBackedObject {


    /**
     * The All Time.
     * 
     */
    @SerializedName("allTime")
    @Expose
    public ItemActivityStat allTime;

    /**
     * The Item Activity Stats.
     * 
     */
    @SerializedName("itemActivityStats")
    @Expose
    public ItemActivityStatCollectionPage itemActivityStats;

    /**
     * The Last Seven Days.
     * 
     */
    @SerializedName("lastSevenDays")
    @Expose
    public ItemActivityStat lastSevenDays;


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


        if (json.has("itemActivityStats")) {
            final ItemActivityStatCollectionResponse response = new ItemActivityStatCollectionResponse();
            if (json.has("itemActivityStats@odata.nextLink")) {
                response.nextLink = json.get("itemActivityStats@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("itemActivityStats").toString(), JsonObject[].class);
            final ItemActivityStat[] array = new ItemActivityStat[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ItemActivityStat.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            itemActivityStats = new ItemActivityStatCollectionPage(response, null);
        }
    }
}
