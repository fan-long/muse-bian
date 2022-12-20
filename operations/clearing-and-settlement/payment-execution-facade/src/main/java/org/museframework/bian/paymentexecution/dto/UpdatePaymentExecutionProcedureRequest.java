package org.museframework.bian.paymentexecution.dto;

public class UpdatePaymentExecutionProcedureRequest {
    private String paymentexecutionid;

    private org.museframework.bian.paymentexecution.dto.cr.PaymentExecutionProcedure paymentExecutionProcedure;

    public void setPaymentexecutionid(String paymentexecutionid) {
        this.paymentexecutionid = paymentexecutionid;
    }

    public String getPaymentexecutionid() {
        return paymentexecutionid;
    }

    public void setPaymentExecutionProcedure(org.museframework.bian.paymentexecution.dto.cr.PaymentExecutionProcedure paymentExecutionProcedure) {
        this.paymentExecutionProcedure = paymentExecutionProcedure;
    }

    public org.museframework.bian.paymentexecution.dto.cr.PaymentExecutionProcedure getPaymentExecutionProcedure() {
        return paymentExecutionProcedure;
    }
}