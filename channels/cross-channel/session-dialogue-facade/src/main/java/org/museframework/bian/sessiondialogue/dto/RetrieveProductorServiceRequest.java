package org.museframework.bian.sessiondialogue.dto;

public class RetrieveProductorServiceRequest {
    private String sessiondialogueid;

    private String productorserviceid;

    public void setSessiondialogueid(String sessiondialogueid) {
        this.sessiondialogueid = sessiondialogueid;
    }

    public String getSessiondialogueid() {
        return sessiondialogueid;
    }

    public void setProductorserviceid(String productorserviceid) {
        this.productorserviceid = productorserviceid;
    }

    public String getProductorserviceid() {
        return productorserviceid;
    }
}