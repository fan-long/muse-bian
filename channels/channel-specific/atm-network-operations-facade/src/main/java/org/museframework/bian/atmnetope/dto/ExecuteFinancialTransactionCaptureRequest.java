package org.museframework.bian.atmnetope.dto;

public class ExecuteFinancialTransactionCaptureRequest {
    private String atmnetworkoperationsid;

    private String financialtransactioncaptureid;

    private org.museframework.bian.atmnetope.dto.bq.FinancialTransactionCapture financialTransactionCapture;

    public void setAtmnetworkoperationsid(String atmnetworkoperationsid) {
        this.atmnetworkoperationsid = atmnetworkoperationsid;
    }

    public String getAtmnetworkoperationsid() {
        return atmnetworkoperationsid;
    }

    public void setFinancialtransactioncaptureid(String financialtransactioncaptureid) {
        this.financialtransactioncaptureid = financialtransactioncaptureid;
    }

    public String getFinancialtransactioncaptureid() {
        return financialtransactioncaptureid;
    }

    public void setFinancialTransactionCapture(org.museframework.bian.atmnetope.dto.bq.FinancialTransactionCapture financialTransactionCapture) {
        this.financialTransactionCapture = financialTransactionCapture;
    }

    public org.museframework.bian.atmnetope.dto.bq.FinancialTransactionCapture getFinancialTransactionCapture() {
        return financialTransactionCapture;
    }
}