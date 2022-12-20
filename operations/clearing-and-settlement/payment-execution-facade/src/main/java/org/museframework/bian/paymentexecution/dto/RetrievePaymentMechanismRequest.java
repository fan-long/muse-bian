package org.museframework.bian.paymentexecution.dto;

public class RetrievePaymentMechanismRequest {
    private String paymentexecutionid;

    private String paymentmechanismid;

    public void setPaymentexecutionid(String paymentexecutionid) {
        this.paymentexecutionid = paymentexecutionid;
    }

    public String getPaymentexecutionid() {
        return paymentexecutionid;
    }

    public void setPaymentmechanismid(String paymentmechanismid) {
        this.paymentmechanismid = paymentmechanismid;
    }

    public String getPaymentmechanismid() {
        return paymentmechanismid;
    }
}