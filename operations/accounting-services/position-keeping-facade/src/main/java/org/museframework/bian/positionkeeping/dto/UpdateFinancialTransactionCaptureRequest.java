package org.museframework.bian.positionkeeping.dto;

public class UpdateFinancialTransactionCaptureRequest {
    private String positionkeepingid;

    private String financialtransactioncaptureid;

    private org.museframework.bian.positionkeeping.dto.bq.FinancialTransactionCapture financialTransactionCapture;

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

    public void setFinancialTransactionCapture(org.museframework.bian.positionkeeping.dto.bq.FinancialTransactionCapture financialTransactionCapture) {
        this.financialTransactionCapture = financialTransactionCapture;
    }

    public org.museframework.bian.positionkeeping.dto.bq.FinancialTransactionCapture getFinancialTransactionCapture() {
        return financialTransactionCapture;
    }
}