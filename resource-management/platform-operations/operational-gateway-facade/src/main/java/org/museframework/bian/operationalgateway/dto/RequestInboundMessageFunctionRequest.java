package org.museframework.bian.operationalgateway.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestInboundMessageFunctionRequest {
    @MetaField
    private String operationalgatewayid;

    @MetaField
    private String inboundmessagefunctionid;

    @MetaField(ref=true)
    private org.museframework.bian.operationalgateway.dto.bq.InboundMessageFunction inboundMessageFunction;

    public void setOperationalgatewayid(String operationalgatewayid) {
        this.operationalgatewayid = operationalgatewayid;
    }

    public String getOperationalgatewayid() {
        return operationalgatewayid;
    }

    public void setInboundmessagefunctionid(String inboundmessagefunctionid) {
        this.inboundmessagefunctionid = inboundmessagefunctionid;
    }

    public String getInboundmessagefunctionid() {
        return inboundmessagefunctionid;
    }

    public void setInboundMessageFunction(org.museframework.bian.operationalgateway.dto.bq.InboundMessageFunction inboundMessageFunction) {
        this.inboundMessageFunction = inboundMessageFunction;
    }

    public org.museframework.bian.operationalgateway.dto.bq.InboundMessageFunction getInboundMessageFunction() {
        return inboundMessageFunction;
    }
}