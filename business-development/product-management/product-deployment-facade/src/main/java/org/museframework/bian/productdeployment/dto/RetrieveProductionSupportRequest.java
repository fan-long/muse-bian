package org.museframework.bian.productdeployment.dto;

public class RetrieveProductionSupportRequest {
    private String productdeploymentid;

    private String productionsupportid;

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
}