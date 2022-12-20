package org.museframework.bian.achoperations.dto;

public class RetrieveClearingandSettlementRequest {
    private String achoperationsid;

    private String clearingandsettlementid;

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
}