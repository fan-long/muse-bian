package org.museframework.bian.cardcase.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateCardCaseProcedureRequest {
    @MetaField(ref=true)
    private org.museframework.bian.cardcase.dto.cr.CardCaseProcedure cardCaseProcedure;

    public void setCardCaseProcedure(org.museframework.bian.cardcase.dto.cr.CardCaseProcedure cardCaseProcedure) {
        this.cardCaseProcedure = cardCaseProcedure;
    }

    public org.museframework.bian.cardcase.dto.cr.CardCaseProcedure getCardCaseProcedure() {
        return cardCaseProcedure;
    }
}