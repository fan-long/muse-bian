package org.museframework.bian.bracurman;

import org.museframework.bian.bracurman.dto.CaptureInventoryAllocationRequest;
import org.museframework.bian.bracurman.dto.CaptureInventoryAllocationResponse;
import org.museframework.bian.bracurman.dto.ControlInventoryAllocationRequest;
import org.museframework.bian.bracurman.dto.ControlInventoryAllocationResponse;
import org.museframework.bian.bracurman.dto.ExchangeInventoryAllocationRequest;
import org.museframework.bian.bracurman.dto.ExchangeInventoryAllocationResponse;
import org.museframework.bian.bracurman.dto.InitiateInventoryAllocationRequest;
import org.museframework.bian.bracurman.dto.InitiateInventoryAllocationResponse;
import org.museframework.bian.bracurman.dto.RetrieveInventoryAllocationRequest;
import org.museframework.bian.bracurman.dto.RetrieveInventoryAllocationResponse;
import org.museframework.bian.bracurman.dto.UpdateInventoryAllocationRequest;
import org.museframework.bian.bracurman.dto.UpdateInventoryAllocationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Set of rules for the purpose of deciding if or if not something is applicable  Examples: Staff assignment, Facility allocation.")
@GenericDomain(name="BranchCurrencyManagement", group="InventoryAllocation")
public interface BqInventoryAllocation {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Inventory Allocation activity or event related information")
    CaptureInventoryAllocationResponse captureInventoryAllocation(CaptureInventoryAllocationRequest req);

    @GenericDtxEndpoint
    @Description("CoBQ Control the processing of Inventory Allocation")
    ControlInventoryAllocationResponse controlInventoryAllocation(ControlInventoryAllocationRequest req);

    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Inventory Allocation processing")
    ExchangeInventoryAllocationResponse exchangeInventoryAllocation(ExchangeInventoryAllocationRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Inventory Allocation")
    InitiateInventoryAllocationResponse initiateInventoryAllocation(InitiateInventoryAllocationRequest req);

    @Description("ReBQ Retrieve details about any aspect of Inventory Allocation")
    RetrieveInventoryAllocationResponse retrieveInventoryAllocation(RetrieveInventoryAllocationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Inventory Allocation")
    UpdateInventoryAllocationResponse updateInventoryAllocation(UpdateInventoryAllocationRequest req);
}