// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.IdentitySet;
import com.microsoft.graph.models.extensions.ItemReference;
import com.microsoft.graph.models.extensions.SharingInvitation;
import com.microsoft.graph.models.extensions.SharingLink;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Permission.
 */
public class Permission extends Entity implements IJsonBackedObject {


    /**
     * The Expiration Date Time.
     * A format of yyyy-MM-ddTHH:mm:ssZ of DateTimeOffset indicates the expiration time of the permission. DateTime.MinValue indicates there is no expiration set for this permission. Optional.
     */
    @SerializedName("expirationDateTime")
    @Expose
    public java.util.Calendar expirationDateTime;

    /**
     * The Granted To.
     * For user type permissions, the details of the users &amp; applications for this permission. Read-only.
     */
    @SerializedName("grantedTo")
    @Expose
    public IdentitySet grantedTo;

    /**
     * The Granted To Identities.
     * For link type permissions, the details of the users to whom permission was granted. Read-only.
     */
    @SerializedName("grantedToIdentities")
    @Expose
    public java.util.List<IdentitySet> grantedToIdentities;

    /**
     * The Has Password.
     * This indicates whether password is set for this permission, it's only showing in response. Optional and Read-only and for OneDrive Personal only.
     */
    @SerializedName("hasPassword")
    @Expose
    public Boolean hasPassword;

    /**
     * The Inherited From.
     * Provides a reference to the ancestor of the current permission, if it is inherited from an ancestor. Read-only.
     */
    @SerializedName("inheritedFrom")
    @Expose
    public ItemReference inheritedFrom;

    /**
     * The Invitation.
     * Details of any associated sharing invitation for this permission. Read-only.
     */
    @SerializedName("invitation")
    @Expose
    public SharingInvitation invitation;

    /**
     * The Link.
     * Provides the link details of the current permission, if it is a link type permissions. Read-only.
     */
    @SerializedName("link")
    @Expose
    public SharingLink link;

    /**
     * The Roles.
     * The type of permission, e.g. read. See below for the full list of roles. Read-only.
     */
    @SerializedName("roles")
    @Expose
    public java.util.List<String> roles;

    /**
     * The Share Id.
     * A unique token that can be used to access this shared item via the **shares** API. Read-only.
     */
    @SerializedName("shareId")
    @Expose
    public String shareId;


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
