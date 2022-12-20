package org.museframework.bian.chequeprocessing.dto;

public class ExchangeFinancialTransactionInitiationRequest {
    private String chequeprocessingid;

    private String financialtransactioninitiationid;

    private org.museframework.bian.chequeprocessing.dto.bq.FinancialTransactionInitiation financialTransactionInitiation;

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

    public void setFinancialTransactionInitiation(org.museframework.bian.chequeprocessing.dto.bq.FinancialTransactionInitiation financialTransactionInitiation) {
        this.financialTransactionInitiation = financialTransactionInitiation;
    }

    public org.museframework.bian.chequeprocessing.dto.bq.FinancialTransactionInitiation getFinancialTransactionInitiation() {
        return financialTransactionInitiation;
    }
}