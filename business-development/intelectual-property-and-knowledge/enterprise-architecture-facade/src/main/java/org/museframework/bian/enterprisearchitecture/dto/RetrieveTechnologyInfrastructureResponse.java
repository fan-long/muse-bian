package org.museframework.bian.enterprisearchitecture.dto;

public class RetrieveTechnologyInfrastructureResponse {
    private org.museframework.bian.enterprisearchitecture.dto.bq.TechnologyInfrastructure technologyInfrastructure;

    public void setTechnologyInfrastructure(org.museframework.bian.enterprisearchitecture.dto.bq.TechnologyInfrastructure technologyInfrastructure) {
        this.technologyInfrastructure = technologyInfrastructure;
    }

    public org.museframework.bian.enterprisearchitecture.dto.bq.TechnologyInfrastructure getTechnologyInfrastructure() {
        return technologyInfrastructure;
    }
}