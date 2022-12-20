package org.museframework.bian.achoperations.dto;

public class UpdateClearingandSettlementRequest {
    private String achoperationsid;

    private String clearingandsettlementid;

    private org.museframework.bian.achoperations.dto.bq.ClearingandSettlement clearingandSettlement;

    public void setAchoperationsid(String achoperationsid) {
        this.achoperationsid = achoperationsid;
    }

    public String getAchoperationsid() {
        return achoperationsid;
    }

    public void setClearingandsettlementid(String clearingandsettlementid) {
        this.clearingandsettlementid = clearingandsettlementid;
    }

    public String getClearingandsettlementid() {
        return clearingandsettlementid;
    }

    public void setClearingandSettlement(org.museframework.bian.achoperations.dto.bq.ClearingandSettlement clearingandSettlement) {
        this.clearingandSettlement = clearingandSettlement;
    }

    public org.museframework.bian.achoperations.dto.bq.ClearingandSettlement getClearingandSettlement() {
        return clearingandSettlement;
    }
}