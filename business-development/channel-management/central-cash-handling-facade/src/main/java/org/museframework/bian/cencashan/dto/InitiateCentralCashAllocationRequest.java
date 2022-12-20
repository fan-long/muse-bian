package org.museframework.bian.cencashan.dto;

public class InitiateCentralCashAllocationRequest {
    private org.museframework.bian.cencashan.dto.cr.CentralCashAllocation centralCashAllocation;

    public void setCentralCashAllocation(org.museframework.bian.cencashan.dto.cr.CentralCashAllocation centralCashAllocation) {
        this.centralCashAllocation = centralCashAllocation;
    }

    public org.museframework.bian.cencashan.dto.cr.CentralCashAllocation getCentralCashAllocation() {
        return centralCashAllocation;
    }
}