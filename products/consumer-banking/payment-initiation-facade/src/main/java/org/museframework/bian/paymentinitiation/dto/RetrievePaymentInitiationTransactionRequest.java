package org.museframework.bian.paymentinitiation.dto;

public class RetrievePaymentInitiationTransactionRequest {
    private String paymentinitiationid;

    public void setPaymentinitiationid(String paymentinitiationid) {
        this.paymentinitiationid = paymentinitiationid;
    }

    public String getPaymentinitiationid() {
        return paymentinitiationid;
    }
}