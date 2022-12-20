package org.museframework.bian.payraiope.dto;

public class RequestOutboundTransactionFunctionRequest {
    private String paymentrailoperationsid;

    private String outboundtransactionfunctionid;

    private org.museframework.bian.payraiope.dto.bq.OutboundTransactionFunction outboundTransactionFunction;

    public void setPaymentrailoperationsid(String paymentrailoperationsid) {
        this.paymentrailoperationsid = paymentrailoperationsid;
    }

    public String getPaymentrailoperationsid() {
        return paymentrailoperationsid;
    }

    public void setOutboundtransactionfunctionid(String outboundtransactionfunctionid) {
        this.outboundtransactionfunctionid = outboundtransactionfunctionid;
    }

    public String getOutboundtransactionfunctionid() {
        return outboundtransactionfunctionid;
    }

    public void setOutboundTransactionFunction(org.museframework.bian.payraiope.dto.bq.OutboundTransactionFunction outboundTransactionFunction) {
        this.outboundTransactionFunction = outboundTransactionFunction;
    }

    public org.museframework.bian.payraiope.dto.bq.OutboundTransactionFunction getOutboundTransactionFunction() {
        return outboundTransactionFunction;
    }
}