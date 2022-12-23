package org.museframework.bian.colallman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ProvideAllocationRequest {
    @MetaField
    private String collateralallocationmanagementid;

    @MetaField
    private String allocationid;

    @MetaField(ref=true)
    private org.museframework.bian.colallman.dto.bq.Allocation allocation;

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

    public void setAllocation(org.museframework.bian.colallman.dto.bq.Allocation allocation) {
        this.allocation = allocation;
    }

    public org.museframework.bian.colallman.dto.bq.Allocation getAllocation() {
        return allocation;
    }
}