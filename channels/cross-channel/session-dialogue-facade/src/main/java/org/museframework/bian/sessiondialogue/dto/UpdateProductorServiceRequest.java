package org.museframework.bian.sessiondialogue.dto;

public class UpdateProductorServiceRequest {
    private String sessiondialogueid;

    private String productorserviceid;

    private org.museframework.bian.sessiondialogue.dto.bq.ProductorService productorService;

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

    public void setProductorService(org.museframework.bian.sessiondialogue.dto.bq.ProductorService productorService) {
        this.productorService = productorService;
    }

    public org.museframework.bian.sessiondialogue.dto.bq.ProductorService getProductorService() {
        return productorService;
    }
}