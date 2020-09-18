// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.AutomaticUpdateMode;
import com.microsoft.graph.models.generated.WindowsUpdateType;
import com.microsoft.graph.models.generated.WindowsDeliveryOptimizationMode;
import com.microsoft.graph.models.extensions.WindowsUpdateInstallScheduleType;
import com.microsoft.graph.models.generated.PrereleaseFeatures;
import com.microsoft.graph.models.extensions.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Update For Business Configuration.
 */
public class WindowsUpdateForBusinessConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Automatic Update Mode.
     * Automatic update mode. Possible values are: userDefined, notifyDownload, autoInstallAtMaintenanceTime, autoInstallAndRebootAtMaintenanceTime, autoInstallAndRebootAtScheduledTime, autoInstallAndRebootWithoutEndUserControl.
     */
    @SerializedName("automaticUpdateMode")
    @Expose
    public AutomaticUpdateMode automaticUpdateMode;

    /**
     * The Business Ready Updates Only.
     * Determines which branch devices will receive their updates from. Possible values are: userDefined, all, businessReadyOnly, windowsInsiderBuildFast, windowsInsiderBuildSlow, windowsInsiderBuildRelease.
     */
    @SerializedName("businessReadyUpdatesOnly")
    @Expose
    public WindowsUpdateType businessReadyUpdatesOnly;

    /**
     * The Delivery Optimization Mode.
     * Delivery Optimization Mode. Possible values are: userDefined, httpOnly, httpWithPeeringNat, httpWithPeeringPrivateGroup, httpWithInternetPeering, simpleDownload, bypassMode.
     */
    @SerializedName("deliveryOptimizationMode")
    @Expose
    public WindowsDeliveryOptimizationMode deliveryOptimizationMode;

    /**
     * The Drivers Excluded.
     * Exclude Windows update Drivers
     */
    @SerializedName("driversExcluded")
    @Expose
    public Boolean driversExcluded;

    /**
     * The Feature Updates Deferral Period In Days.
     * Defer Feature Updates by these many days
     */
    @SerializedName("featureUpdatesDeferralPeriodInDays")
    @Expose
    public Integer featureUpdatesDeferralPeriodInDays;

    /**
     * The Feature Updates Paused.
     * Pause Feature Updates
     */
    @SerializedName("featureUpdatesPaused")
    @Expose
    public Boolean featureUpdatesPaused;

    /**
     * The Feature Updates Pause Expiry Date Time.
     * Feature Updates Pause Expiry datetime
     */
    @SerializedName("featureUpdatesPauseExpiryDateTime")
    @Expose
    public java.util.Calendar featureUpdatesPauseExpiryDateTime;

    /**
     * The Installation Schedule.
     * Installation schedule
     */
    @SerializedName("installationSchedule")
    @Expose
    public WindowsUpdateInstallScheduleType installationSchedule;

    /**
     * The Microsoft Update Service Allowed.
     * Allow Microsoft Update Service
     */
    @SerializedName("microsoftUpdateServiceAllowed")
    @Expose
    public Boolean microsoftUpdateServiceAllowed;

    /**
     * The Prerelease Features.
     * The pre-release features. Possible values are: userDefined, settingsOnly, settingsAndExperimentations, notAllowed.
     */
    @SerializedName("prereleaseFeatures")
    @Expose
    public PrereleaseFeatures prereleaseFeatures;

    /**
     * The Quality Updates Deferral Period In Days.
     * Defer Quality Updates by these many days
     */
    @SerializedName("qualityUpdatesDeferralPeriodInDays")
    @Expose
    public Integer qualityUpdatesDeferralPeriodInDays;

    /**
     * The Quality Updates Paused.
     * Pause Quality Updates
     */
    @SerializedName("qualityUpdatesPaused")
    @Expose
    public Boolean qualityUpdatesPaused;

    /**
     * The Quality Updates Pause Expiry Date Time.
     * Quality Updates Pause Expiry datetime
     */
    @SerializedName("qualityUpdatesPauseExpiryDateTime")
    @Expose
    public java.util.Calendar qualityUpdatesPauseExpiryDateTime;


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
