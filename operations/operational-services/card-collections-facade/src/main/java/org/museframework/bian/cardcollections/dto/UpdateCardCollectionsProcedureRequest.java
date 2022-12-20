package org.museframework.bian.cardcollections.dto;

public class UpdateCardCollectionsProcedureRequest {
    private String cardcollectionsid;

    private org.museframework.bian.cardcollections.dto.cr.CardCollectionsProcedure cardCollectionsProcedure;

    public void setCardcollectionsid(String cardcollectionsid) {
        this.cardcollectionsid = cardcollectionsid;
    }

    public String getCardcollectionsid() {
        return cardcollectionsid;
    }

    public void setCardCollectionsProcedure(org.museframework.bian.cardcollections.dto.cr.CardCollectionsProcedure cardCollectionsProcedure) {
        this.cardCollectionsProcedure = cardCollectionsProcedure;
    }

    public org.museframework.bian.cardcollections.dto.cr.CardCollectionsProcedure getCardCollectionsProcedure() {
        return cardCollectionsProcedure;
    }
}