package org.museframework.bian.cardcapture.dto;

public class RetrieveTransactionCaptureRequest {
    private String cardcaptureid;

    private String transactioncaptureid;

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
}