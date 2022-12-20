package org.museframework.bian.marinfman;

import org.museframework.bian.marinfman.dto.CaptureReportingRequest;
import org.museframework.bian.marinfman.dto.CaptureReportingResponse;
import org.museframework.bian.marinfman.dto.CreateReportingRequest;
import org.museframework.bian.marinfman.dto.CreateReportingResponse;
import org.museframework.bian.marinfman.dto.ExecuteReportingRequest;
import org.museframework.bian.marinfman.dto.ExecuteReportingResponse;
import org.museframework.bian.marinfman.dto.RequestReportingRequest;
import org.museframework.bian.marinfman.dto.RequestReportingResponse;
import org.museframework.bian.marinfman.dto.RetrieveReportingRequest;
import org.museframework.bian.marinfman.dto.RetrieveReportingResponse;
import org.museframework.bian.marinfman.dto.UpdateReportingRequest;
import org.museframework.bian.marinfman.dto.UpdateReportingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more clerical routines that are to be followed to administer the operational unit/function  Examples: Time-sheet recording")
@GenericDomain(name="MarketInformationManagement", group="Reporting")
public interface BqReporting {
    @GenericDtxEndpoint
    @Description("CrBQ Create a specific report view of the financial market information")
    CreateReportingResponse createReporting(CreateReportingRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update properties of a structured view/report")
    UpdateReportingResponse updateReporting(UpdateReportingRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture usage details for the managed financial information/reports")
    CaptureReportingResponse captureReporting(CaptureReportingRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute an automated action for a report")
    ExecuteReportingResponse executeReporting(ExecuteReportingRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention")
    RequestReportingResponse requestReporting(RequestReportingRequest req);

    @Description("ReBQ Retrieve details about managed financial market reporting activity")
    RetrieveReportingResponse retrieveReporting(RetrieveReportingRequest req);
}