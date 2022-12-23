package org.museframework.bian.colallman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCollateralAssetAllocationRequest {
    @MetaField
    private String collateralallocationmanagementid;

    public void setCollateralallocationmanagementid(String collateralallocationmanagementid) {
        this.collateralallocationmanagementid = collateralallocationmanagementid;
    }

    public String getCollateralallocationmanagementid() {
        return collateralallocationmanagementid;
    }
}