package org.museframework.bian.chequeprocessing.dto;

public class ExchangeFinancialTransactionInitiationResponse {
    private org.museframework.bian.chequeprocessing.dto.bq.FinancialTransactionInitiation financialTransactionInitiation;

    public void setFinancialTransactionInitiation(org.museframework.bian.chequeprocessing.dto.bq.FinancialTransactionInitiation financialTransactionInitiation) {
        this.financialTransactionInitiation = financialTransactionInitiation;
    }

    public org.museframework.bian.chequeprocessing.dto.bq.FinancialTransactionInitiation getFinancialTransactionInitiation() {
        return financialTransactionInitiation;
    }
}