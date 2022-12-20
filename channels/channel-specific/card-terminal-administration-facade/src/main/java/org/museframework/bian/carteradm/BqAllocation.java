package org.museframework.bian.carteradm;

import org.museframework.bian.carteradm.dto.CaptureAllocationRequest;
import org.museframework.bian.carteradm.dto.CaptureAllocationResponse;
import org.museframework.bian.carteradm.dto.GrantAllocationRequest;
import org.museframework.bian.carteradm.dto.GrantAllocationResponse;
import org.museframework.bian.carteradm.dto.ProvideAllocationRequest;
import org.museframework.bian.carteradm.dto.ProvideAllocationResponse;
import org.museframework.bian.carteradm.dto.RetrieveAllocationRequest;
import org.museframework.bian.carteradm.dto.RetrieveAllocationResponse;
import org.museframework.bian.carteradm.dto.UpdateAllocationRequest;
import org.museframework.bian.carteradm.dto.UpdateAllocationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Set of rules for the purpose of deciding if or if not something is applicable  Examples: Staff assignment, Facility allocation.")
@GenericDomain(name="CardTerminalAdministration", group="Allocation")
public interface BqAllocation {
    @GenericDtxEndpoint
    @Description("PrBQ Provide/allocate the device to a merchant")
    ProvideAllocationResponse provideAllocation(ProvideAllocationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update merchant allocation details")
    UpdateAllocationResponse updateAllocation(UpdateAllocationRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture details about the allocation (e.g. report out of service state)")
    CaptureAllocationResponse captureAllocation(CaptureAllocationRequest req);

    @GenericDtxEndpoint
    @Description("GrBQ Obtain usage authorization grant for the device (may restrict usage)")
    GrantAllocationResponse grantAllocation(GrantAllocationRequest req);

    @Description("ReBQ Retrieve details about the POS device allocation")
    RetrieveAllocationResponse retrieveAllocation(RetrieveAllocationRequest req);
}