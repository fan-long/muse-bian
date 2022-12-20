package org.museframework.bian.colallman.dto;

public class RetrieveAllocationRequest {
    private String collateralallocationmanagementid;

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