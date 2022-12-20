package org.museframework.bian.payraiope.dto;

public class RetrieveInboundTransactionFunctionRequest {
    private String paymentrailoperationsid;

    private String inboundtransactionfunctionid;

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
}