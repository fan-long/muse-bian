package org.museframework.bian.paymentinitiation.dto;

public class RetrieveOrderInitiationResponse {
    private org.museframework.bian.paymentinitiation.dto.bq.OrderInitiation orderInitiation;

    public void setOrderInitiation(org.museframework.bian.paymentinitiation.dto.bq.OrderInitiation orderInitiation) {
        this.orderInitiation = orderInitiation;
    }

    public org.museframework.bian.paymentinitiation.dto.bq.OrderInitiation getOrderInitiation() {
        return orderInitiation;
    }
}