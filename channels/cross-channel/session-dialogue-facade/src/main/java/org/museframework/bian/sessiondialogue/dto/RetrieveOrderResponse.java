package org.museframework.bian.sessiondialogue.dto;

public class RetrieveOrderResponse {
    private org.museframework.bian.sessiondialogue.dto.bq.Order order;

    public void setOrder(org.museframework.bian.sessiondialogue.dto.bq.Order order) {
        this.order = order;
    }

    public org.museframework.bian.sessiondialogue.dto.bq.Order getOrder() {
        return order;
    }
}