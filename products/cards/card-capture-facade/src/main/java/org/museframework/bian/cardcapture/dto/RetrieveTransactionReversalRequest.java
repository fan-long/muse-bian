package org.museframework.bian.cardcapture.dto;

public class RetrieveTransactionReversalRequest {
    private String cardcaptureid;

    private String transactionreversalid;

    public void setCardcaptureid(String cardcaptureid) {
        this.cardcaptureid = cardcaptureid;
    }

    public String getCardcaptureid() {
        return cardcaptureid;
    }

    public void setTransactionreversalid(String transactionreversalid) {
        this.transactionreversalid = transactionreversalid;
    }

    public String getTransactionreversalid() {
        return transactionreversalid;
    }
}