package org.museframework.bian.cusevehis.dto;

public class UpdateProductProcessingResponse {
    private org.museframework.bian.cusevehis.dto.bq.ProductProcessing productProcessing;

    public void setProductProcessing(org.museframework.bian.cusevehis.dto.bq.ProductProcessing productProcessing) {
        this.productProcessing = productProcessing;
    }

    public org.museframework.bian.cusevehis.dto.bq.ProductProcessing getProductProcessing() {
        return productProcessing;
    }
}