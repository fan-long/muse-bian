package org.museframework.bian.crecarposkee.dto;

public class UpdateCardTransactionEventRequest {
    private String creditcardpositionkeepingid;

    private String cardtransactioneventid;

    private org.museframework.bian.crecarposkee.dto.bq.CardTransactionEvent cardTransactionEvent;

    public void setCreditcardpositionkeepingid(String creditcardpositionkeepingid) {
        this.creditcardpositionkeepingid = creditcardpositionkeepingid;
    }

    public String getCreditcardpositionkeepingid() {
        return creditcardpositionkeepingid;
    }

    public void setCardtransactioneventid(String cardtransactioneventid) {
        this.cardtransactioneventid = cardtransactioneventid;
    }

    public String getCardtransactioneventid() {
        return cardtransactioneventid;
    }

    public void setCardTransactionEvent(org.museframework.bian.crecarposkee.dto.bq.CardTransactionEvent cardTransactionEvent) {
        this.cardTransactionEvent = cardTransactionEvent;
    }

    public org.museframework.bian.crecarposkee.dto.bq.CardTransactionEvent getCardTransactionEvent() {
        return cardTransactionEvent;
    }
}