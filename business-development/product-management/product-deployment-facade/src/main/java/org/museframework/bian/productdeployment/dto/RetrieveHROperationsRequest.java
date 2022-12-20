package org.museframework.bian.productdeployment.dto;

public class RetrieveHROperationsRequest {
    private String productdeploymentid;

    private String hroperationsid;

    public void setProductdeploymentid(String productdeploymentid) {
        this.productdeploymentid = productdeploymentid;
    }

    public String getProductdeploymentid() {
        return productdeploymentid;
    }

    public void setHroperationsid(String hroperationsid) {
        this.hroperationsid = hroperationsid;
    }

    public String getHroperationsid() {
        return hroperationsid;
    }
}