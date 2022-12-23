package org.museframework.bian.operationalgateway.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveOperationalGatewayOperatingSessionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.operationalgateway.dto.cr.OperationalGatewayOperatingSession operationalGatewayOperatingSession;

    public void setOperationalGatewayOperatingSession(org.museframework.bian.operationalgateway.dto.cr.OperationalGatewayOperatingSession operationalGatewayOperatingSession) {
        this.operationalGatewayOperatingSession = operationalGatewayOperatingSession;
    }

    public org.museframework.bian.operationalgateway.dto.cr.OperationalGatewayOperatingSession getOperationalGatewayOperatingSession() {
        return operationalGatewayOperatingSession;
    }
}