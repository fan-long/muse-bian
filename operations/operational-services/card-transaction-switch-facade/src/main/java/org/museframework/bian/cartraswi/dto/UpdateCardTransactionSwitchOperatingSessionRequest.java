package org.museframework.bian.cartraswi.dto;

public class UpdateCardTransactionSwitchOperatingSessionRequest {
    private String cardtransactionswitchid;

    private org.museframework.bian.cartraswi.dto.cr.CardTransactionSwitchOperatingSession cardTransactionSwitchOperatingSession;

    public void setCardtransactionswitchid(String cardtransactionswitchid) {
        this.cardtransactionswitchid = cardtransactionswitchid;
    }

    public String getCardtransactionswitchid() {
        return cardtransactionswitchid;
    }

    public void setCardTransactionSwitchOperatingSession(org.museframework.bian.cartraswi.dto.cr.CardTransactionSwitchOperatingSession cardTransactionSwitchOperatingSession) {
        this.cardTransactionSwitchOperatingSession = cardTransactionSwitchOperatingSession;
    }

    public org.museframework.bian.cartraswi.dto.cr.CardTransactionSwitchOperatingSession getCardTransactionSwitchOperatingSession() {
        return cardTransactionSwitchOperatingSession;
    }
}