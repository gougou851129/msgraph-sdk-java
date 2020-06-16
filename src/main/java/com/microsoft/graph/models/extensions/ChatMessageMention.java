// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.IdentitySet;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Chat Message Mention.
 */
public class ChatMessageMention extends Entity implements IJsonBackedObject {


    /**
     * The Id.
     * 
     */
    @SerializedName("id")
    @Expose
    public Integer id;

    /**
     * The Mention Text.
     * String used to represent the mention. For example, a user's display name, a team name.
     */
    @SerializedName("mentionText")
    @Expose
    public String mentionText;

    /**
     * The Mentioned.
     * The entity (user, application, team, or channel) that was mentioned.  If it was a channel or team that was @mentioned, the identitySet contains a conversation property giving the ID of the team/channel, and a conversationIdentityType property that represents either the team or channel.
     */
    @SerializedName("mentioned")
    @Expose
    public IdentitySet mentioned;


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