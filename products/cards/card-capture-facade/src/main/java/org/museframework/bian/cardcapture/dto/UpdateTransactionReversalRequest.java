package org.museframework.bian.cardcapture.dto;

public class UpdateTransactionReversalRequest {
    private String cardcaptureid;

    private String transactionreversalid;

    private org.museframework.bian.cardcapture.dto.bq.TransactionReversal transactionReversal;

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

    public void setTransactionReversal(org.museframework.bian.cardcapture.dto.bq.TransactionReversal transactionReversal) {
        this.transactionReversal = transactionReversal;
    }

    public org.museframework.bian.cardcapture.dto.bq.TransactionReversal getTransactionReversal() {
        return transactionReversal;
    }
}