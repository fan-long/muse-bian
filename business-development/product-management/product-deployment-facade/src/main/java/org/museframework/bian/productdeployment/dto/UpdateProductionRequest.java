package org.museframework.bian.productdeployment.dto;

public class UpdateProductionRequest {
    private String productdeploymentid;

    private String productionid;

    private org.museframework.bian.productdeployment.dto.bq.Production production;

    public void setProductdeploymentid(String productdeploymentid) {
        this.productdeploymentid = productdeploymentid;
    }

    public String getProductdeploymentid() {
        return productdeploymentid;
    }

    public void setProductionid(String productionid) {
        this.productionid = productionid;
    }

    public String getProductionid() {
        return productionid;
    }

    public void setProduction(org.museframework.bian.productdeployment.dto.bq.Production production) {
        this.production = production;
    }

    public org.museframework.bian.productdeployment.dto.bq.Production getProduction() {
        return production;
    }
}