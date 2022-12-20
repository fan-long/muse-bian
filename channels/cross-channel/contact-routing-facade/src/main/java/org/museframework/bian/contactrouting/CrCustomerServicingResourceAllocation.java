package org.museframework.bian.contactrouting;

import org.museframework.bian.contactrouting.dto.CaptureCustomerServicingResourceAllocationRequest;
import org.museframework.bian.contactrouting.dto.CaptureCustomerServicingResourceAllocationResponse;
import org.museframework.bian.contactrouting.dto.ProvideCustomerServicingResourceAllocationRequest;
import org.museframework.bian.contactrouting.dto.ProvideCustomerServicingResourceAllocationResponse;
import org.museframework.bian.contactrouting.dto.RetrieveCustomerServicingResourceAllocationRequest;
import org.museframework.bian.contactrouting.dto.RetrieveCustomerServicingResourceAllocationResponse;
import org.museframework.bian.contactrouting.dto.UpdateCustomerServicingResourceAllocationRequest;
import org.museframework.bian.contactrouting.dto.UpdateCustomerServicingResourceAllocationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Maintain an inventory or holding of some resource and make assignments/allocations as requested  within Contact Routing.  Example: Track the inventory and administer the distribution of central cash holdings throughout the branch & ATM network.")
@GenericDomain(name="ContactRouting", group="CustomerServicingResourceAllocation")
public interface CrCustomerServicingResourceAllocation {
    @GenericDtxEndpoint
    @Description("PrCR Enable the service resource pool allocation")
    ProvideCustomerServicingResourceAllocationResponse provideCustomerServicingResourceAllocation(ProvideCustomerServicingResourceAllocationRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details about the servicing resource pool")
    UpdateCustomerServicingResourceAllocationResponse updateCustomerServicingResourceAllocation(UpdateCustomerServicingResourceAllocationRequest req);

    @GenericDtxEndpoint
    @Description("CaCR Capture servicing resource pool data (e.g. resource status/availability)")
    CaptureCustomerServicingResourceAllocationResponse captureCustomerServicingResourceAllocation(CaptureCustomerServicingResourceAllocationRequest req);

    @Description("ReCR Retrieve details about the servicing resource assignments")
    RetrieveCustomerServicingResourceAllocationResponse retrieveCustomerServicingResourceAllocation(RetrieveCustomerServicingResourceAllocationRequest req);
}