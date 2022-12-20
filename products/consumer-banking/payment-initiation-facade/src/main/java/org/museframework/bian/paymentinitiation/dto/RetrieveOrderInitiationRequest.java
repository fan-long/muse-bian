package org.museframework.bian.paymentinitiation.dto;

public class RetrieveOrderInitiationRequest {
    private String paymentinitiationid;

    private String orderinitiationid;

    public void setPaymentinitiationid(String paymentinitiationid) {
        this.paymentinitiationid = paymentinitiationid;
    }

    public String getPaymentinitiationid() {
        return paymentinitiationid;
    }

    public void setOrderinitiationid(String orderinitiationid) {
        this.orderinitiationid = orderinitiationid;
    }

    public String getOrderinitiationid() {
        return orderinitiationid;
    }
}