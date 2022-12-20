package org.museframework.bian.issdevtra;

import org.museframework.bian.issdevtra.dto.CaptureExternalReportRequest;
import org.museframework.bian.issdevtra.dto.CaptureExternalReportResponse;
import org.museframework.bian.issdevtra.dto.RetrieveExternalReportRequest;
import org.museframework.bian.issdevtra.dto.RetrieveExternalReportResponse;
import org.museframework.bian.issdevtra.dto.UpdateExternalReportRequest;
import org.museframework.bian.issdevtra.dto.UpdateExternalReportResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of information feeds/measures that can be used to track the status of one or more items/entitites  Examples: Composite position, Customer alert")
@GenericDomain(name="IssuedDeviceTracking", group="ExternalReport")
public interface BqExternalReport {
    @GenericDtxEndpoint
    @Description("UpBQ Update captured externally reported status details for an issued device")
    UpdateExternalReportResponse updateExternalReport(UpdateExternalReportRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture external notification status details for an issued device")
    CaptureExternalReportResponse captureExternalReport(CaptureExternalReportRequest req);

    @Description("ReBQ Retrieve external status notification details")
    RetrieveExternalReportResponse retrieveExternalReport(RetrieveExternalReportRequest req);
}