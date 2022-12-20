package org.museframework.bian.colallman;

import org.museframework.bian.colallman.dto.ProvideCollateralAssetAllocationRequest;
import org.museframework.bian.colallman.dto.ProvideCollateralAssetAllocationResponse;
import org.museframework.bian.colallman.dto.RetrieveCollateralAssetAllocationRequest;
import org.museframework.bian.colallman.dto.RetrieveCollateralAssetAllocationResponse;
import org.museframework.bian.colallman.dto.UpdateCollateralAssetAllocationRequest;
import org.museframework.bian.colallman.dto.UpdateCollateralAssetAllocationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Maintain an inventory or holding of some resource and make assignments/allocations as requested  within Collateral Allocation Management.  Example: Track the inventory and administer the distribution of central cash holdings throughout the branch & ATM network.")
@GenericDomain(name="CollateralAllocationManagement", group="CollateralAssetAllocation")
public interface CrCollateralAssetAllocation {
    @GenericDtxEndpoint
    @Description("PrCR Record an asset provided for collateralization")
    ProvideCollateralAssetAllocationResponse provideCollateralAssetAllocation(ProvideCollateralAssetAllocationRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details and status of a collateral asset and its allocation")
    UpdateCollateralAssetAllocationResponse updateCollateralAssetAllocation(UpdateCollateralAssetAllocationRequest req);

    @Description("ReCR Retrieve details and status of a collateral asset and its allocation")
    RetrieveCollateralAssetAllocationResponse retrieveCollateralAssetAllocation(RetrieveCollateralAssetAllocationRequest req);
}