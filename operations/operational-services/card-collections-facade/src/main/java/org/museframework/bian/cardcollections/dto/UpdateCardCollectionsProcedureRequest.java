package org.museframework.bian.cardcollections.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCardCollectionsProcedureRequest {
    @MetaField
    private String cardcollectionsid;

    @MetaField(ref=true)
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