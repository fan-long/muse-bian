package org.museframework.bian.paymentorder.dto;

public class RetrieveExecutionInitiationRequest {
    private String paymentorderid;

    private String executioninitiationid;

    public void setPaymentorderid(String paymentorderid) {
        this.paymentorderid = paymentorderid;
    }

    public String getPaymentorderid() {
        return paymentorderid;
    }

    public void setExecutioninitiationid(String executioninitiationid) {
        this.executioninitiationid = executioninitiationid;
    }

    public String getExecutioninitiationid() {
        return executioninitiationid;
    }
}