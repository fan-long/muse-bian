package org.museframework.bian.cartraswi.dto;

public class InitiateTransactionCaptureRequest {
    private String cardtransactionswitchid;

    private String transactioncaptureid;

    private org.museframework.bian.cartraswi.dto.bq.TransactionCapture transactionCapture;

    public void setCardtransactionswitchid(String cardtransactionswitchid) {
        this.cardtransactionswitchid = cardtransactionswitchid;
    }

    public String getCardtransactionswitchid() {
        return cardtransactionswitchid;
    }

    public void setTransactioncaptureid(String transactioncaptureid) {
        this.transactioncaptureid = transactioncaptureid;
    }

    public String getTransactioncaptureid() {
        return transactioncaptureid;
    }

    public void setTransactionCapture(org.museframework.bian.cartraswi.dto.bq.TransactionCapture transactionCapture) {
        this.transactionCapture = transactionCapture;
    }

    public org.museframework.bian.cartraswi.dto.bq.TransactionCapture getTransactionCapture() {
        return transactionCapture;
    }
}