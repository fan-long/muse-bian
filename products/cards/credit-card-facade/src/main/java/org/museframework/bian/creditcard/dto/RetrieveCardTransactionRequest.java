package org.museframework.bian.creditcard.dto;

public class RetrieveCardTransactionRequest {
    private String creditcardid;

    private String cardtransactionid;

    public void setCreditcardid(String creditcardid) {
        this.creditcardid = creditcardid;
    }

    public String getCreditcardid() {
        return creditcardid;
    }

    public void setCardtransactionid(String cardtransactionid) {
        this.cardtransactionid = cardtransactionid;
    }

    public String getCardtransactionid() {
        return cardtransactionid;
    }
}