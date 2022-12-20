package org.museframework.bian.issdevtra;

import org.museframework.bian.issdevtra.dto.CaptureInternalNotificationRequest;
import org.museframework.bian.issdevtra.dto.CaptureInternalNotificationResponse;
import org.museframework.bian.issdevtra.dto.RetrieveInternalNotificationRequest;
import org.museframework.bian.issdevtra.dto.RetrieveInternalNotificationResponse;
import org.museframework.bian.issdevtra.dto.UpdateInternalNotificationRequest;
import org.museframework.bian.issdevtra.dto.UpdateInternalNotificationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of information feeds/measures that can be used to track the status of one or more items/entitites  Examples: Composite position, Customer alert")
@GenericDomain(name="IssuedDeviceTracking", group="InternalNotification")
public interface BqInternalNotification {
    @GenericDtxEndpoint
    @Description("UpBQ Update captured internal status details for an issued device")
    UpdateInternalNotificationResponse updateInternalNotification(UpdateInternalNotificationRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture status notification for an issued device")
    CaptureInternalNotificationResponse captureInternalNotification(CaptureInternalNotificationRequest req);

    @Description("ReBQ Retrieve internal status notification details")
    RetrieveInternalNotificationResponse retrieveInternalNotification(RetrieveInternalNotificationRequest req);
}