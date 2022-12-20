package org.museframework.bian.productdirectory.dto;

public class RetrieveProductionRequest {
    private String productdirectoryid;

    private String productionid;

    public void setProductdirectoryid(String productdirectoryid) {
        this.productdirectoryid = productdirectoryid;
    }

    public String getProductdirectoryid() {
        return productdirectoryid;
    }

    public void setProductionid(String productionid) {
        this.productionid = productionid;
    }

    public String getProductionid() {
        return productionid;
    }
}