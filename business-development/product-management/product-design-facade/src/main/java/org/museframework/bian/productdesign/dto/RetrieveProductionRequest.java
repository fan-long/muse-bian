package org.museframework.bian.productdesign.dto;

public class RetrieveProductionRequest {
    private String productdesignid;

    private String productionid;

    public void setProductdesignid(String productdesignid) {
        this.productdesignid = productdesignid;
    }

    public String getProductdesignid() {
        return productdesignid;
    }

    public void setProductionid(String productionid) {
        this.productionid = productionid;
    }

    public String getProductionid() {
        return productionid;
    }
}