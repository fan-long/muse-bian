package org.museframework.bian.operationalgateway.dto;

public class ExecuteOperationalGatewayOperatingSessionRequest {
    private String operationalgatewayid;

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