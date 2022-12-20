package org.museframework.bian.cardcapture.dto;

public class ExecuteTransactionConsolidationRequest {
    private String cardcaptureid;

    private String transactionconsolidationid;

    private org.museframework.bian.cardcapture.dto.bq.TransactionConsolidation transactionConsolidation;

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

    public void setTransactionConsolidation(org.museframework.bian.cardcapture.dto.bq.TransactionConsolidation transactionConsolidation) {
        this.transactionConsolidation = transactionConsolidation;
    }

    public org.museframework.bian.cardcapture.dto.bq.TransactionConsolidation getTransactionConsolidation() {
        return transactionConsolidation;
    }
}