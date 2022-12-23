package org.museframework.bian.ebranchoperations.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateInboundRequest {
    @MetaField
    private String ebranchoperationsid;

    @MetaField
    private String inboundid;

    @MetaField(ref=true)
    private org.museframework.bian.ebranchoperations.dto.bq.Inbound inbound;

    public void setEbranchoperationsid(String ebranchoperationsid) {
        this.ebranchoperationsid = ebranchoperationsid;
    }

    public String getEbranchoperationsid() {
        return ebranchoperationsid;
    }

    public void setInboundid(String inboundid) {
        this.inboundid = inboundid;
    }

    public String getInboundid() {
        return inboundid;
    }

    public void setInbound(org.museframework.bian.ebranchoperations.dto.bq.Inbound inbound) {
        this.inbound = inbound;
    }

    public org.museframework.bian.ebranchoperations.dto.bq.Inbound getInbound() {
        return inbound;
    }
}