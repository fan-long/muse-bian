package org.museframework.bian.cuscrerat;

import org.museframework.bian.cuscrerat.dto.CaptureExternalReportingRequest;
import org.museframework.bian.cuscrerat.dto.CaptureExternalReportingResponse;
import org.museframework.bian.cuscrerat.dto.RetrieveExternalReportingRequest;
import org.museframework.bian.cuscrerat.dto.RetrieveExternalReportingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of information feeds/measures that can be used to track the status of one or more items/entitites  Examples: Composite position, Customer alert")
@GenericDomain(name="CustomerCreditRating", group="ExternalReporting")
public interface BqExternalReporting {
    @GenericDtxEndpoint
    @Description("CaBQ Capture external credit reports to support credit analysis and state")
    CaptureExternalReportingResponse captureExternalReporting(CaptureExternalReportingRequest req);

    @Description("ReBQ Retrieve details about external reporting to the credit monitoring activity")
    RetrieveExternalReportingResponse retrieveExternalReporting(RetrieveExternalReportingRequest req);
}