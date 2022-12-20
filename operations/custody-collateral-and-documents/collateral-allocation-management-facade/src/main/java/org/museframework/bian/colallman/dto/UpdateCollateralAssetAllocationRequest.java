package org.museframework.bian.colallman.dto;

public class UpdateCollateralAssetAllocationRequest {
    private String collateralallocationmanagementid;

    private org.museframework.bian.colallman.dto.cr.CollateralAssetAllocation collateralAssetAllocation;

    public void setCollateralallocationmanagementid(String collateralallocationmanagementid) {
        this.collateralallocationmanagementid = collateralallocationmanagementid;
    }

    public String getCollateralallocationmanagementid() {
        return collateralallocationmanagementid;
    }

    public void setCollateralAssetAllocation(org.museframework.bian.colallman.dto.cr.CollateralAssetAllocation collateralAssetAllocation) {
        this.collateralAssetAllocation = collateralAssetAllocation;
    }

    public org.museframework.bian.colallman.dto.cr.CollateralAssetAllocation getCollateralAssetAllocation() {
        return collateralAssetAllocation;
    }
}