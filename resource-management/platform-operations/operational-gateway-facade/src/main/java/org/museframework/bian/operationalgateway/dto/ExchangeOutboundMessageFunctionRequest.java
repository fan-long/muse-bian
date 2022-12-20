package org.museframework.bian.operationalgateway.dto;

public class ExchangeOutboundMessageFunctionRequest {
    private String operationalgatewayid;

    private String outboundmessagefunctionid;

    private org.museframework.bian.operationalgateway.dto.bq.OutboundMessageFunction outboundMessageFunction;

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

    public void setOutboundMessageFunction(org.museframework.bian.operationalgateway.dto.bq.OutboundMessageFunction outboundMessageFunction) {
        this.outboundMessageFunction = outboundMessageFunction;
    }

    public org.museframework.bian.operationalgateway.dto.bq.OutboundMessageFunction getOutboundMessageFunction() {
        return outboundMessageFunction;
    }
}