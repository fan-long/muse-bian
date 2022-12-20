package org.museframework.bian.enterprisearchitecture.dto;

public class RetrieveApplicationArchitectureRequest {
    private String enterprisearchitectureid;

    private String applicationarchitectureid;

    public void setEnterprisearchitectureid(String enterprisearchitectureid) {
        this.enterprisearchitectureid = enterprisearchitectureid;
    }

    public String getEnterprisearchitectureid() {
        return enterprisearchitectureid;
    }

    public void setApplicationarchitectureid(String applicationarchitectureid) {
        this.applicationarchitectureid = applicationarchitectureid;
    }

    public String getApplicationarchitectureid() {
        return applicationarchitectureid;
    }
}