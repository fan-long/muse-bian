package org.museframework.bian.colallman.dto;

public class CaptureAllocationResponse {
    private org.museframework.bian.colallman.dto.bq.Allocation allocation;

    public void setAllocation(org.museframework.bian.colallman.dto.bq.Allocation allocation) {
        this.allocation = allocation;
    }

    public org.museframework.bian.colallman.dto.bq.Allocation getAllocation() {
        return allocation;
    }
}