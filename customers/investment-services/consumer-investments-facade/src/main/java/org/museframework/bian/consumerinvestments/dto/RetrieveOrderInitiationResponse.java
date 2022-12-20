package org.museframework.bian.consumerinvestments.dto;

public class RetrieveOrderInitiationResponse {
    private org.museframework.bian.consumerinvestments.dto.bq.OrderInitiation orderInitiation;

    public void setOrderInitiation(org.museframework.bian.consumerinvestments.dto.bq.OrderInitiation orderInitiation) {
        this.orderInitiation = orderInitiation;
    }

    public org.museframework.bian.consumerinvestments.dto.bq.OrderInitiation getOrderInitiation() {
        return orderInitiation;
    }
}