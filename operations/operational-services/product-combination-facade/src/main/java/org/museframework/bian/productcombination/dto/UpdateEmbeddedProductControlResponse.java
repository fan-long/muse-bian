package org.museframework.bian.productcombination.dto;

public class UpdateEmbeddedProductControlResponse {
    private org.museframework.bian.productcombination.dto.bq.EmbeddedProductControl embeddedProductControl;

    public void setEmbeddedProductControl(org.museframework.bian.productcombination.dto.bq.EmbeddedProductControl embeddedProductControl) {
        this.embeddedProductControl = embeddedProductControl;
    }

    public org.museframework.bian.productcombination.dto.bq.EmbeddedProductControl getEmbeddedProductControl() {
        return embeddedProductControl;
    }
}