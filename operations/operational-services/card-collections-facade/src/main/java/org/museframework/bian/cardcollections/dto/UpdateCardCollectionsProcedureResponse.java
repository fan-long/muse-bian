package org.museframework.bian.cardcollections.dto;

public class UpdateCardCollectionsProcedureResponse {
    private org.museframework.bian.cardcollections.dto.cr.CardCollectionsProcedure cardCollectionsProcedure;

    public void setCardCollectionsProcedure(org.museframework.bian.cardcollections.dto.cr.CardCollectionsProcedure cardCollectionsProcedure) {
        this.cardCollectionsProcedure = cardCollectionsProcedure;
    }

    public org.museframework.bian.cardcollections.dto.cr.CardCollectionsProcedure getCardCollectionsProcedure() {
        return cardCollectionsProcedure;
    }
}