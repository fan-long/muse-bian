package org.museframework.bian.sessiondialogue.dto;

public class InitiateSalesRequest {
    private String sessiondialogueid;

    private String salesid;

    private org.museframework.bian.sessiondialogue.dto.bq.Sales sales;

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

    public void setSales(org.museframework.bian.sessiondialogue.dto.bq.Sales sales) {
        this.sales = sales;
    }

    public org.museframework.bian.sessiondialogue.dto.bq.Sales getSales() {
        return sales;
    }
}