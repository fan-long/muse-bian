package org.museframework.bian.productdeployment.dto;

public class RequestServicingRequest {
    private String productdeploymentid;

    private String servicingid;

    private org.museframework.bian.productdeployment.dto.bq.Servicing servicing;

    public void setProductdeploymentid(String productdeploymentid) {
        this.productdeploymentid = productdeploymentid;
    }

    public String getProductdeploymentid() {
        return productdeploymentid;
    }

    public void setServicingid(String servicingid) {
        this.servicingid = servicingid;
    }

    public String getServicingid() {
        return servicingid;
    }

    public void setServicing(org.museframework.bian.productdeployment.dto.bq.Servicing servicing) {
        this.servicing = servicing;
    }

    public org.museframework.bian.productdeployment.dto.bq.Servicing getServicing() {
        return servicing;
    }
}