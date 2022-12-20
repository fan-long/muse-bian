package org.museframework.bian.cencashan;

import org.museframework.bian.cencashan.dto.CaptureTrackingandAllocationRequest;
import org.museframework.bian.cencashan.dto.CaptureTrackingandAllocationResponse;
import org.museframework.bian.cencashan.dto.ControlTrackingandAllocationRequest;
import org.museframework.bian.cencashan.dto.ControlTrackingandAllocationResponse;
import org.museframework.bian.cencashan.dto.ExchangeTrackingandAllocationRequest;
import org.museframework.bian.cencashan.dto.ExchangeTrackingandAllocationResponse;
import org.museframework.bian.cencashan.dto.InitiateTrackingandAllocationRequest;
import org.museframework.bian.cencashan.dto.InitiateTrackingandAllocationResponse;
import org.museframework.bian.cencashan.dto.RetrieveTrackingandAllocationRequest;
import org.museframework.bian.cencashan.dto.RetrieveTrackingandAllocationResponse;
import org.museframework.bian.cencashan.dto.UpdateTrackingandAllocationRequest;
import org.museframework.bian.cencashan.dto.UpdateTrackingandAllocationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Set of rules for the purpose of deciding if or if not something is applicable  Examples: Staff assignment, Facility allocation.")
@GenericDomain(name="CentralCashHandling", group="TrackingandAllocation")
public interface BqTrackingandAllocation {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Tracking and Allocation activity or event related information")
    CaptureTrackingandAllocationResponse captureTrackingandAllocation(CaptureTrackingandAllocationRequest req);

    @GenericDtxEndpoint
    @Description("CoBQ Control the processing of Tracking and Allocation")
    ControlTrackingandAllocationResponse controlTrackingandAllocation(ControlTrackingandAllocationRequest req);

    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Tracking and Allocation processing")
    ExchangeTrackingandAllocationResponse exchangeTrackingandAllocation(ExchangeTrackingandAllocationRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Tracking and Allocation")
    InitiateTrackingandAllocationResponse initiateTrackingandAllocation(InitiateTrackingandAllocationRequest req);

    @Description("ReBQ Retrieve details about any aspect of Tracking and Allocation")
    RetrieveTrackingandAllocationResponse retrieveTrackingandAllocation(RetrieveTrackingandAllocationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Tracking and Allocation")
    UpdateTrackingandAllocationResponse updateTrackingandAllocation(UpdateTrackingandAllocationRequest req);
}