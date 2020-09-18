// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.VppTokenSyncStatus;
import com.microsoft.graph.models.generated.VppTokenState;
import com.microsoft.graph.models.generated.VppTokenAccountType;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Vpp Token.
 */
public class VppToken extends Entity implements IJsonBackedObject {


    /**
     * The Apple Id.
     * The apple Id associated with the given Apple Volume Purchase Program Token.
     */
    @SerializedName("appleId")
    @Expose
    public String appleId;

    /**
     * The Automatically Update Apps.
     * Whether or not apps for the VPP token will be automatically updated.
     */
    @SerializedName("automaticallyUpdateApps")
    @Expose
    public Boolean automaticallyUpdateApps;

    /**
     * The Country Or Region.
     * Whether or not apps for the VPP token will be automatically updated.
     */
    @SerializedName("countryOrRegion")
    @Expose
    public String countryOrRegion;

    /**
     * The Expiration Date Time.
     * The expiration date time of the Apple Volume Purchase Program Token.
     */
    @SerializedName("expirationDateTime")
    @Expose
    public java.util.Calendar expirationDateTime;

    /**
     * The Last Modified Date Time.
     * Last modification date time associated with the Apple Volume Purchase Program Token.
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Last Sync Date Time.
     * The last time when an application sync was done with the Apple volume purchase program service using the Apple Volume Purchase Program Token.
     */
    @SerializedName("lastSyncDateTime")
    @Expose
    public java.util.Calendar lastSyncDateTime;

    /**
     * The Last Sync Status.
     * Current sync status of the last application sync which was triggered using the Apple Volume Purchase Program Token. Possible values are: none, inProgress, completed, failed. Possible values are: none, inProgress, completed, failed.
     */
    @SerializedName("lastSyncStatus")
    @Expose
    public VppTokenSyncStatus lastSyncStatus;

    /**
     * The Organization Name.
     * The organization associated with the Apple Volume Purchase Program Token
     */
    @SerializedName("organizationName")
    @Expose
    public String organizationName;

    /**
     * The State.
     * Current state of the Apple Volume Purchase Program Token. Possible values are: unknown, valid, expired, invalid, assignedToExternalMDM. Possible values are: unknown, valid, expired, invalid, assignedToExternalMDM.
     */
    @SerializedName("state")
    @Expose
    public VppTokenState state;

    /**
     * The Token.
     * The Apple Volume Purchase Program Token string downloaded from the Apple Volume Purchase Program.
     */
    @SerializedName("token")
    @Expose
    public String token;

    /**
     * The Vpp Token Account Type.
     * The type of volume purchase program which the given Apple Volume Purchase Program Token is associated with. Possible values are: business, education. Possible values are: business, education.
     */
    @SerializedName("vppTokenAccountType")
    @Expose
    public VppTokenAccountType vppTokenAccountType;


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
