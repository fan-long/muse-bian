package org.museframework.bian.enterprisearchitecture.dto;

public class RetrieveBusinessArchitectureRequest {
    private String enterprisearchitectureid;

    private String businessarchitectureid;

    public void setEnterprisearchitectureid(String enterprisearchitectureid) {
        this.enterprisearchitectureid = enterprisearchitectureid;
    }

    public String getEnterprisearchitectureid() {
        return enterprisearchitectureid;
    }

    public void setBusinessarchitectureid(String businessarchitectureid) {
        this.businessarchitectureid = businessarchitectureid;
    }

    public String getBusinessarchitectureid() {
        return businessarchitectureid;
    }
}