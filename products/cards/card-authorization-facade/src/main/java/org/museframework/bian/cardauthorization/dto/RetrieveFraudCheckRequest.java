package org.museframework.bian.cardauthorization.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveFraudCheckRequest {
    @MetaField
    private String cardauthorizationid;

    @MetaField
    private String fraudcheckid;

    public void setCardauthorizationid(String cardauthorizationid) {
        this.cardauthorizationid = cardauthorizationid;
    }

    public String getCardauthorizationid() {
        return cardauthorizationid;
    }

    public void setFraudcheckid(String fraudcheckid) {
        this.fraudcheckid = fraudcheckid;
    }

    public String getFraudcheckid() {
        return fraudcheckid;
    }
}