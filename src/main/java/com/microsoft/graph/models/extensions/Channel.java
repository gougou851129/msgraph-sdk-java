// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ChannelMembershipType;
import com.microsoft.graph.models.extensions.DriveItem;
import com.microsoft.graph.models.extensions.ConversationMember;
import com.microsoft.graph.models.extensions.ChatMessage;
import com.microsoft.graph.models.extensions.TeamsTab;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.ConversationMemberCollectionResponse;
import com.microsoft.graph.requests.extensions.ConversationMemberCollectionPage;
import com.microsoft.graph.requests.extensions.ChatMessageCollectionResponse;
import com.microsoft.graph.requests.extensions.ChatMessageCollectionPage;
import com.microsoft.graph.requests.extensions.TeamsTabCollectionResponse;
import com.microsoft.graph.requests.extensions.TeamsTabCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Channel.
 */
public class Channel extends Entity implements IJsonBackedObject {


    /**
     * The Description.
     * Optional textual description for the channel.
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Display Name.
     * Channel name as it will appear to the user in Microsoft Teams.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Email.
     * The email address for sending messages to the channel. Read-only.
     */
    @SerializedName("email")
    @Expose
    public String email;

    /**
     * The Membership Type.
     * 
     */
    @SerializedName("membershipType")
    @Expose
    public ChannelMembershipType membershipType;

    /**
     * The Web Url.
     * A hyperlink that will navigate to the channel in Microsoft Teams. This is the URL that you get when you right-click a channel in Microsoft Teams and select Get link to channel. This URL should be treated as an opaque blob, and not parsed. Read-only.
     */
    @SerializedName("webUrl")
    @Expose
    public String webUrl;

    /**
     * The Files Folder.
     * Metadata for the location where the channel's files are stored.
     */
    @SerializedName("filesFolder")
    @Expose
    public DriveItem filesFolder;

    /**
     * The Members.
     * 
     */
    @SerializedName("members")
    @Expose
    public ConversationMemberCollectionPage members;

    /**
     * The Messages.
     * A collection of all the messages in the channel. A navigation property. Nullable.
     */
    @SerializedName("messages")
    @Expose
    public ChatMessageCollectionPage messages;

    /**
     * The Tabs.
     * A collection of all the tabs in the channel. A navigation property.
     */
    @SerializedName("tabs")
    @Expose
    public TeamsTabCollectionPage tabs;


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


        if (json.has("members")) {
            final ConversationMemberCollectionResponse response = new ConversationMemberCollectionResponse();
            if (json.has("members@odata.nextLink")) {
                response.nextLink = json.get("members@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("members").toString(), JsonObject[].class);
            final ConversationMember[] array = new ConversationMember[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ConversationMember.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            members = new ConversationMemberCollectionPage(response, null);
        }

        if (json.has("messages")) {
            final ChatMessageCollectionResponse response = new ChatMessageCollectionResponse();
            if (json.has("messages@odata.nextLink")) {
                response.nextLink = json.get("messages@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("messages").toString(), JsonObject[].class);
            final ChatMessage[] array = new ChatMessage[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ChatMessage.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            messages = new ChatMessageCollectionPage(response, null);
        }

        if (json.has("tabs")) {
            final TeamsTabCollectionResponse response = new TeamsTabCollectionResponse();
            if (json.has("tabs@odata.nextLink")) {
                response.nextLink = json.get("tabs@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("tabs").toString(), JsonObject[].class);
            final TeamsTab[] array = new TeamsTab[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), TeamsTab.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            tabs = new TeamsTabCollectionPage(response, null);
        }
    }
}
