package org.museframework.bian.financialgateway.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveInboundRequest {
    @MetaField
    private String financialgatewayid;

    @MetaField
    private String inboundid;

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
}