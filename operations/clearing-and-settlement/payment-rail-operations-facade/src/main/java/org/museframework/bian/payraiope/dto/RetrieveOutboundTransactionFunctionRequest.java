package org.museframework.bian.payraiope.dto;

public class RetrieveOutboundTransactionFunctionRequest {
    private String paymentrailoperationsid;

    private String outboundtransactionfunctionid;

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
}