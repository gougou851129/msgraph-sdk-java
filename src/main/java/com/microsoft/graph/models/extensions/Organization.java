// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.AssignedPlan;
import com.microsoft.graph.models.extensions.PrivacyProfile;
import com.microsoft.graph.models.extensions.ProvisionedPlan;
import com.microsoft.graph.models.extensions.VerifiedDomain;
import com.microsoft.graph.models.generated.MdmAuthority;
import com.microsoft.graph.models.extensions.CertificateBasedAuthConfiguration;
import com.microsoft.graph.models.extensions.Extension;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.requests.extensions.CertificateBasedAuthConfigurationCollectionResponse;
import com.microsoft.graph.requests.extensions.CertificateBasedAuthConfigurationCollectionPage;
import com.microsoft.graph.requests.extensions.ExtensionCollectionResponse;
import com.microsoft.graph.requests.extensions.ExtensionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Organization.
 */
public class Organization extends DirectoryObject implements IJsonBackedObject {


    /**
     * The Assigned Plans.
     * The collection of service plans associated with the tenant. Not nullable.
     */
    @SerializedName("assignedPlans")
    @Expose
    public java.util.List<AssignedPlan> assignedPlans;

    /**
     * The Business Phones.
     * Telephone number for the organization. NOTE: Although this is a string collection, only one number can be set for this property.
     */
    @SerializedName("businessPhones")
    @Expose
    public java.util.List<String> businessPhones;

    /**
     * The City.
     * City name of the address for the organization.
     */
    @SerializedName("city")
    @Expose
    public String city;

    /**
     * The Country.
     * Country/region name of the address for the organization.
     */
    @SerializedName("country")
    @Expose
    public String country;

    /**
     * The Country Letter Code.
     * Country/region abbreviation for the organization.
     */
    @SerializedName("countryLetterCode")
    @Expose
    public String countryLetterCode;

    /**
     * The Created Date Time.
     * Timestamp of when the organization was created. The value cannot be modified and is automatically populated when the organization is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Display Name.
     * The display name for the tenant.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Marketing Notification Emails.
     * Not nullable.
     */
    @SerializedName("marketingNotificationEmails")
    @Expose
    public java.util.List<String> marketingNotificationEmails;

    /**
     * The On Premises Last Sync Date Time.
     * The time and date at which the tenant was last synced with the on-premise directory. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
     */
    @SerializedName("onPremisesLastSyncDateTime")
    @Expose
    public java.util.Calendar onPremisesLastSyncDateTime;

    /**
     * The On Premises Sync Enabled.
     * true if this object is synced from an on-premises directory; false if this object was originally synced from an on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory (default).
     */
    @SerializedName("onPremisesSyncEnabled")
    @Expose
    public Boolean onPremisesSyncEnabled;

    /**
     * The Postal Code.
     * Postal code of the address for the organization.
     */
    @SerializedName("postalCode")
    @Expose
    public String postalCode;

    /**
     * The Preferred Language.
     * The preferred language for the organization. Should follow ISO 639-1 Code; for example 'en'.
     */
    @SerializedName("preferredLanguage")
    @Expose
    public String preferredLanguage;

    /**
     * The Privacy Profile.
     * The privacy profile of an organization.
     */
    @SerializedName("privacyProfile")
    @Expose
    public PrivacyProfile privacyProfile;

    /**
     * The Provisioned Plans.
     * Not nullable.
     */
    @SerializedName("provisionedPlans")
    @Expose
    public java.util.List<ProvisionedPlan> provisionedPlans;

    /**
     * The Security Compliance Notification Mails.
     * 
     */
    @SerializedName("securityComplianceNotificationMails")
    @Expose
    public java.util.List<String> securityComplianceNotificationMails;

    /**
     * The Security Compliance Notification Phones.
     * 
     */
    @SerializedName("securityComplianceNotificationPhones")
    @Expose
    public java.util.List<String> securityComplianceNotificationPhones;

    /**
     * The State.
     * State name of the address for the organization.
     */
    @SerializedName("state")
    @Expose
    public String state;

    /**
     * The Street.
     * Street name of the address for organization.
     */
    @SerializedName("street")
    @Expose
    public String street;

    /**
     * The Technical Notification Mails.
     * Not nullable.
     */
    @SerializedName("technicalNotificationMails")
    @Expose
    public java.util.List<String> technicalNotificationMails;

    /**
     * The Tenant Type.
     * 
     */
    @SerializedName("tenantType")
    @Expose
    public String tenantType;

    /**
     * The Verified Domains.
     * The collection of domains associated with this tenant. Not nullable.
     */
    @SerializedName("verifiedDomains")
    @Expose
    public java.util.List<VerifiedDomain> verifiedDomains;

    /**
     * The Mobile Device Management Authority.
     * Mobile device management authority. Possible values are: unknown, intune, sccm, office365.
     */
    @SerializedName("mobileDeviceManagementAuthority")
    @Expose
    public MdmAuthority mobileDeviceManagementAuthority;

    /**
     * The Certificate Based Auth Configuration.
     * Navigation property to manage certificate-based authentication configuration. Only a single instance of certificateBasedAuthConfiguration can be created in the collection.
     */
    public CertificateBasedAuthConfigurationCollectionPage certificateBasedAuthConfiguration;

    /**
     * The Extensions.
     * The collection of open extensions defined for the organization. Read-only. Nullable.
     */
    @SerializedName("extensions")
    @Expose
    public ExtensionCollectionPage extensions;


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


        if (json.has("certificateBasedAuthConfiguration")) {
            final CertificateBasedAuthConfigurationCollectionResponse response = new CertificateBasedAuthConfigurationCollectionResponse();
            if (json.has("certificateBasedAuthConfiguration@odata.nextLink")) {
                response.nextLink = json.get("certificateBasedAuthConfiguration@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("certificateBasedAuthConfiguration").toString(), JsonObject[].class);
            final CertificateBasedAuthConfiguration[] array = new CertificateBasedAuthConfiguration[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), CertificateBasedAuthConfiguration.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            certificateBasedAuthConfiguration = new CertificateBasedAuthConfigurationCollectionPage(response, null);
        }

        if (json.has("extensions")) {
            final ExtensionCollectionResponse response = new ExtensionCollectionResponse();
            if (json.has("extensions@odata.nextLink")) {
                response.nextLink = json.get("extensions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("extensions").toString(), JsonObject[].class);
            final Extension[] array = new Extension[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Extension.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            extensions = new ExtensionCollectionPage(response, null);
        }
    }
}
