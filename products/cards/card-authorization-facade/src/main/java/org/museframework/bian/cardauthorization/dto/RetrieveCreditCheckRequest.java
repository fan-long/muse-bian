package org.museframework.bian.cardauthorization.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCreditCheckRequest {
    @MetaField
    private String cardauthorizationid;

    @MetaField
    private String creditcheckid;

    public void setCardauthorizationid(String cardauthorizationid) {
        this.cardauthorizationid = cardauthorizationid;
    }

    public String getCardauthorizationid() {
        return cardauthorizationid;
    }

    public void setCreditcheckid(String creditcheckid) {
        this.creditcheckid = creditcheckid;
    }

    public String getCreditcheckid() {
        return creditcheckid;
    }
}