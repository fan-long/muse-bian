package org.museframework.bian.payraiope.dto;

public class InitiatePaymentClearingandSettlementFunctionRequest {
    private String paymentrailoperationsid;

    private String paymentclearingandsettlementfunctionid;

    private org.museframework.bian.payraiope.dto.bq.PaymentClearingandSettlementFunction paymentClearingandSettlementFunction;

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

    public void setPaymentClearingandSettlementFunction(org.museframework.bian.payraiope.dto.bq.PaymentClearingandSettlementFunction paymentClearingandSettlementFunction) {
        this.paymentClearingandSettlementFunction = paymentClearingandSettlementFunction;
    }

    public org.museframework.bian.payraiope.dto.bq.PaymentClearingandSettlementFunction getPaymentClearingandSettlementFunction() {
        return paymentClearingandSettlementFunction;
    }
}