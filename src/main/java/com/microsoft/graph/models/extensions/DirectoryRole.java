// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.models.extensions.ScopedRoleMembership;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionResponse;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionPage;
import com.microsoft.graph.requests.extensions.ScopedRoleMembershipCollectionResponse;
import com.microsoft.graph.requests.extensions.ScopedRoleMembershipCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Role.
 */
public class DirectoryRole extends DirectoryObject implements IJsonBackedObject {


    /**
     * The Description.
     * The description for the directory role. Read-only.
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Display Name.
     * The display name for the directory role. Read-only.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Role Template Id.
     * The id of the directoryRoleTemplate that this role is based on. The property must be specified when activating a directory role in a tenant with a POST operation. After the directory role has been activated, the property is read only.
     */
    @SerializedName("roleTemplateId")
    @Expose
    public String roleTemplateId;

    /**
     * The Members.
     * Users that are members of this directory role. HTTP Methods: GET, POST, DELETE. Read-only. Nullable.
     */
    public DirectoryObjectCollectionPage members;

    /**
     * The Scoped Members.
     * 
     */
    @SerializedName("scopedMembers")
    @Expose
    public ScopedRoleMembershipCollectionPage scopedMembers;


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
            final DirectoryObjectCollectionResponse response = new DirectoryObjectCollectionResponse();
            if (json.has("members@odata.nextLink")) {
                response.nextLink = json.get("members@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("members").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            members = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("scopedMembers")) {
            final ScopedRoleMembershipCollectionResponse response = new ScopedRoleMembershipCollectionResponse();
            if (json.has("scopedMembers@odata.nextLink")) {
                response.nextLink = json.get("scopedMembers@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("scopedMembers").toString(), JsonObject[].class);
            final ScopedRoleMembership[] array = new ScopedRoleMembership[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ScopedRoleMembership.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            scopedMembers = new ScopedRoleMembershipCollectionPage(response, null);
        }
    }
}
