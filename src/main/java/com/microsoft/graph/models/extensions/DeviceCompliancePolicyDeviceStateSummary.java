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
 * The class for the Device Compliance Policy Device State Summary.
 */
public class DeviceCompliancePolicyDeviceStateSummary extends Entity implements IJsonBackedObject {


    /**
     * The Compliant Device Count.
     * Number of compliant devices
     */
    @SerializedName("compliantDeviceCount")
    @Expose
    public Integer compliantDeviceCount;

    /**
     * The Config Manager Count.
     * Number of devices that have compliance managed by System Center Configuration Manager
     */
    @SerializedName("configManagerCount")
    @Expose
    public Integer configManagerCount;

    /**
     * The Conflict Device Count.
     * Number of conflict devices
     */
    @SerializedName("conflictDeviceCount")
    @Expose
    public Integer conflictDeviceCount;

    /**
     * The Error Device Count.
     * Number of error devices
     */
    @SerializedName("errorDeviceCount")
    @Expose
    public Integer errorDeviceCount;

    /**
     * The In Grace Period Count.
     * Number of devices that are in grace period
     */
    @SerializedName("inGracePeriodCount")
    @Expose
    public Integer inGracePeriodCount;

    /**
     * The Non Compliant Device Count.
     * Number of NonCompliant devices
     */
    @SerializedName("nonCompliantDeviceCount")
    @Expose
    public Integer nonCompliantDeviceCount;

    /**
     * The Not Applicable Device Count.
     * Number of not applicable devices
     */
    @SerializedName("notApplicableDeviceCount")
    @Expose
    public Integer notApplicableDeviceCount;

    /**
     * The Remediated Device Count.
     * Number of remediated devices
     */
    @SerializedName("remediatedDeviceCount")
    @Expose
    public Integer remediatedDeviceCount;

    /**
     * The Unknown Device Count.
     * Number of unknown devices
     */
    @SerializedName("unknownDeviceCount")
    @Expose
    public Integer unknownDeviceCount;


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
