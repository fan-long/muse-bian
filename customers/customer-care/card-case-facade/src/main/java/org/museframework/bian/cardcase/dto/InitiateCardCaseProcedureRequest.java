package org.museframework.bian.cardcase.dto;

public class InitiateCardCaseProcedureRequest {
    private org.museframework.bian.cardcase.dto.cr.CardCaseProcedure cardCaseProcedure;

    public void setCardCaseProcedure(org.museframework.bian.cardcase.dto.cr.CardCaseProcedure cardCaseProcedure) {
        this.cardCaseProcedure = cardCaseProcedure;
    }

    public org.museframework.bian.cardcase.dto.cr.CardCaseProcedure getCardCaseProcedure() {
        return cardCaseProcedure;
    }
}