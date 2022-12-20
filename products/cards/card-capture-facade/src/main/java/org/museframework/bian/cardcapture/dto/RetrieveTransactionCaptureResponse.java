package org.museframework.bian.cardcapture.dto;

public class RetrieveTransactionCaptureResponse {
    private org.museframework.bian.cardcapture.dto.bq.TransactionCapture transactionCapture;

    public void setTransactionCapture(org.museframework.bian.cardcapture.dto.bq.TransactionCapture transactionCapture) {
        this.transactionCapture = transactionCapture;
    }

    public org.museframework.bian.cardcapture.dto.bq.TransactionCapture getTransactionCapture() {
        return transactionCapture;
    }
}