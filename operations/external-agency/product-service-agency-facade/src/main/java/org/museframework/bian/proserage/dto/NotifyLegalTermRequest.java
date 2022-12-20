package org.museframework.bian.proserage.dto;

public class NotifyLegalTermRequest {
    private String productserviceagencyid;

    private String legaltermid;

    public void setProductserviceagencyid(String productserviceagencyid) {
        this.productserviceagencyid = productserviceagencyid;
    }

    public String getProductserviceagencyid() {
        return productserviceagencyid;
    }

    public void setLegaltermid(String legaltermid) {
        this.legaltermid = legaltermid;
    }

    public String getLegaltermid() {
        return legaltermid;
    }
}