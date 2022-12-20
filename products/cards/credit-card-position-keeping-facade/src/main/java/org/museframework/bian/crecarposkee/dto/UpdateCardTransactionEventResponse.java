package org.museframework.bian.crecarposkee.dto;

public class UpdateCardTransactionEventResponse {
    private org.museframework.bian.crecarposkee.dto.bq.CardTransactionEvent cardTransactionEvent;

    public void setCardTransactionEvent(org.museframework.bian.crecarposkee.dto.bq.CardTransactionEvent cardTransactionEvent) {
        this.cardTransactionEvent = cardTransactionEvent;
    }

    public org.museframework.bian.crecarposkee.dto.bq.CardTransactionEvent getCardTransactionEvent() {
        return cardTransactionEvent;
    }
}