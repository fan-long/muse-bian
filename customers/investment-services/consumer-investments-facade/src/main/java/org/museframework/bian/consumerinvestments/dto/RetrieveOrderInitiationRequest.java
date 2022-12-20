package org.museframework.bian.consumerinvestments.dto;

public class RetrieveOrderInitiationRequest {
    private String consumerinvestmentsid;

    private String orderinitiationid;

    public void setConsumerinvestmentsid(String consumerinvestmentsid) {
        this.consumerinvestmentsid = consumerinvestmentsid;
    }

    public String getConsumerinvestmentsid() {
        return consumerinvestmentsid;
    }

    public void setOrderinitiationid(String orderinitiationid) {
        this.orderinitiationid = orderinitiationid;
    }

    public String getOrderinitiationid() {
        return orderinitiationid;
    }
}