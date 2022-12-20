package org.museframework.bian.productdeployment.dto;

public class RequestSystemsRequest {
    private String productdeploymentid;

    private String systemsid;

    private org.museframework.bian.productdeployment.dto.bq.Systems systems;

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

    public void setSystems(org.museframework.bian.productdeployment.dto.bq.Systems systems) {
        this.systems = systems;
    }

    public org.museframework.bian.productdeployment.dto.bq.Systems getSystems() {
        return systems;
    }
}