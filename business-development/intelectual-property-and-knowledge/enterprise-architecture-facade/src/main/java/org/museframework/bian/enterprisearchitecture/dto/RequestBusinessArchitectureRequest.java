package org.museframework.bian.enterprisearchitecture.dto;

public class RequestBusinessArchitectureRequest {
    private String enterprisearchitectureid;

    private String businessarchitectureid;

    private org.museframework.bian.enterprisearchitecture.dto.bq.BusinessArchitecture businessArchitecture;

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

    public void setBusinessArchitecture(org.museframework.bian.enterprisearchitecture.dto.bq.BusinessArchitecture businessArchitecture) {
        this.businessArchitecture = businessArchitecture;
    }

    public org.museframework.bian.enterprisearchitecture.dto.bq.BusinessArchitecture getBusinessArchitecture() {
        return businessArchitecture;
    }
}