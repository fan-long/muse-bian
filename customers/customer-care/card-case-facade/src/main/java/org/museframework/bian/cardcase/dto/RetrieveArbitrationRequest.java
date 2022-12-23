package org.museframework.bian.cardcase.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveArbitrationRequest {
    @MetaField
    private String cardcaseid;

    @MetaField
    private String arbitrationid;

    public void setCardcaseid(String cardcaseid) {
        this.cardcaseid = cardcaseid;
    }

    public String getCardcaseid() {
        return cardcaseid;
    }

    public void setArbitrationid(String arbitrationid) {
        this.arbitrationid = arbitrationid;
    }

    public String getArbitrationid() {
        return arbitrationid;
    }
}