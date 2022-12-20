package org.museframework.bian.cardcapture.dto;

public class InitiateTransactionAuthorizationRequest {
    private String cardcaptureid;

    private String transactionauthorizationid;

    private org.museframework.bian.cardcapture.dto.bq.TransactionAuthorization transactionAuthorization;

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

    public void setTransactionAuthorization(org.museframework.bian.cardcapture.dto.bq.TransactionAuthorization transactionAuthorization) {
        this.transactionAuthorization = transactionAuthorization;
    }

    public org.museframework.bian.cardcapture.dto.bq.TransactionAuthorization getTransactionAuthorization() {
        return transactionAuthorization;
    }
}