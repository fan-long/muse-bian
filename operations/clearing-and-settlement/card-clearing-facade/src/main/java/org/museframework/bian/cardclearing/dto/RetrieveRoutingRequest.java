package org.museframework.bian.cardclearing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveRoutingRequest {
    @MetaField
    private String cardclearingid;

    @MetaField
    private String routingid;

    public void setCardclearingid(String cardclearingid) {
        this.cardclearingid = cardclearingid;
    }

    public String getCardclearingid() {
        return cardclearingid;
    }

    public void setRoutingid(String routingid) {
        this.routingid = routingid;
    }

    public String getRoutingid() {
        return routingid;
    }
}