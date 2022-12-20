package org.museframework.bian.cencashan;

import org.museframework.bian.cencashan.dto.CaptureCentralCashAllocationRequest;
import org.museframework.bian.cencashan.dto.CaptureCentralCashAllocationResponse;
import org.museframework.bian.cencashan.dto.ControlCentralCashAllocationRequest;
import org.museframework.bian.cencashan.dto.ControlCentralCashAllocationResponse;
import org.museframework.bian.cencashan.dto.ExchangeCentralCashAllocationRequest;
import org.museframework.bian.cencashan.dto.ExchangeCentralCashAllocationResponse;
import org.museframework.bian.cencashan.dto.InitiateCentralCashAllocationRequest;
import org.museframework.bian.cencashan.dto.InitiateCentralCashAllocationResponse;
import org.museframework.bian.cencashan.dto.RetrieveCentralCashAllocationRequest;
import org.museframework.bian.cencashan.dto.RetrieveCentralCashAllocationResponse;
import org.museframework.bian.cencashan.dto.UpdateCentralCashAllocationRequest;
import org.museframework.bian.cencashan.dto.UpdateCentralCashAllocationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Maintain an inventory or holding of some resource and make assignments/allocations as requested  within Central Cash Handling.  Example: Track the inventory and administer the distribution of central cash holdings throughout the branch & ATM network.")
@GenericDomain(name="CentralCashHandling", group="CentralCashAllocation")
public interface CrCentralCashAllocation {
    @GenericDtxEndpoint
    @Description("CaCR Capture Central Cash Allocation activity or event related information")
    CaptureCentralCashAllocationResponse captureCentralCashAllocation(CaptureCentralCashAllocationRequest req);

    @GenericDtxEndpoint
    @Description("CoCR Control the processing of Central Cash Allocation")
    ControlCentralCashAllocationResponse controlCentralCashAllocation(ControlCentralCashAllocationRequest req);

    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Central Cash Allocation processing")
    ExchangeCentralCashAllocationResponse exchangeCentralCashAllocation(ExchangeCentralCashAllocationRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Central Cash Allocation")
    InitiateCentralCashAllocationResponse initiateCentralCashAllocation(InitiateCentralCashAllocationRequest req);

    @Description("ReCR Retrieve details about any aspect of Central Cash Allocation")
    RetrieveCentralCashAllocationResponse retrieveCentralCashAllocation(RetrieveCentralCashAllocationRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Central Cash Allocation")
    UpdateCentralCashAllocationResponse updateCentralCashAllocation(UpdateCentralCashAllocationRequest req);
}