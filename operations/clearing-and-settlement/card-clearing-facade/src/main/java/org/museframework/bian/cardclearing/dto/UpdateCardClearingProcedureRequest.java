package org.museframework.bian.cardclearing.dto;

public class UpdateCardClearingProcedureRequest {
    private String cardclearingid;

    private org.museframework.bian.cardclearing.dto.cr.CardClearingProcedure cardClearingProcedure;

    public void setCardclearingid(String cardclearingid) {
        this.cardclearingid = cardclearingid;
    }

    public String getCardclearingid() {
        return cardclearingid;
    }

    public void setCardClearingProcedure(org.museframework.bian.cardclearing.dto.cr.CardClearingProcedure cardClearingProcedure) {
        this.cardClearingProcedure = cardClearingProcedure;
    }

    public org.museframework.bian.cardclearing.dto.cr.CardClearingProcedure getCardClearingProcedure() {
        return cardClearingProcedure;
    }
}