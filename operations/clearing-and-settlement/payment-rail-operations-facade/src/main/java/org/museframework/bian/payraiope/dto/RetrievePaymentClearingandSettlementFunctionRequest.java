package org.museframework.bian.payraiope.dto;

public class RetrievePaymentClearingandSettlementFunctionRequest {
    private String paymentrailoperationsid;

    private String paymentclearingandsettlementfunctionid;

    public void setPaymentrailoperationsid(String paymentrailoperationsid) {
        this.paymentrailoperationsid = paymentrailoperationsid;
    }

    public String getPaymentrailoperationsid() {
        return paymentrailoperationsid;
    }

    public void setPaymentclearingandsettlementfunctionid(String paymentclearingandsettlementfunctionid) {
        this.paymentclearingandsettlementfunctionid = paymentclearingandsettlementfunctionid;
    }

    public String getPaymentclearingandsettlementfunctionid() {
        return paymentclearingandsettlementfunctionid;
    }
}