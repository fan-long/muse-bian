package org.museframework.bian.operationalgateway.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateOutboundWithResponseFunctionRequest {
    @MetaField
    private String operationalgatewayid;

    @MetaField
    private String outboundwithresponsefunctionid;

    @MetaField(ref=true)
    private org.museframework.bian.operationalgateway.dto.bq.OutboundWithResponseFunction outboundWithResponseFunction;

    public void setOperationalgatewayid(String operationalgatewayid) {
        this.operationalgatewayid = operationalgatewayid;
    }

    public String getOperationalgatewayid() {
        return operationalgatewayid;
    }

    public void setOutboundwithresponsefunctionid(String outboundwithresponsefunctionid) {
        this.outboundwithresponsefunctionid = outboundwithresponsefunctionid;
    }

    public String getOutboundwithresponsefunctionid() {
        return outboundwithresponsefunctionid;
    }

    public void setOutboundWithResponseFunction(org.museframework.bian.operationalgateway.dto.bq.OutboundWithResponseFunction outboundWithResponseFunction) {
        this.outboundWithResponseFunction = outboundWithResponseFunction;
    }

    public org.museframework.bian.operationalgateway.dto.bq.OutboundWithResponseFunction getOutboundWithResponseFunction() {
        return outboundWithResponseFunction;
    }
}