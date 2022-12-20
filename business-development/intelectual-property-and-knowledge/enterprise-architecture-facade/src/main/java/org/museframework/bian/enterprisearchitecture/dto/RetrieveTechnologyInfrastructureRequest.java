package org.museframework.bian.enterprisearchitecture.dto;

public class RetrieveTechnologyInfrastructureRequest {
    private String enterprisearchitectureid;

    private String technologyinfrastructureid;

    public void setEnterprisearchitectureid(String enterprisearchitectureid) {
        this.enterprisearchitectureid = enterprisearchitectureid;
    }

    public String getEnterprisearchitectureid() {
        return enterprisearchitectureid;
    }

    public void setTechnologyinfrastructureid(String technologyinfrastructureid) {
        this.technologyinfrastructureid = technologyinfrastructureid;
    }

    public String getTechnologyinfrastructureid() {
        return technologyinfrastructureid;
    }
}