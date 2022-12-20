package org.museframework.bian.paymentorder.dto;

public class RetrieveOrderConfirmationResponse {
    private org.museframework.bian.paymentorder.dto.bq.OrderConfirmation orderConfirmation;

    public void setOrderConfirmation(org.museframework.bian.paymentorder.dto.bq.OrderConfirmation orderConfirmation) {
        this.orderConfirmation = orderConfirmation;
    }

    public org.museframework.bian.paymentorder.dto.bq.OrderConfirmation getOrderConfirmation() {
        return orderConfirmation;
    }
}