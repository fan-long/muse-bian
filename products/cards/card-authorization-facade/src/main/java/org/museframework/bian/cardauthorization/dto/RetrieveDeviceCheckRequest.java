package org.museframework.bian.cardauthorization.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveDeviceCheckRequest {
    @MetaField
    private String cardauthorizationid;

    @MetaField
    private String devicecheckid;

    public void setCardauthorizationid(String cardauthorizationid) {
        this.cardauthorizationid = cardauthorizationid;
    }

    public String getCardauthorizationid() {
        return cardauthorizationid;
    }

    public void setDevicecheckid(String devicecheckid) {
        this.devicecheckid = devicecheckid;
    }

    public String getDevicecheckid() {
        return devicecheckid;
    }
}