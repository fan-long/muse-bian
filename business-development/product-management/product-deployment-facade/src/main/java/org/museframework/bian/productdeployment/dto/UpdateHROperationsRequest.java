package org.museframework.bian.productdeployment.dto;

public class UpdateHROperationsRequest {
    private String productdeploymentid;

    private String hroperationsid;

    private org.museframework.bian.productdeployment.dto.bq.HROperations hROperations;

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

    public void sethROperations(org.museframework.bian.productdeployment.dto.bq.HROperations hROperations) {
        this.hROperations = hROperations;
    }

    public org.museframework.bian.productdeployment.dto.bq.HROperations gethROperations() {
        return hROperations;
    }
}