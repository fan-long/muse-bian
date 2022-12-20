package org.museframework.bian.proinviteman;

import org.museframework.bian.proinviteman.dto.RequestProductInventoryAllocationRequest;
import org.museframework.bian.proinviteman.dto.RequestProductInventoryAllocationResponse;
import org.museframework.bian.proinviteman.dto.RetrieveProductInventoryAllocationRequest;
import org.museframework.bian.proinviteman.dto.RetrieveProductInventoryAllocationResponse;
import org.museframework.bian.proinviteman.dto.UpdateProductInventoryAllocationRequest;
import org.museframework.bian.proinviteman.dto.UpdateProductInventoryAllocationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Maintain an inventory or holding of some resource and make assignments/allocations as requested  within Product Inventory Item Management.  Example: Track the inventory and administer the distribution of central cash holdings throughout the branch & ATM network.")
@GenericDomain(name="ProductInventoryItemManagement", group="ProductInventoryAllocation")
public interface CrProductInventoryAllocation {
    @GenericDtxEndpoint
    @Description("UpCR Update details of the product inventory distribution service")
    UpdateProductInventoryAllocationResponse updateProductInventoryAllocation(UpdateProductInventoryAllocationRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention with the inventory distribution service")
    RequestProductInventoryAllocationResponse requestProductInventoryAllocation(RequestProductInventoryAllocationRequest req);

    @Description("ReCR Retrieve details about the product inventory distribution")
    RetrieveProductInventoryAllocationResponse retrieveProductInventoryAllocation(RetrieveProductInventoryAllocationRequest req);
}