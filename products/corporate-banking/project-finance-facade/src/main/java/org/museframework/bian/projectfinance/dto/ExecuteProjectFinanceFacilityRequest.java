package org.museframework.bian.projectfinance.dto;

public class ExecuteProjectFinanceFacilityRequest {
    private String projectfinanceid;

    private org.museframework.bian.projectfinance.dto.cr.ProjectFinanceFacility projectFinanceFacility;

    public void setProjectfinanceid(String projectfinanceid) {
        this.projectfinanceid = projectfinanceid;
    }

    public String getProjectfinanceid() {
        return projectfinanceid;
    }

    public void setProjectFinanceFacility(org.museframework.bian.projectfinance.dto.cr.ProjectFinanceFacility projectFinanceFacility) {
        this.projectFinanceFacility = projectFinanceFacility;
    }

    public org.museframework.bian.projectfinance.dto.cr.ProjectFinanceFacility getProjectFinanceFacility() {
        return projectFinanceFacility;
    }
}