package org.museframework.bian.compliancereporting.dto;

public class RetrieveComplianceAssessmentRequest {
    private String compliancereportingid;

    private String complianceassessmentid;

    public void setCompliancereportingid(String compliancereportingid) {
        this.compliancereportingid = compliancereportingid;
    }

    public String getCompliancereportingid() {
        return compliancereportingid;
    }

    public void setComplianceassessmentid(String complianceassessmentid) {
        this.complianceassessmentid = complianceassessmentid;
    }

    public String getComplianceassessmentid() {
        return complianceassessmentid;
    }
}