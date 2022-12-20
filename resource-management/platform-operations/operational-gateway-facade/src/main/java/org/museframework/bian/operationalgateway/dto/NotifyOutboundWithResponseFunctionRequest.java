package org.museframework.bian.operationalgateway.dto;

public class NotifyOutboundWithResponseFunctionRequest {
    private String operationalgatewayid;

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