package org.museframework.bian.cardclearing.dto;

public class InitiateCardClearingProcedureResponse {
    private org.museframework.bian.cardclearing.dto.cr.CardClearingProcedure cardClearingProcedure;

    public void setCardClearingProcedure(org.museframework.bian.cardclearing.dto.cr.CardClearingProcedure cardClearingProcedure) {
        this.cardClearingProcedure = cardClearingProcedure;
    }

    public org.museframework.bian.cardclearing.dto.cr.CardClearingProcedure getCardClearingProcedure() {
        return cardClearingProcedure;
    }
}