package org.museframework.bian.cardclearing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCardClearingProcedureRequest {
    @MetaField
    private String cardclearingid;

    @MetaField(ref=true)
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