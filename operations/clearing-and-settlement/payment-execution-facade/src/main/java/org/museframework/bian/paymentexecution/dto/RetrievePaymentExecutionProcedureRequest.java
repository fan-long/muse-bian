package org.museframework.bian.paymentexecution.dto;

public class RetrievePaymentExecutionProcedureRequest {
    private String paymentexecutionid;

    public void setPaymentexecutionid(String paymentexecutionid) {
        this.paymentexecutionid = paymentexecutionid;
    }

    public String getPaymentexecutionid() {
        return paymentexecutionid;
    }
}