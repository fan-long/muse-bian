package org.museframework.bian.productdeployment.dto;

public class RequestProductionSupportRequest {
    private String productdeploymentid;

    private String productionsupportid;

    private org.museframework.bian.productdeployment.dto.bq.ProductionSupport productionSupport;

    public void setProductdeploymentid(String productdeploymentid) {
        this.productdeploymentid = productdeploymentid;
    }

    public String getProductdeploymentid() {
        return productdeploymentid;
    }

    public void setProductionsupportid(String productionsupportid) {
        this.productionsupportid = productionsupportid;
    }

    public String getProductionsupportid() {
        return productionsupportid;
    }

    public void setProductionSupport(org.museframework.bian.productdeployment.dto.bq.ProductionSupport productionSupport) {
        this.productionSupport = productionSupport;
    }

    public org.museframework.bian.productdeployment.dto.bq.ProductionSupport getProductionSupport() {
        return productionSupport;
    }
}