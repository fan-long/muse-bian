package org.museframework.bian.colallman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ProvideCollateralAssetAllocationRequest {
    @MetaField(ref=true)
    private org.museframework.bian.colallman.dto.cr.CollateralAssetAllocation collateralAssetAllocation;

    public void setCollateralAssetAllocation(org.museframework.bian.colallman.dto.cr.CollateralAssetAllocation collateralAssetAllocation) {
        this.collateralAssetAllocation = collateralAssetAllocation;
    }

    public org.museframework.bian.colallman.dto.cr.CollateralAssetAllocation getCollateralAssetAllocation() {
        return collateralAssetAllocation;
    }
}