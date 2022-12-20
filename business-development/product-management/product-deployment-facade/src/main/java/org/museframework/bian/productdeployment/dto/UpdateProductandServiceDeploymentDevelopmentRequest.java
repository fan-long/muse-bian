package org.museframework.bian.productdeployment.dto;

public class UpdateProductandServiceDeploymentDevelopmentRequest {
    private String productdeploymentid;

    private org.museframework.bian.productdeployment.dto.cr.ProductandServiceDeploymentDevelopment productandServiceDeploymentDevelopment;

    public void setProductdeploymentid(String productdeploymentid) {
        this.productdeploymentid = productdeploymentid;
    }

    public String getProductdeploymentid() {
        return productdeploymentid;
    }

    public void setProductandServiceDeploymentDevelopment(org.museframework.bian.productdeployment.dto.cr.ProductandServiceDeploymentDevelopment productandServiceDeploymentDevelopment) {
        this.productandServiceDeploymentDevelopment = productandServiceDeploymentDevelopment;
    }

    public org.museframework.bian.productdeployment.dto.cr.ProductandServiceDeploymentDevelopment getProductandServiceDeploymentDevelopment() {
        return productandServiceDeploymentDevelopment;
    }
}