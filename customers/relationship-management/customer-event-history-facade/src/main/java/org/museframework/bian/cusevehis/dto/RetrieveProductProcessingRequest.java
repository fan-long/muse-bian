package org.museframework.bian.cusevehis.dto;

public class RetrieveProductProcessingRequest {
    private String customereventhistoryid;

    private String productprocessingid;

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
}