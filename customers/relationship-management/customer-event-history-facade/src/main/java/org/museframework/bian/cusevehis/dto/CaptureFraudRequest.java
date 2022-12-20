package org.museframework.bian.cusevehis.dto;

public class CaptureFraudRequest {
    private String customereventhistoryid;

    private String fraudid;

    private org.museframework.bian.cusevehis.dto.bq.Fraud fraud;

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

    public void setFraud(org.museframework.bian.cusevehis.dto.bq.Fraud fraud) {
        this.fraud = fraud;
    }

    public org.museframework.bian.cusevehis.dto.bq.Fraud getFraud() {
        return fraud;
    }
}