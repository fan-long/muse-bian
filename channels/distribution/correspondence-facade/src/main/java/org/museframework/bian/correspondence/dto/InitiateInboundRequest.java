package org.museframework.bian.correspondence.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateInboundRequest {
    @MetaField
    private String correspondenceid;

    @MetaField
    private String inboundid;

    @MetaField(ref=true)
    private org.museframework.bian.correspondence.dto.bq.Inbound inbound;

    public void setCorrespondenceid(String correspondenceid) {
        this.correspondenceid = correspondenceid;
    }

    public String getCorrespondenceid() {
        return correspondenceid;
    }

    public void setInboundid(String inboundid) {
        this.inboundid = inboundid;
    }

    public String getInboundid() {
        return inboundid;
    }

    public void setInbound(org.museframework.bian.correspondence.dto.bq.Inbound inbound) {
        this.inbound = inbound;
    }

    public org.museframework.bian.correspondence.dto.bq.Inbound getInbound() {
        return inbound;
    }
}