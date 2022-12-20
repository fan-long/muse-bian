package org.museframework.bian.sessiondialogue.dto;

public class UpdateOrderRequest {
    private String sessiondialogueid;

    private String orderid;

    private org.museframework.bian.sessiondialogue.dto.bq.Order order;

    public void setSessiondialogueid(String sessiondialogueid) {
        this.sessiondialogueid = sessiondialogueid;
    }

    public String getSessiondialogueid() {
        return sessiondialogueid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrder(org.museframework.bian.sessiondialogue.dto.bq.Order order) {
        this.order = order;
    }

    public org.museframework.bian.sessiondialogue.dto.bq.Order getOrder() {
        return order;
    }
}