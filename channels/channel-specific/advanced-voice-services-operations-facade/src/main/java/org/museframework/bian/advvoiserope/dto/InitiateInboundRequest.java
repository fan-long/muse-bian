package org.museframework.bian.advvoiserope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateInboundRequest {
    @MetaField
    private String advancedvoiceservicesoperationsid;

    @MetaField
    private String inboundid;

    @MetaField(ref=true)
    private org.museframework.bian.advvoiserope.dto.bq.Inbound inbound;

    public void setAdvancedvoiceservicesoperationsid(String advancedvoiceservicesoperationsid) {
        this.advancedvoiceservicesoperationsid = advancedvoiceservicesoperationsid;
    }

    public String getAdvancedvoiceservicesoperationsid() {
        return advancedvoiceservicesoperationsid;
    }

    public void setInboundid(String inboundid) {
        this.inboundid = inboundid;
    }

    public String getInboundid() {
        return inboundid;
    }

    public void setInbound(org.museframework.bian.advvoiserope.dto.bq.Inbound inbound) {
        this.inbound = inbound;
    }

    public org.museframework.bian.advvoiserope.dto.bq.Inbound getInbound() {
        return inbound;
    }
}