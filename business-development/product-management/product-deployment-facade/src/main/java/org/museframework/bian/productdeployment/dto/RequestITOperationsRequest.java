package org.museframework.bian.productdeployment.dto;

public class RequestITOperationsRequest {
    private String productdeploymentid;

    private String itoperationsid;

    private org.museframework.bian.productdeployment.dto.bq.ITOperations iTOperations;

    public void setProductdeploymentid(String productdeploymentid) {
        this.productdeploymentid = productdeploymentid;
    }

    public String getProductdeploymentid() {
        return productdeploymentid;
    }

    public void setItoperationsid(String itoperationsid) {
        this.itoperationsid = itoperationsid;
    }

    public String getItoperationsid() {
        return itoperationsid;
    }

    public void setiTOperations(org.museframework.bian.productdeployment.dto.bq.ITOperations iTOperations) {
        this.iTOperations = iTOperations;
    }

    public org.museframework.bian.productdeployment.dto.bq.ITOperations getiTOperations() {
        return iTOperations;
    }
}