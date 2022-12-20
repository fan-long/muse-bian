package org.museframework.bian.productmatching.dto;

public class RetrieveProductTypeSelectionRequest {
    private String productmatchingid;

    private String producttypeselectionid;

    public void setProductmatchingid(String productmatchingid) {
        this.productmatchingid = productmatchingid;
    }

    public String getProductmatchingid() {
        return productmatchingid;
    }

    public void setProducttypeselectionid(String producttypeselectionid) {
        this.producttypeselectionid = producttypeselectionid;
    }

    public String getProducttypeselectionid() {
        return producttypeselectionid;
    }
}