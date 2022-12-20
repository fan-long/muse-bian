package org.museframework.bian.operationalgateway.dto;

public class InitiateOutboundMessageFunctionResponse {
    private org.museframework.bian.operationalgateway.dto.bq.OutboundMessageFunction outboundMessageFunction;

    public void setOutboundMessageFunction(org.museframework.bian.operationalgateway.dto.bq.OutboundMessageFunction outboundMessageFunction) {
        this.outboundMessageFunction = outboundMessageFunction;
    }

    public org.museframework.bian.operationalgateway.dto.bq.OutboundMessageFunction getOutboundMessageFunction() {
        return outboundMessageFunction;
    }
}