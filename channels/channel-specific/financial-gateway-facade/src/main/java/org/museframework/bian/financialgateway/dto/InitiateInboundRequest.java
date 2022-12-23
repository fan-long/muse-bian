package org.museframework.bian.financialgateway.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateInboundRequest {
    @MetaField
    private String financialgatewayid;

    @MetaField
    private String inboundid;

    @MetaField(ref=true)
    private org.museframework.bian.financialgateway.dto.bq.Inbound inbound;

    public void setFinancialgatewayid(String financialgatewayid) {
        this.financialgatewayid = financialgatewayid;
    }

    public String getFinancialgatewayid() {
        return financialgatewayid;
    }

    public void setInboundid(String inboundid) {
        this.inboundid = inboundid;
    }

    public String getInboundid() {
        return inboundid;
    }

    public void setInbound(org.museframework.bian.financialgateway.dto.bq.Inbound inbound) {
        this.inbound = inbound;
    }

    public org.museframework.bian.financialgateway.dto.bq.Inbound getInbound() {
        return inbound;
    }
}