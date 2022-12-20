package org.museframework.bian.productcombination.dto;

public class UpdateEmbeddedProductControlRequest {
    private String productcombinationid;

    private String embeddedproductcontrolid;

    private org.museframework.bian.productcombination.dto.bq.EmbeddedProductControl embeddedProductControl;

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

    public void setEmbeddedProductControl(org.museframework.bian.productcombination.dto.bq.EmbeddedProductControl embeddedProductControl) {
        this.embeddedProductControl = embeddedProductControl;
    }

    public org.museframework.bian.productcombination.dto.bq.EmbeddedProductControl getEmbeddedProductControl() {
        return embeddedProductControl;
    }
}