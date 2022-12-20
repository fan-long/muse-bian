package org.museframework.bian.cencashan;

import org.museframework.bian.cencashan.dto.CaptureProjectionandAllocationRequest;
import org.museframework.bian.cencashan.dto.CaptureProjectionandAllocationResponse;
import org.museframework.bian.cencashan.dto.ControlProjectionandAllocationRequest;
import org.museframework.bian.cencashan.dto.ControlProjectionandAllocationResponse;
import org.museframework.bian.cencashan.dto.ExchangeProjectionandAllocationRequest;
import org.museframework.bian.cencashan.dto.ExchangeProjectionandAllocationResponse;
import org.museframework.bian.cencashan.dto.InitiateProjectionandAllocationRequest;
import org.museframework.bian.cencashan.dto.InitiateProjectionandAllocationResponse;
import org.museframework.bian.cencashan.dto.RetrieveProjectionandAllocationRequest;
import org.museframework.bian.cencashan.dto.RetrieveProjectionandAllocationResponse;
import org.museframework.bian.cencashan.dto.UpdateProjectionandAllocationRequest;
import org.museframework.bian.cencashan.dto.UpdateProjectionandAllocationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Set of rules for the purpose of deciding if or if not something is applicable  Examples: Staff assignment, Facility allocation.")
@GenericDomain(name="CentralCashHandling", group="ProjectionandAllocation")
public interface BqProjectionandAllocation {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Projection and Allocation activity or event related information")
    CaptureProjectionandAllocationResponse captureProjectionandAllocation(CaptureProjectionandAllocationRequest req);

    @GenericDtxEndpoint
    @Description("CoBQ Control the processing of Projection and Allocation")
    ControlProjectionandAllocationResponse controlProjectionandAllocation(ControlProjectionandAllocationRequest req);

    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Projection and Allocation processing")
    ExchangeProjectionandAllocationResponse exchangeProjectionandAllocation(ExchangeProjectionandAllocationRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Projection and Allocation")
    InitiateProjectionandAllocationResponse initiateProjectionandAllocation(InitiateProjectionandAllocationRequest req);

    @Description("ReBQ Retrieve details about any aspect of Projection and Allocation")
    RetrieveProjectionandAllocationResponse retrieveProjectionandAllocation(RetrieveProjectionandAllocationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Projection and Allocation")
    UpdateProjectionandAllocationResponse updateProjectionandAllocation(UpdateProjectionandAllocationRequest req);
}