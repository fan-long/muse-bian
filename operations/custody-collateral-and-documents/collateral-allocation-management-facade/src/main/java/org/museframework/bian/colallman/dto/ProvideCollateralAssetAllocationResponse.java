package org.museframework.bian.colallman.dto;

public class ProvideCollateralAssetAllocationResponse {
    private org.museframework.bian.colallman.dto.cr.CollateralAssetAllocation collateralAssetAllocation;

    public void setCollateralAssetAllocation(org.museframework.bian.colallman.dto.cr.CollateralAssetAllocation collateralAssetAllocation) {
        this.collateralAssetAllocation = collateralAssetAllocation;
    }

    public org.museframework.bian.colallman.dto.cr.CollateralAssetAllocation getCollateralAssetAllocation() {
        return collateralAssetAllocation;
    }
}