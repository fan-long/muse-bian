package org.museframework.bian.payraiope.dto;

public class InitiateOutboundTransactionFunctionResponse {
    private org.museframework.bian.payraiope.dto.bq.OutboundTransactionFunction outboundTransactionFunction;

    public void setOutboundTransactionFunction(org.museframework.bian.payraiope.dto.bq.OutboundTransactionFunction outboundTransactionFunction) {
        this.outboundTransactionFunction = outboundTransactionFunction;
    }

    public org.museframework.bian.payraiope.dto.bq.OutboundTransactionFunction getOutboundTransactionFunction() {
        return outboundTransactionFunction;
    }
}