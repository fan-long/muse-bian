package org.museframework.bian.contacthandler.dto;

public class RetrieveRoutingRequest {
    private String contacthandlerid;

    private String routingid;

    public void setContacthandlerid(String contacthandlerid) {
        this.contacthandlerid = contacthandlerid;
    }

    public String getContacthandlerid() {
        return contacthandlerid;
    }

    public void setRoutingid(String routingid) {
        this.routingid = routingid;
    }

    public String getRoutingid() {
        return routingid;
    }
}