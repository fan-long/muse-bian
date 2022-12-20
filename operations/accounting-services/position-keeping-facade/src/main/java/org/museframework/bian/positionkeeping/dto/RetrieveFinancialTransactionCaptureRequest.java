package org.museframework.bian.positionkeeping.dto;

public class RetrieveFinancialTransactionCaptureRequest {
    private String positionkeepingid;

    private String financialtransactioncaptureid;

    public void setPositionkeepingid(String positionkeepingid) {
        this.positionkeepingid = positionkeepingid;
    }

    public String getPositionkeepingid() {
        return positionkeepingid;
    }

    public void setFinancialtransactioncaptureid(String financialtransactioncaptureid) {
        this.financialtransactioncaptureid = financialtransactioncaptureid;
    }

    public String getFinancialtransactioncaptureid() {
        return financialtransactioncaptureid;
    }
}