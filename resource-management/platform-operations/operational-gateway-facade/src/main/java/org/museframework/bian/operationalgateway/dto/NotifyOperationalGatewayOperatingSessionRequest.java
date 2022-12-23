package org.museframework.bian.operationalgateway.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyOperationalGatewayOperatingSessionRequest {
    @MetaField
    private String operationalgatewayid;

    public void setOperationalgatewayid(String operationalgatewayid) {
        this.operationalgatewayid = operationalgatewayid;
    }

    public String getOperationalgatewayid() {
        return operationalgatewayid;
    }
}