package org.museframework.bian.enterprisearchitecture.dto;

public class RequestApplicationArchitectureRequest {
    private String enterprisearchitectureid;

    private String applicationarchitectureid;

    private org.museframework.bian.enterprisearchitecture.dto.bq.ApplicationArchitecture applicationArchitecture;

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

    public void setApplicationArchitecture(org.museframework.bian.enterprisearchitecture.dto.bq.ApplicationArchitecture applicationArchitecture) {
        this.applicationArchitecture = applicationArchitecture;
    }

    public org.museframework.bian.enterprisearchitecture.dto.bq.ApplicationArchitecture getApplicationArchitecture() {
        return applicationArchitecture;
    }
}