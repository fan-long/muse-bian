package org.museframework.bian.payraiope.dto;

public class RequestInboundTransactionFunctionResponse {
    private org.museframework.bian.payraiope.dto.bq.InboundTransactionFunction inboundTransactionFunction;

    public void setInboundTransactionFunction(org.museframework.bian.payraiope.dto.bq.InboundTransactionFunction inboundTransactionFunction) {
        this.inboundTransactionFunction = inboundTransactionFunction;
    }

    public org.museframework.bian.payraiope.dto.bq.InboundTransactionFunction getInboundTransactionFunction() {
        return inboundTransactionFunction;
    }
}