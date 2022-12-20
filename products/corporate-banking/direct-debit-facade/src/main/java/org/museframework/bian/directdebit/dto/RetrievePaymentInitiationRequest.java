package org.museframework.bian.directdebit.dto;

public class RetrievePaymentInitiationRequest {
    private String directdebitid;

    private String paymentinitiationid;

    public void setDirectdebitid(String directdebitid) {
        this.directdebitid = directdebitid;
    }

    public String getDirectdebitid() {
        return directdebitid;
    }

    public void setPaymentinitiationid(String paymentinitiationid) {
        this.paymentinitiationid = paymentinitiationid;
    }

    public String getPaymentinitiationid() {
        return paymentinitiationid;
    }
}