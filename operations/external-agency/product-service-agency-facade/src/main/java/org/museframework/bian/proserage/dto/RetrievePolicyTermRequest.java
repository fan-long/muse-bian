package org.museframework.bian.proserage.dto;

public class RetrievePolicyTermRequest {
    private String productserviceagencyid;

    private String policytermid;

    public void setProductserviceagencyid(String productserviceagencyid) {
        this.productserviceagencyid = productserviceagencyid;
    }

    public String getProductserviceagencyid() {
        return productserviceagencyid;
    }

    public void setPolicytermid(String policytermid) {
        this.policytermid = policytermid;
    }

    public String getPolicytermid() {
        return policytermid;
    }
}