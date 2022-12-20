package org.museframework.bian.contactrouting;

import org.museframework.bian.contactrouting.dto.CaptureAllocationRequest;
import org.museframework.bian.contactrouting.dto.CaptureAllocationResponse;
import org.museframework.bian.contactrouting.dto.RequestAllocationRequest;
import org.museframework.bian.contactrouting.dto.RequestAllocationResponse;
import org.museframework.bian.contactrouting.dto.RetrieveAllocationRequest;
import org.museframework.bian.contactrouting.dto.RetrieveAllocationResponse;
import org.museframework.bian.contactrouting.dto.UpdateAllocationRequest;
import org.museframework.bian.contactrouting.dto.UpdateAllocationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Set of rules for the purpose of deciding if or if not something is applicable  Examples: Staff assignment, Facility allocation.")
@GenericDomain(name="ContactRouting", group="Allocation")
public interface BqAllocation {
    @GenericDtxEndpoint
    @Description("PrBQ Request a servicing resource (can be qualification and future booking)")
    RequestAllocationResponse requestAllocation(RequestAllocationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of a servicing resource allocation")
    UpdateAllocationResponse updateAllocation(UpdateAllocationRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture data for an active allocation (e.g. availability)")
    CaptureAllocationResponse captureAllocation(CaptureAllocationRequest req);

    @Description("ReBQ Retrieve details about a servicing resource allocation")
    RetrieveAllocationResponse retrieveAllocation(RetrieveAllocationRequest req);
}