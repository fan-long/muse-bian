package org.museframework.bian.virtualaccount.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class GrantStandingOrderRequest {
    @MetaField
    private String virtualaccountid;

    @MetaField
    private String standingorderid;

    @MetaField(ref=true)
    private org.museframework.bian.virtualaccount.dto.bq.StandingOrder standingOrder;

    public void setVirtualaccountid(String virtualaccountid) {
        this.virtualaccountid = virtualaccountid;
    }

    public String getVirtualaccountid() {
        return virtualaccountid;
    }

    public void setStandingorderid(String standingorderid) {
        this.standingorderid = standingorderid;
    }

    public String getStandingorderid() {
        return standingorderid;
    }

    public void setStandingOrder(org.museframework.bian.virtualaccount.dto.bq.StandingOrder standingOrder) {
        this.standingOrder = standingOrder;
    }

    public org.museframework.bian.virtualaccount.dto.bq.StandingOrder getStandingOrder() {
        return standingOrder;
    }
}