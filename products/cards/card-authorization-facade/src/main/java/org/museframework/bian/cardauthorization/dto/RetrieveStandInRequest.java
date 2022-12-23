package org.museframework.bian.cardauthorization.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveStandInRequest {
    @MetaField
    private String cardauthorizationid;

    @MetaField
    private String standinid;

    public void setCardauthorizationid(String cardauthorizationid) {
        this.cardauthorizationid = cardauthorizationid;
    }

    public String getCardauthorizationid() {
        return cardauthorizationid;
    }

    public void setStandinid(String standinid) {
        this.standinid = standinid;
    }

    public String getStandinid() {
        return standinid;
    }
}