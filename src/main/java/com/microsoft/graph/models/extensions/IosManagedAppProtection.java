// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ManagedAppDataEncryptionType;
import com.microsoft.graph.models.extensions.ManagedMobileApp;
import com.microsoft.graph.models.extensions.ManagedAppPolicyDeploymentSummary;
import com.microsoft.graph.models.extensions.TargetedManagedAppProtection;
import com.microsoft.graph.requests.extensions.ManagedMobileAppCollectionResponse;
import com.microsoft.graph.requests.extensions.ManagedMobileAppCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Managed App Protection.
 */
public class IosManagedAppProtection extends TargetedManagedAppProtection implements IJsonBackedObject {


    /**
     * The App Data Encryption Type.
     * Type of encryption which should be used for data in a managed app. Possible values are: useDeviceSettings, afterDeviceRestart, whenDeviceLockedExceptOpenFiles, whenDeviceLocked.
     */
    @SerializedName("appDataEncryptionType")
    @Expose
    public ManagedAppDataEncryptionType appDataEncryptionType;

    /**
     * The Custom Browser Protocol.
     * A custom browser protocol to open weblink on iOS. When this property is configured, ManagedBrowserToOpenLinksRequired should be true.
     */
    @SerializedName("customBrowserProtocol")
    @Expose
    public String customBrowserProtocol;

    /**
     * The Deployed App Count.
     * Count of apps to which the current policy is deployed.
     */
    @SerializedName("deployedAppCount")
    @Expose
    public Integer deployedAppCount;

    /**
     * The Face Id Blocked.
     * Indicates whether use of the FaceID is allowed in place of a pin if PinRequired is set to True.
     */
    @SerializedName("faceIdBlocked")
    @Expose
    public Boolean faceIdBlocked;

    /**
     * The Minimum Required Sdk Version.
     * Versions less than the specified version will block the managed app from accessing company data.
     */
    @SerializedName("minimumRequiredSdkVersion")
    @Expose
    public String minimumRequiredSdkVersion;

    /**
     * The Apps.
     * List of apps to which the policy is deployed.
     */
    @SerializedName("apps")
    @Expose
    public ManagedMobileAppCollectionPage apps;

    /**
     * The Deployment Summary.
     * Navigation property to deployment summary of the configuration.
     */
    @SerializedName("deploymentSummary")
    @Expose
    public ManagedAppPolicyDeploymentSummary deploymentSummary;


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


        if (json.has("apps")) {
            final ManagedMobileAppCollectionResponse response = new ManagedMobileAppCollectionResponse();
            if (json.has("apps@odata.nextLink")) {
                response.nextLink = json.get("apps@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("apps").toString(), JsonObject[].class);
            final ManagedMobileApp[] array = new ManagedMobileApp[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ManagedMobileApp.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            apps = new ManagedMobileAppCollectionPage(response, null);
        }
    }
}
