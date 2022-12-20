package org.museframework.bian.cardcapture.dto;

public class RetrieveTransactionConsolidationRequest {
    private String cardcaptureid;

    private String transactionconsolidationid;

    public void setCardcaptureid(String cardcaptureid) {
        this.cardcaptureid = cardcaptureid;
    }

    public String getCardcaptureid() {
        return cardcaptureid;
    }

    public void setTransactionconsolidationid(String transactionconsolidationid) {
        this.transactionconsolidationid = transactionconsolidationid;
    }

    public String getTransactionconsolidationid() {
        return transactionconsolidationid;
    }
}