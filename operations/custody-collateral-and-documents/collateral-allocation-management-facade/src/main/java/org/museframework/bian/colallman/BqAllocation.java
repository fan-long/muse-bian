package org.museframework.bian.colallman;

import org.museframework.bian.colallman.dto.CaptureAllocationRequest;
import org.museframework.bian.colallman.dto.CaptureAllocationResponse;
import org.museframework.bian.colallman.dto.ProvideAllocationRequest;
import org.museframework.bian.colallman.dto.ProvideAllocationResponse;
import org.museframework.bian.colallman.dto.RetrieveAllocationRequest;
import org.museframework.bian.colallman.dto.RetrieveAllocationResponse;
import org.museframework.bian.colallman.dto.UpdateAllocationRequest;
import org.museframework.bian.colallman.dto.UpdateAllocationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Set of rules for the purpose of deciding if or if not something is applicable  Examples: Staff assignment, Facility allocation.")
@GenericDomain(name="CollateralAllocationManagement", group="Allocation")
public interface BqAllocation {
    @GenericDtxEndpoint
    @Description("PrBQ Allocate a collateral asset to a lending product")
    ProvideAllocationResponse provideAllocation(ProvideAllocationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details about an allocation request and in force")
    UpdateAllocationResponse updateAllocation(UpdateAllocationRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Record usage details for a collateral allocation")
    CaptureAllocationResponse captureAllocation(CaptureAllocationRequest req);

    @Description("ReBQ Retrieve details about a collateral allocation")
    RetrieveAllocationResponse retrieveAllocation(RetrieveAllocationRequest req);
}