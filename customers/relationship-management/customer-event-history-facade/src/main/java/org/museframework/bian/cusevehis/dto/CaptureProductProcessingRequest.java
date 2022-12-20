package org.museframework.bian.cusevehis.dto;

public class CaptureProductProcessingRequest {
    private String customereventhistoryid;

    private String productprocessingid;

    private org.museframework.bian.cusevehis.dto.bq.ProductProcessing productProcessing;

    public void setCustomereventhistoryid(String customereventhistoryid) {
        this.customereventhistoryid = customereventhistoryid;
    }

    public String getCustomereventhistoryid() {
        return customereventhistoryid;
    }

    public void setProductprocessingid(String productprocessingid) {
        this.productprocessingid = productprocessingid;
    }

    public String getProductprocessingid() {
        return productprocessingid;
    }

    public void setProductProcessing(org.museframework.bian.cusevehis.dto.bq.ProductProcessing productProcessing) {
        this.productProcessing = productProcessing;
    }

    public org.museframework.bian.cusevehis.dto.bq.ProductProcessing getProductProcessing() {
        return productProcessing;
    }
}