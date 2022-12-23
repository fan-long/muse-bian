package org.museframework.bian.colallman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveAllocationRequest {
    @MetaField
    private String collateralallocationmanagementid;

    @MetaField
    private String allocationid;

    public void setCollateralallocationmanagementid(String collateralallocationmanagementid) {
        this.collateralallocationmanagementid = collateralallocationmanagementid;
    }

    public String getCollateralallocationmanagementid() {
        return collateralallocationmanagementid;
    }

    public void setAllocationid(String allocationid) {
        this.allocationid = allocationid;
    }

    public String getAllocationid() {
        return allocationid;
    }
}