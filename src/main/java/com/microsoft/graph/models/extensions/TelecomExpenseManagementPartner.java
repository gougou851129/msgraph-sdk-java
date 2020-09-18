// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Telecom Expense Management Partner.
 */
public class TelecomExpenseManagementPartner extends Entity implements IJsonBackedObject {


    /**
     * The App Authorized.
     * Whether the partner's AAD app has been authorized to access Intune.
     */
    @SerializedName("appAuthorized")
    @Expose
    public Boolean appAuthorized;

    /**
     * The Display Name.
     * Display name of the TEM partner.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Enabled.
     * Whether Intune's connection to the TEM service is currently enabled or disabled.
     */
    @SerializedName("enabled")
    @Expose
    public Boolean enabled;

    /**
     * The Last Connection Date Time.
     * Timestamp of the last request sent to Intune by the TEM partner.
     */
    @SerializedName("lastConnectionDateTime")
    @Expose
    public java.util.Calendar lastConnectionDateTime;

    /**
     * The Url.
     * URL of the TEM partner's administrative control panel, where an administrator can configure their TEM service.
     */
    @SerializedName("url")
    @Expose
    public String url;


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
