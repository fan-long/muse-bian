package org.museframework.bian.cartraswi.dto;

public class RetrieveTransactionCaptureResponse {
    private org.museframework.bian.cartraswi.dto.bq.TransactionCapture transactionCapture;

    public void setTransactionCapture(org.museframework.bian.cartraswi.dto.bq.TransactionCapture transactionCapture) {
        this.transactionCapture = transactionCapture;
    }

    public org.museframework.bian.cartraswi.dto.bq.TransactionCapture getTransactionCapture() {
        return transactionCapture;
    }
}