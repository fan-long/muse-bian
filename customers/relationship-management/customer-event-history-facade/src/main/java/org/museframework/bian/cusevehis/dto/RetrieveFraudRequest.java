package org.museframework.bian.cusevehis.dto;

public class RetrieveFraudRequest {
    private String customereventhistoryid;

    private String fraudid;

    public void setCustomereventhistoryid(String customereventhistoryid) {
        this.customereventhistoryid = customereventhistoryid;
    }

    public String getCustomereventhistoryid() {
        return customereventhistoryid;
    }

    public void setFraudid(String fraudid) {
        this.fraudid = fraudid;
    }

    public String getFraudid() {
        return fraudid;
    }
}