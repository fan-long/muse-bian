package org.museframework.bian.cardcapture.dto;

public class InitiateTransactionCaptureRequest {
    private String cardcaptureid;

    private String transactioncaptureid;

    private org.museframework.bian.cardcapture.dto.bq.TransactionCapture transactionCapture;

    public void setCardcaptureid(String cardcaptureid) {
        this.cardcaptureid = cardcaptureid;
    }

    public String getCardcaptureid() {
        return cardcaptureid;
    }

    public void setTransactioncaptureid(String transactioncaptureid) {
        this.transactioncaptureid = transactioncaptureid;
    }

    public String getTransactioncaptureid() {
        return transactioncaptureid;
    }

    public void setTransactionCapture(org.museframework.bian.cardcapture.dto.bq.TransactionCapture transactionCapture) {
        this.transactionCapture = transactionCapture;
    }

    public org.museframework.bian.cardcapture.dto.bq.TransactionCapture getTransactionCapture() {
        return transactionCapture;
    }
}