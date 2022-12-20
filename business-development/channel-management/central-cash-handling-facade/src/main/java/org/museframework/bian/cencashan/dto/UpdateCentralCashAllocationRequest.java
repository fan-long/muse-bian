package org.museframework.bian.cencashan.dto;

public class UpdateCentralCashAllocationRequest {
    private String centralcashhandlingid;

    private org.museframework.bian.cencashan.dto.cr.CentralCashAllocation centralCashAllocation;

    public void setCentralcashhandlingid(String centralcashhandlingid) {
        this.centralcashhandlingid = centralcashhandlingid;
    }

    public String getCentralcashhandlingid() {
        return centralcashhandlingid;
    }

    public void setCentralCashAllocation(org.museframework.bian.cencashan.dto.cr.CentralCashAllocation centralCashAllocation) {
        this.centralCashAllocation = centralCashAllocation;
    }

    public org.museframework.bian.cencashan.dto.cr.CentralCashAllocation getCentralCashAllocation() {
        return centralCashAllocation;
    }
}