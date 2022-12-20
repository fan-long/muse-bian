package org.museframework.bian.parroupro;

import org.museframework.bian.parroupro.dto.CaptureStatusRequest;
import org.museframework.bian.parroupro.dto.CaptureStatusResponse;
import org.museframework.bian.parroupro.dto.RetrieveStatusRequest;
import org.museframework.bian.parroupro.dto.RetrieveStatusResponse;
import org.museframework.bian.parroupro.dto.UpdateStatusRequest;
import org.museframework.bian.parroupro.dto.UpdateStatusResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of information feeds/measures that can be used to track the status of one or more items/entitites  Examples: Composite position, Customer alert")
@GenericDomain(name="PartyRoutingProfile", group="Status")
public interface BqStatus {
    @GenericDtxEndpoint
    @Description("UpBQ Update status measures for a monitored party")
    UpdateStatusResponse updateStatus(UpdateStatusRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture status measures for a monitored party")
    CaptureStatusResponse captureStatus(CaptureStatusRequest req);

    @Description("ReBQ Retrieve details about status measures for a party")
    RetrieveStatusResponse retrieveStatus(RetrieveStatusRequest req);
}