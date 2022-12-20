package org.museframework.bian.operationalgateway.dto;

public class RetrieveInboundMessageFunctionRequest {
    private String operationalgatewayid;

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