package org.museframework.bian.correspondence.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateOutboundRequest {
    @MetaField
    private String correspondenceid;

    @MetaField
    private String outboundid;

    @MetaField(ref=true)
    private org.museframework.bian.correspondence.dto.bq.Outbound outbound;

    public void setCorrespondenceid(String correspondenceid) {
        this.correspondenceid = correspondenceid;
    }

    public String getCorrespondenceid() {
        return correspondenceid;
    }

    public void setOutboundid(String outboundid) {
        this.outboundid = outboundid;
    }

    public String getOutboundid() {
        return outboundid;
    }

    public void setOutbound(org.museframework.bian.correspondence.dto.bq.Outbound outbound) {
        this.outbound = outbound;
    }

    public org.museframework.bian.correspondence.dto.bq.Outbound getOutbound() {
        return outbound;
    }
}