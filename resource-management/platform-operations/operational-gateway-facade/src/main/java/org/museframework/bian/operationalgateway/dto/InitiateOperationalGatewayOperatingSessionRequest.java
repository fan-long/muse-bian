package org.museframework.bian.operationalgateway.dto;

public class InitiateOperationalGatewayOperatingSessionRequest {
    private org.museframework.bian.operationalgateway.dto.cr.OperationalGatewayOperatingSession operationalGatewayOperatingSession;

    public void setOperationalGatewayOperatingSession(org.museframework.bian.operationalgateway.dto.cr.OperationalGatewayOperatingSession operationalGatewayOperatingSession) {
        this.operationalGatewayOperatingSession = operationalGatewayOperatingSession;
    }

    public org.museframework.bian.operationalgateway.dto.cr.OperationalGatewayOperatingSession getOperationalGatewayOperatingSession() {
        return operationalGatewayOperatingSession;
    }
}