package org.museframework.bian.productdirectory.dto;

public class UpdateProductionRequest {
    private String productdirectoryid;

    private String productionid;

    private org.museframework.bian.productdirectory.dto.bq.Production production;

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

    public void setProduction(org.museframework.bian.productdirectory.dto.bq.Production production) {
        this.production = production;
    }

    public org.museframework.bian.productdirectory.dto.bq.Production getProduction() {
        return production;
    }
}