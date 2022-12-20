package org.museframework.bian.productdeployment.dto;

public class RetrieveSystemsRequest {
    private String productdeploymentid;

    private String systemsid;

    public void setProductdeploymentid(String productdeploymentid) {
        this.productdeploymentid = productdeploymentid;
    }

    public String getProductdeploymentid() {
        return productdeploymentid;
    }

    public void setSystemsid(String systemsid) {
        this.systemsid = systemsid;
    }

    public String getSystemsid() {
        return systemsid;
    }
}