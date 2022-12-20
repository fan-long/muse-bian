package org.museframework.bian.enterprisearchitecture.dto;

public class UpdateTechnologyInfrastructureRequest {
    private String enterprisearchitectureid;

    private String technologyinfrastructureid;

    private org.museframework.bian.enterprisearchitecture.dto.bq.TechnologyInfrastructure technologyInfrastructure;

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

    public void setTechnologyInfrastructure(org.museframework.bian.enterprisearchitecture.dto.bq.TechnologyInfrastructure technologyInfrastructure) {
        this.technologyInfrastructure = technologyInfrastructure;
    }

    public org.museframework.bian.enterprisearchitecture.dto.bq.TechnologyInfrastructure getTechnologyInfrastructure() {
        return technologyInfrastructure;
    }
}