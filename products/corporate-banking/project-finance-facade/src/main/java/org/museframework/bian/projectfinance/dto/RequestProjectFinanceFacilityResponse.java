package org.museframework.bian.projectfinance.dto;

public class RequestProjectFinanceFacilityResponse {
    private org.museframework.bian.projectfinance.dto.cr.ProjectFinanceFacility projectFinanceFacility;

    public void setProjectFinanceFacility(org.museframework.bian.projectfinance.dto.cr.ProjectFinanceFacility projectFinanceFacility) {
        this.projectFinanceFacility = projectFinanceFacility;
    }

    public org.museframework.bian.projectfinance.dto.cr.ProjectFinanceFacility getProjectFinanceFacility() {
        return projectFinanceFacility;
    }
}