package org.museframework.bian.paymentexecution.dto;

public class RetrievePaymentExecutionProcedureResponse {
    private org.museframework.bian.paymentexecution.dto.cr.PaymentExecutionProcedure paymentExecutionProcedure;

    public void setPaymentExecutionProcedure(org.museframework.bian.paymentexecution.dto.cr.PaymentExecutionProcedure paymentExecutionProcedure) {
        this.paymentExecutionProcedure = paymentExecutionProcedure;
    }

    public org.museframework.bian.paymentexecution.dto.cr.PaymentExecutionProcedure getPaymentExecutionProcedure() {
        return paymentExecutionProcedure;
    }
}