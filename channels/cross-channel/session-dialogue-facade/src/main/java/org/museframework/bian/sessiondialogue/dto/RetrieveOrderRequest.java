package org.museframework.bian.sessiondialogue.dto;

public class RetrieveOrderRequest {
    private String sessiondialogueid;

    private String orderid;

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
}