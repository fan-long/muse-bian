package org.museframework.bian.ebranchoperations.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateOutboundRequest {
    @MetaField
    private String ebranchoperationsid;

    @MetaField
    private String outboundid;

    @MetaField(ref=true)
    private org.museframework.bian.ebranchoperations.dto.bq.Outbound outbound;

    public void setEbranchoperationsid(String ebranchoperationsid) {
        this.ebranchoperationsid = ebranchoperationsid;
    }

    public String getEbranchoperationsid() {
        return ebranchoperationsid;
    }

    public void setOutboundid(String outboundid) {
        this.outboundid = outboundid;
    }

    public String getOutboundid() {
        return outboundid;
    }

    public void setOutbound(org.museframework.bian.ebranchoperations.dto.bq.Outbound outbound) {
        this.outbound = outbound;
    }

    public org.museframework.bian.ebranchoperations.dto.bq.Outbound getOutbound() {
        return outbound;
    }
}