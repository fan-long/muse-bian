package org.museframework.bian.payraiope.dto;

public class ExecuteInboundTransactionFunctionRequest {
    private String paymentrailoperationsid;

    private String inboundtransactionfunctionid;

    private org.museframework.bian.payraiope.dto.bq.InboundTransactionFunction inboundTransactionFunction;

    public void setPaymentrailoperationsid(String paymentrailoperationsid) {
        this.paymentrailoperationsid = paymentrailoperationsid;
    }

    public String getPaymentrailoperationsid() {
        return paymentrailoperationsid;
    }

    public void setInboundtransactionfunctionid(String inboundtransactionfunctionid) {
        this.inboundtransactionfunctionid = inboundtransactionfunctionid;
    }

    public String getInboundtransactionfunctionid() {
        return inboundtransactionfunctionid;
    }

    public void setInboundTransactionFunction(org.museframework.bian.payraiope.dto.bq.InboundTransactionFunction inboundTransactionFunction) {
        this.inboundTransactionFunction = inboundTransactionFunction;
    }

    public org.museframework.bian.payraiope.dto.bq.InboundTransactionFunction getInboundTransactionFunction() {
        return inboundTransactionFunction;
    }
}