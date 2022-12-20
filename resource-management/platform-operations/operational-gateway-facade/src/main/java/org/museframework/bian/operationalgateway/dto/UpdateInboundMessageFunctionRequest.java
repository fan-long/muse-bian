package org.museframework.bian.operationalgateway.dto;

public class UpdateInboundMessageFunctionRequest {
    private String operationalgatewayid;

    private String inboundmessagefunctionid;

    private org.museframework.bian.operationalgateway.dto.bq.InboundMessageFunction inboundMessageFunction;

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

    public void setInboundMessageFunction(org.museframework.bian.operationalgateway.dto.bq.InboundMessageFunction inboundMessageFunction) {
        this.inboundMessageFunction = inboundMessageFunction;
    }

    public org.museframework.bian.operationalgateway.dto.bq.InboundMessageFunction getInboundMessageFunction() {
        return inboundMessageFunction;
    }
}