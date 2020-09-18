// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DirectoryObject;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Endpoint.
 */
public class Endpoint extends DirectoryObject implements IJsonBackedObject {


    /**
     * The Capability.
     * Describes the capability that is associated with this resource. (e.g. Messages, Conversations, etc.)  Not nullable. Read-only.
     */
    @SerializedName("capability")
    @Expose
    public String capability;

    /**
     * The Provider Id.
     * Application id of the publishing underlying service. Not nullable. Read-only.
     */
    @SerializedName("providerId")
    @Expose
    public String providerId;

    /**
     * The Provider Name.
     * Name of the publishing underlying service. Read-only.
     */
    @SerializedName("providerName")
    @Expose
    public String providerName;

    /**
     * The Provider Resource Id.
     * For Microsoft 365 groups, this is set to a well-known name for the resource (e.g. Yammer.FeedURL etc.). Not nullable. Read-only.
     */
    @SerializedName("providerResourceId")
    @Expose
    public String providerResourceId;

    /**
     * The Uri.
     * URL of the published resource. Not nullable. Read-only.
     */
    @SerializedName("uri")
    @Expose
    public String uri;


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
