package org.museframework.bian.bracurman;

import org.museframework.bian.bracurman.dto.CaptureBranchCashAllocationRequest;
import org.museframework.bian.bracurman.dto.CaptureBranchCashAllocationResponse;
import org.museframework.bian.bracurman.dto.ControlBranchCashAllocationRequest;
import org.museframework.bian.bracurman.dto.ControlBranchCashAllocationResponse;
import org.museframework.bian.bracurman.dto.ExchangeBranchCashAllocationRequest;
import org.museframework.bian.bracurman.dto.ExchangeBranchCashAllocationResponse;
import org.museframework.bian.bracurman.dto.InitiateBranchCashAllocationRequest;
import org.museframework.bian.bracurman.dto.InitiateBranchCashAllocationResponse;
import org.museframework.bian.bracurman.dto.RetrieveBranchCashAllocationRequest;
import org.museframework.bian.bracurman.dto.RetrieveBranchCashAllocationResponse;
import org.museframework.bian.bracurman.dto.UpdateBranchCashAllocationRequest;
import org.museframework.bian.bracurman.dto.UpdateBranchCashAllocationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Maintain an inventory or holding of some resource and make assignments/allocations as requested  within Branch Currency Management.  Example: Track the inventory and administer the distribution of central cash holdings throughout the branch & ATM network.")
@GenericDomain(name="BranchCurrencyManagement", group="BranchCashAllocation")
public interface CrBranchCashAllocation {
    @GenericDtxEndpoint
    @Description("CaCR Capture Branch Cash Allocation activity or event related information")
    CaptureBranchCashAllocationResponse captureBranchCashAllocation(CaptureBranchCashAllocationRequest req);

    @GenericDtxEndpoint
    @Description("CoCR Control the processing of Branch Cash Allocation")
    ControlBranchCashAllocationResponse controlBranchCashAllocation(ControlBranchCashAllocationRequest req);

    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Branch Cash Allocation processing")
    ExchangeBranchCashAllocationResponse exchangeBranchCashAllocation(ExchangeBranchCashAllocationRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Branch Cash Allocation")
    InitiateBranchCashAllocationResponse initiateBranchCashAllocation(InitiateBranchCashAllocationRequest req);

    @Description("ReCR Retrieve details about any aspect of Branch Cash Allocation")
    RetrieveBranchCashAllocationResponse retrieveBranchCashAllocation(RetrieveBranchCashAllocationRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Branch Cash Allocation")
    UpdateBranchCashAllocationResponse updateBranchCashAllocation(UpdateBranchCashAllocationRequest req);
}