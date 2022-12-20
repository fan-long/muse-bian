package org.museframework.bian.cartraswi.dto;

public class InitiateTransactionRoutingRequest {
    private String cardtransactionswitchid;

    private String transactionroutingid;

    private org.museframework.bian.cartraswi.dto.bq.TransactionRouting transactionRouting;

    public void setCardtransactionswitchid(String cardtransactionswitchid) {
        this.cardtransactionswitchid = cardtransactionswitchid;
    }

    public String getCardtransactionswitchid() {
        return cardtransactionswitchid;
    }

    public void setTransactionroutingid(String transactionroutingid) {
        this.transactionroutingid = transactionroutingid;
    }

    public String getTransactionroutingid() {
        return transactionroutingid;
    }

    public void setTransactionRouting(org.museframework.bian.cartraswi.dto.bq.TransactionRouting transactionRouting) {
        this.transactionRouting = transactionRouting;
    }

    public org.museframework.bian.cartraswi.dto.bq.TransactionRouting getTransactionRouting() {
        return transactionRouting;
    }
}