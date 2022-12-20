package org.museframework.bian.cartraswi.dto;

public class RetrieveTransactionRoutingRequest {
    private String cardtransactionswitchid;

    private String transactionroutingid;

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
}