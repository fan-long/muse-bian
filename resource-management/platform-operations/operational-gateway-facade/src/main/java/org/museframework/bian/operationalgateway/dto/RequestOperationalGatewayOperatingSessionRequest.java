package org.museframework.bian.operationalgateway.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestOperationalGatewayOperatingSessionRequest {
    @MetaField
    private String operationalgatewayid;

    @MetaField(ref=true)
    private org.museframework.bian.operationalgateway.dto.cr.OperationalGatewayOperatingSession operationalGatewayOperatingSession;

    public void setOperationalgatewayid(String operationalgatewayid) {
        this.operationalgatewayid = operationalgatewayid;
    }

    public String getOperationalgatewayid() {
        return operationalgatewayid;
    }

    public void setOperationalGatewayOperatingSession(org.museframework.bian.operationalgateway.dto.cr.OperationalGatewayOperatingSession operationalGatewayOperatingSession) {
        this.operationalGatewayOperatingSession = operationalGatewayOperatingSession;
    }

    public org.museframework.bian.operationalgateway.dto.cr.OperationalGatewayOperatingSession getOperationalGatewayOperatingSession() {
        return operationalGatewayOperatingSession;
    }
}