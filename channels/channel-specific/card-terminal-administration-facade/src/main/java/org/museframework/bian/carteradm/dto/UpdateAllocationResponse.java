package org.museframework.bian.carteradm.dto;

public class UpdateAllocationResponse {
    private org.museframework.bian.carteradm.dto.bq.Allocation allocation;

    public void setAllocation(org.museframework.bian.carteradm.dto.bq.Allocation allocation) {
        this.allocation = allocation;
    }

    public org.museframework.bian.carteradm.dto.bq.Allocation getAllocation() {
        return allocation;
    }
}