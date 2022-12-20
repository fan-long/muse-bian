package org.museframework.bian.productcombination.dto;

public class RetrieveEmbeddedProductControlRequest {
    private String productcombinationid;

    private String embeddedproductcontrolid;

    public void setProductcombinationid(String productcombinationid) {
        this.productcombinationid = productcombinationid;
    }

    public String getProductcombinationid() {
        return productcombinationid;
    }

    public void setEmbeddedproductcontrolid(String embeddedproductcontrolid) {
        this.embeddedproductcontrolid = embeddedproductcontrolid;
    }

    public String getEmbeddedproductcontrolid() {
        return embeddedproductcontrolid;
    }
}