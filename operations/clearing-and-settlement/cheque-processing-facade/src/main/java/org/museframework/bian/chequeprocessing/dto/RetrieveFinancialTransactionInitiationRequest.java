package org.museframework.bian.chequeprocessing.dto;

public class RetrieveFinancialTransactionInitiationRequest {
    private String chequeprocessingid;

    private String financialtransactioninitiationid;

    public void setChequeprocessingid(String chequeprocessingid) {
        this.chequeprocessingid = chequeprocessingid;
    }

    public String getChequeprocessingid() {
        return chequeprocessingid;
    }

    public void setFinancialtransactioninitiationid(String financialtransactioninitiationid) {
        this.financialtransactioninitiationid = financialtransactioninitiationid;
    }

    public String getFinancialtransactioninitiationid() {
        return financialtransactioninitiationid;
    }
}