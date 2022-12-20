package org.museframework.bian.creditcard.dto;

public class UpdateCardTransactionRequest {
    private String creditcardid;

    private String cardtransactionid;

    private org.museframework.bian.creditcard.dto.bq.CardTransaction cardTransaction;

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

    public void setCardTransaction(org.museframework.bian.creditcard.dto.bq.CardTransaction cardTransaction) {
        this.cardTransaction = cardTransaction;
    }

    public org.museframework.bian.creditcard.dto.bq.CardTransaction getCardTransaction() {
        return cardTransaction;
    }
}