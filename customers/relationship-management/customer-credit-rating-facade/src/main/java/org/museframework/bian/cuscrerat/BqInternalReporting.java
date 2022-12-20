package org.museframework.bian.cuscrerat;

import org.museframework.bian.cuscrerat.dto.CaptureInternalReportingRequest;
import org.museframework.bian.cuscrerat.dto.CaptureInternalReportingResponse;
import org.museframework.bian.cuscrerat.dto.RetrieveInternalReportingRequest;
import org.museframework.bian.cuscrerat.dto.RetrieveInternalReportingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of information feeds/measures that can be used to track the status of one or more items/entitites  Examples: Composite position, Customer alert")
@GenericDomain(name="CustomerCreditRating", group="InternalReporting")
public interface BqInternalReporting {
    @GenericDtxEndpoint
    @Description("CaBQ Capture internal product reports to support credit analysis")
    CaptureInternalReportingResponse captureInternalReporting(CaptureInternalReportingRequest req);

    @Description("ReBQ Retrieve details about internal reporting to the credit monitoring activity")
    RetrieveInternalReportingResponse retrieveInternalReporting(RetrieveInternalReportingRequest req);
}