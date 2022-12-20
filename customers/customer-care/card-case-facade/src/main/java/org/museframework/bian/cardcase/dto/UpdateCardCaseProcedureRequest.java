package org.museframework.bian.cardcase.dto;

public class UpdateCardCaseProcedureRequest {
    private String cardcaseid;

    private org.museframework.bian.cardcase.dto.cr.CardCaseProcedure cardCaseProcedure;

    public void setCardcaseid(String cardcaseid) {
        this.cardcaseid = cardcaseid;
    }

    public String getCardcaseid() {
        return cardcaseid;
    }

    public void setCardCaseProcedure(org.museframework.bian.cardcase.dto.cr.CardCaseProcedure cardCaseProcedure) {
        this.cardCaseProcedure = cardCaseProcedure;
    }

    public org.museframework.bian.cardcase.dto.cr.CardCaseProcedure getCardCaseProcedure() {
        return cardCaseProcedure;
    }
}