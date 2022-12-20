package org.museframework.bian.carecogat.dto;

public class InitiateCardTransactionResponse {
    private org.museframework.bian.carecogat.dto.bq.CardTransaction cardTransaction;

    public void setCardTransaction(org.museframework.bian.carecogat.dto.bq.CardTransaction cardTransaction) {
        this.cardTransaction = cardTransaction;
    }

    public org.museframework.bian.carecogat.dto.bq.CardTransaction getCardTransaction() {
        return cardTransaction;
    }
}