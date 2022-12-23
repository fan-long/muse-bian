package org.museframework.bian.operationalgateway.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyOutboundWithResponseFunctionRequest {
    @MetaField
    private String operationalgatewayid;

    @MetaField
    private String outboundwithresponsefunctionid;

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
}