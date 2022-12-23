package org.museframework.bian.advvoiserope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateOutboundRequest {
    @MetaField
    private String advancedvoiceservicesoperationsid;

    @MetaField
    private String outboundid;

    @MetaField(ref=true)
    private org.museframework.bian.advvoiserope.dto.bq.Outbound outbound;

    public void setAdvancedvoiceservicesoperationsid(String advancedvoiceservicesoperationsid) {
        this.advancedvoiceservicesoperationsid = advancedvoiceservicesoperationsid;
    }

    public String getAdvancedvoiceservicesoperationsid() {
        return advancedvoiceservicesoperationsid;
    }

    public void setOutboundid(String outboundid) {
        this.outboundid = outboundid;
    }

    public String getOutboundid() {
        return outboundid;
    }

    public void setOutbound(org.museframework.bian.advvoiserope.dto.bq.Outbound outbound) {
        this.outbound = outbound;
    }

    public org.museframework.bian.advvoiserope.dto.bq.Outbound getOutbound() {
        return outbound;
    }
}