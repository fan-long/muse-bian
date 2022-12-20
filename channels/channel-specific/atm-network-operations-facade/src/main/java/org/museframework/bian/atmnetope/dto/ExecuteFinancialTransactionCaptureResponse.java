package org.museframework.bian.atmnetope.dto;

public class ExecuteFinancialTransactionCaptureResponse {
    private org.museframework.bian.atmnetope.dto.bq.FinancialTransactionCapture financialTransactionCapture;

    public void setFinancialTransactionCapture(org.museframework.bian.atmnetope.dto.bq.FinancialTransactionCapture financialTransactionCapture) {
        this.financialTransactionCapture = financialTransactionCapture;
    }

    public org.museframework.bian.atmnetope.dto.bq.FinancialTransactionCapture getFinancialTransactionCapture() {
        return financialTransactionCapture;
    }
}