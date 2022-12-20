package org.museframework.bian.paymentorder.dto;

public class UpdatePaymentOrderProcedureRequest {
    private String paymentorderid;

    private org.museframework.bian.paymentorder.dto.cr.PaymentOrderProcedure paymentOrderProcedure;

    public void setPaymentorderid(String paymentorderid) {
        this.paymentorderid = paymentorderid;
    }

    public String getPaymentorderid() {
        return paymentorderid;
    }

    public void setPaymentOrderProcedure(org.museframework.bian.paymentorder.dto.cr.PaymentOrderProcedure paymentOrderProcedure) {
        this.paymentOrderProcedure = paymentOrderProcedure;
    }

    public org.museframework.bian.paymentorder.dto.cr.PaymentOrderProcedure getPaymentOrderProcedure() {
        return paymentOrderProcedure;
    }
}