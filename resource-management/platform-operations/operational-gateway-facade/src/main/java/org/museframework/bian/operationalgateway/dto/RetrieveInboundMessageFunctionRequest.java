package org.museframework.bian.operationalgateway.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveInboundMessageFunctionRequest {
    @MetaField
    private String operationalgatewayid;

    @MetaField
    private String inboundmessagefunctionid;

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
}