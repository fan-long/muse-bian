package org.museframework.bian.operationalgateway.dto;

public class RetrieveInboundMessageFunctionResponse {
    private org.museframework.bian.operationalgateway.dto.bq.InboundMessageFunction inboundMessageFunction;

    public void setInboundMessageFunction(org.museframework.bian.operationalgateway.dto.bq.InboundMessageFunction inboundMessageFunction) {
        this.inboundMessageFunction = inboundMessageFunction;
    }

    public org.museframework.bian.operationalgateway.dto.bq.InboundMessageFunction getInboundMessageFunction() {
        return inboundMessageFunction;
    }
}