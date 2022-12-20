package org.museframework.bian.paymentexecution.dto;

public class RetrievePaymentExecutionWorkstepRequest {
    private String paymentexecutionid;

    private String paymentexecutionworkstepid;

    public void setPaymentexecutionid(String paymentexecutionid) {
        this.paymentexecutionid = paymentexecutionid;
    }

    public String getPaymentexecutionid() {
        return paymentexecutionid;
    }

    public void setPaymentexecutionworkstepid(String paymentexecutionworkstepid) {
        this.paymentexecutionworkstepid = paymentexecutionworkstepid;
    }

    public String getPaymentexecutionworkstepid() {
        return paymentexecutionworkstepid;
    }
}