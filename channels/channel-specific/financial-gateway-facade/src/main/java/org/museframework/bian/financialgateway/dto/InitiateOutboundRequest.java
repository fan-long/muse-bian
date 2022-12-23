package org.museframework.bian.financialgateway.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateOutboundRequest {
    @MetaField
    private String financialgatewayid;

    @MetaField
    private String outboundid;

    @MetaField(ref=true)
    private org.museframework.bian.financialgateway.dto.bq.Outbound outbound;

    public void setFinancialgatewayid(String financialgatewayid) {
        this.financialgatewayid = financialgatewayid;
    }

    public String getFinancialgatewayid() {
        return financialgatewayid;
    }

    public void setOutboundid(String outboundid) {
        this.outboundid = outboundid;
    }

    public String getOutboundid() {
        return outboundid;
    }

    public void setOutbound(org.museframework.bian.financialgateway.dto.bq.Outbound outbound) {
        this.outbound = outbound;
    }

    public org.museframework.bian.financialgateway.dto.bq.Outbound getOutbound() {
        return outbound;
    }
}