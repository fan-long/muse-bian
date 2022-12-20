package org.museframework.bian.paymentorder.dto;

public class RetrievePaymentOrderProcedureRequest {
    private String paymentorderid;

    public void setPaymentorderid(String paymentorderid) {
        this.paymentorderid = paymentorderid;
    }

    public String getPaymentorderid() {
        return paymentorderid;
    }
}