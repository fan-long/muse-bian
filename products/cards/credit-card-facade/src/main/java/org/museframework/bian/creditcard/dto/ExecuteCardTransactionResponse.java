package org.museframework.bian.creditcard.dto;

public class ExecuteCardTransactionResponse {
    private org.museframework.bian.creditcard.dto.bq.CardTransaction cardTransaction;

    public void setCardTransaction(org.museframework.bian.creditcard.dto.bq.CardTransaction cardTransaction) {
        this.cardTransaction = cardTransaction;
    }

    public org.museframework.bian.creditcard.dto.bq.CardTransaction getCardTransaction() {
        return cardTransaction;
    }
}