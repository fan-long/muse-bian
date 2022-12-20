package org.museframework.bian.crecarposkee.dto;

public class NotifyCardTransactionEventRequest {
    private String creditcardpositionkeepingid;

    private String cardtransactioneventid;

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
}