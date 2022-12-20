package org.museframework.bian.operationalgateway.dto;

public class NotifyOutboundMessageFunctionRequest {
    private String operationalgatewayid;

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