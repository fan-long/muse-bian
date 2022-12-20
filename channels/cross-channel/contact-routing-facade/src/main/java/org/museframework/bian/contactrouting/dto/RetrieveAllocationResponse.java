package org.museframework.bian.contactrouting.dto;

public class RetrieveAllocationResponse {
    private org.museframework.bian.contactrouting.dto.bq.Allocation allocation;

    public void setAllocation(org.museframework.bian.contactrouting.dto.bq.Allocation allocation) {
        this.allocation = allocation;
    }

    public org.museframework.bian.contactrouting.dto.bq.Allocation getAllocation() {
        return allocation;
    }
}