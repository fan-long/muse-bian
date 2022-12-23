package org.museframework.bian.cardcase.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCardCaseProcedureRequest {
    @MetaField
    private String cardcaseid;

    @MetaField(ref=true)
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