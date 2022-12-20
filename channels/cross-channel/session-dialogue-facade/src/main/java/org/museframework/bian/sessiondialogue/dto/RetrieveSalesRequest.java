package org.museframework.bian.sessiondialogue.dto;

public class RetrieveSalesRequest {
    private String sessiondialogueid;

    private String salesid;

    public void setSessiondialogueid(String sessiondialogueid) {
        this.sessiondialogueid = sessiondialogueid;
    }

    public String getSessiondialogueid() {
        return sessiondialogueid;
    }

    public void setSalesid(String salesid) {
        this.salesid = salesid;
    }

    public String getSalesid() {
        return salesid;
    }
}