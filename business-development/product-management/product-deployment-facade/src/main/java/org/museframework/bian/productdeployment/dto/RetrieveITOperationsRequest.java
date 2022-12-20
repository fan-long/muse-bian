package org.museframework.bian.productdeployment.dto;

public class RetrieveITOperationsRequest {
    private String productdeploymentid;

    private String itoperationsid;

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
}