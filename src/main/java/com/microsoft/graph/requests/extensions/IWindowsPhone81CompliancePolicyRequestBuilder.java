// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsPhone81CompliancePolicy;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Phone81Compliance Policy Request Builder.
 */
public interface IWindowsPhone81CompliancePolicyRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IWindowsPhone81CompliancePolicyRequest instance
     */
    IWindowsPhone81CompliancePolicyRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IWindowsPhone81CompliancePolicyRequest instance
     */
    IWindowsPhone81CompliancePolicyRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IDeviceComplianceScheduledActionForRuleCollectionRequestBuilder scheduledActionsForRule();

    IDeviceComplianceScheduledActionForRuleRequestBuilder scheduledActionsForRule(final String id);

    IDeviceComplianceDeviceStatusCollectionRequestBuilder deviceStatuses();

    IDeviceComplianceDeviceStatusRequestBuilder deviceStatuses(final String id);

    IDeviceComplianceUserStatusCollectionRequestBuilder userStatuses();

    IDeviceComplianceUserStatusRequestBuilder userStatuses(final String id);

    /**
     * Gets the request builder for DeviceComplianceDeviceOverview
     *
     * @return the IDeviceComplianceDeviceOverviewRequestBuilder instance
     */
    IDeviceComplianceDeviceOverviewRequestBuilder deviceStatusOverview();

    /**
     * Gets the request builder for DeviceComplianceUserOverview
     *
     * @return the IDeviceComplianceUserOverviewRequestBuilder instance
     */
    IDeviceComplianceUserOverviewRequestBuilder userStatusOverview();

    ISettingStateDeviceSummaryCollectionRequestBuilder deviceSettingStateSummaries();

    ISettingStateDeviceSummaryRequestBuilder deviceSettingStateSummaries(final String id);

    IDeviceCompliancePolicyAssignmentCollectionRequestBuilder assignments();

    IDeviceCompliancePolicyAssignmentRequestBuilder assignments(final String id);

}