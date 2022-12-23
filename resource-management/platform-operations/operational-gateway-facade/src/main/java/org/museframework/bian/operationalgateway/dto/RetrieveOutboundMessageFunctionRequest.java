package org.museframework.bian.operationalgateway.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveOutboundMessageFunctionRequest {
    @MetaField
    private String operationalgatewayid;

    @MetaField
    private String outboundmessagefunctionid;

    public void setOperationalgatewayid(String operationalgatewayid) {
        this.operationalgatewayid = operationalgatewayid;
    }

    public String getOperationalgatewayid() {
        return operationalgatewayid;
    }

    public void setOutboundmessagefunctionid(String outboundmessagefunctionid) {
        this.outboundmessagefunctionid = outboundmessagefunctionid;
    }

    public String getOutboundmessagefunctionid() {
        return outboundmessagefunctionid;
    }
}