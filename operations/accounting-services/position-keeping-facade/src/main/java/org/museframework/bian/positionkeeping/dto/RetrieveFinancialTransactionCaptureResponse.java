package org.museframework.bian.positionkeeping.dto;

public class RetrieveFinancialTransactionCaptureResponse {
    private org.museframework.bian.positionkeeping.dto.bq.FinancialTransactionCapture financialTransactionCapture;

    public void setFinancialTransactionCapture(org.museframework.bian.positionkeeping.dto.bq.FinancialTransactionCapture financialTransactionCapture) {
        this.financialTransactionCapture = financialTransactionCapture;
    }

    public org.museframework.bian.positionkeeping.dto.bq.FinancialTransactionCapture getFinancialTransactionCapture() {
        return financialTransactionCapture;
    }
}