package org.museframework.bian.paymentorder.dto;

public class RetrieveOrderConfirmationRequest {
    private String paymentorderid;

    private String orderconfirmationid;

    public void setPaymentorderid(String paymentorderid) {
        this.paymentorderid = paymentorderid;
    }

    public String getPaymentorderid() {
        return paymentorderid;
    }

    public void setOrderconfirmationid(String orderconfirmationid) {
        this.orderconfirmationid = orderconfirmationid;
    }

    public String getOrderconfirmationid() {
        return orderconfirmationid;
    }
}