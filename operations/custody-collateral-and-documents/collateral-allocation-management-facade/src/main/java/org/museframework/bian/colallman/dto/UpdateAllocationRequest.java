package org.museframework.bian.colallman.dto;

public class UpdateAllocationRequest {
    private String collateralallocationmanagementid;

    private String allocationid;

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