package org.museframework.bian.colallman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCollateralAssetAllocationRequest {
    @MetaField
    private String collateralallocationmanagementid;

    @MetaField(ref=true)
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