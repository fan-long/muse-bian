package org.museframework.bian.paymentorder.dto;

public class InitiatePaymentOrderProcedureRequest {
    private org.museframework.bian.paymentorder.dto.cr.PaymentOrderProcedure paymentOrderProcedure;

    public void setPaymentOrderProcedure(org.museframework.bian.paymentorder.dto.cr.PaymentOrderProcedure paymentOrderProcedure) {
        this.paymentOrderProcedure = paymentOrderProcedure;
    }

    public org.museframework.bian.paymentorder.dto.cr.PaymentOrderProcedure getPaymentOrderProcedure() {
        return paymentOrderProcedure;
    }
}