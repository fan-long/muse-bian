package org.museframework.bian.bralocman;

import org.museframework.bian.bralocman.dto.CaptureTroubleshootingRequest;
import org.museframework.bian.bralocman.dto.CaptureTroubleshootingResponse;
import org.museframework.bian.bralocman.dto.InitiateTroubleshootingRequest;
import org.museframework.bian.bralocman.dto.InitiateTroubleshootingResponse;
import org.museframework.bian.bralocman.dto.RequestTroubleshootingRequest;
import org.museframework.bian.bralocman.dto.RequestTroubleshootingResponse;
import org.museframework.bian.bralocman.dto.RetrieveTroubleshootingRequest;
import org.museframework.bian.bralocman.dto.RetrieveTroubleshootingResponse;
import org.museframework.bian.bralocman.dto.UpdateTroubleshootingRequest;
import org.museframework.bian.bralocman.dto.UpdateTroubleshootingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues  within Branch Location Management. Example: Manage the day to day activities at a bank branch location.")
@GenericDomain(name="BranchLocationManagement", group="Troubleshooting")
public interface BqTroubleshooting {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Troubleshooting activity or event related information")
    CaptureTroubleshootingResponse captureTroubleshooting(CaptureTroubleshootingRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Troubleshooting")
    InitiateTroubleshootingResponse initiateTroubleshooting(InitiateTroubleshootingRequest req);

    @Description("ReBQ Retrieve details about any aspect of Troubleshooting")
    RetrieveTroubleshootingResponse retrieveTroubleshooting(RetrieveTroubleshootingRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Troubleshooting")
    RequestTroubleshootingResponse requestTroubleshooting(RequestTroubleshootingRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Troubleshooting")
    UpdateTroubleshootingResponse updateTroubleshooting(UpdateTroubleshootingRequest req);
}