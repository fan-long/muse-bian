package org.museframework.bian.productdesign.dto;

public class ExecuteProductionRequest {
    private String productdesignid;

    private String productionid;

    private org.museframework.bian.productdesign.dto.bq.Production production;

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

    public void setProduction(org.museframework.bian.productdesign.dto.bq.Production production) {
        this.production = production;
    }

    public org.museframework.bian.productdesign.dto.bq.Production getProduction() {
        return production;
    }
}