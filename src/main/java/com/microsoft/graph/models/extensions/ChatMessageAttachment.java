// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Chat Message Attachment.
 */
public class ChatMessageAttachment implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Content.
     * The content of the attachment. If the attachment is a rich card, set the property to the rich card object. This property and contentUrl are mutually exclusive.
     */
    @SerializedName("content")
    @Expose
    public String content;

    /**
     * The Content Type.
     * The media type of the content attachment. It can have the following values: reference: Attachment is a link to another file. Populate the contentURL with the link to the object.file: Raw file attachment. Populate the contenturl field with the base64 encoding of the file in data: format.image/: Image type with the type of the image specified ex: image/png, image/jpeg, image/gif. Populate the contentUrl field with the base64 encoding of the file in data: format.video/: Video type with the format specified. Ex: video/mp4. Populate the contentUrl field with the base64 encoding of the file in data: format.audio/: Audio type with the format specified. Ex: audio/wmw. Populate the contentUrl field with the base64 encoding of the file in data: format.application/card type: Rich card attachment type with the card type specifying the exact card format to use. Set content with the json format of the card. Supported values for card type include:application/vnd.microsoft.card.adaptive: A rich card that can contain any combination of text, speech, images,,buttons, and input fields. Set the content property to,an AdaptiveCard object.application/vnd.microsoft.card.animation: A rich card that plays animation. Set the content property,to an AnimationCardobject.application/vnd.microsoft.card.audio: A rich card that plays audio files. Set the content property,to an AudioCard object.application/vnd.microsoft.card.video: A rich card that plays videos. Set the content property,to a VideoCard object.application/vnd.microsoft.card.hero: A Hero card. Set the content property to a HeroCard object.application/vnd.microsoft.card.thumbnail: A Thumbnail card. Set the content property to a ThumbnailCard object.application/vnd.microsoft.com.card.receipt: A Receipt card. Set the content property to a ReceiptCard object.application/vnd.microsoft.com.card.signin: A user Sign In card. Set the content property to a SignInCard object.
     */
    @SerializedName("contentType")
    @Expose
    public String contentType;

    /**
     * The Content Url.
     * URL for the content of the attachment. Supported protocols: http, https, file and data.
     */
    @SerializedName("contentUrl")
    @Expose
    public String contentUrl;

    /**
     * The Id.
     * Read-only. Unique id of the attachment.
     */
    @SerializedName("id")
    @Expose
    public String id;

    /**
     * The Name.
     * Name of the attachment.
     */
    @SerializedName("name")
    @Expose
    public String name;

    /**
     * The Thumbnail Url.
     * URL to a thumbnail image that the channel can use if it supports using an alternative, smaller form of content or contentUrl. For example, if you set contentType to application/word and set contentUrl to the location of the Word document, you might include a thumbnail image that represents the document. The channel could display the thumbnail image instead of the document. When the user clicks the image, the channel would open the document.
     */
    @SerializedName("thumbnailUrl")
    @Expose
    public String thumbnailUrl;


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
