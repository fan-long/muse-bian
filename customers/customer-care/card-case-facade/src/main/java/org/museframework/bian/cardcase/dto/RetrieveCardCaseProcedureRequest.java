package org.museframework.bian.cardcase.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCardCaseProcedureRequest {
    @MetaField
    private String cardcaseid;

    public void setCardcaseid(String cardcaseid) {
        this.cardcaseid = cardcaseid;
    }

    public String getCardcaseid() {
        return cardcaseid;
    }
}