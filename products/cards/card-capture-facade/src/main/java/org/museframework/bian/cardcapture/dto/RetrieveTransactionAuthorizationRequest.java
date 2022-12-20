package org.museframework.bian.cardcapture.dto;

public class RetrieveTransactionAuthorizationRequest {
    private String cardcaptureid;

    private String transactionauthorizationid;

    public void setCardcaptureid(String cardcaptureid) {
        this.cardcaptureid = cardcaptureid;
    }

    public String getCardcaptureid() {
        return cardcaptureid;
    }

    public void setTransactionauthorizationid(String transactionauthorizationid) {
        this.transactionauthorizationid = transactionauthorizationid;
    }

    public String getTransactionauthorizationid() {
        return transactionauthorizationid;
    }
}