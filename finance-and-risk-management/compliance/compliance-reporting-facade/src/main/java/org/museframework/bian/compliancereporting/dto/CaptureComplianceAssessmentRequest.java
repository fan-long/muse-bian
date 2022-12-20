package org.museframework.bian.compliancereporting.dto;

public class CaptureComplianceAssessmentRequest {
    private String compliancereportingid;

    private String complianceassessmentid;

    private org.museframework.bian.compliancereporting.dto.bq.ComplianceAssessment complianceAssessment;

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

    public void setComplianceAssessment(org.museframework.bian.compliancereporting.dto.bq.ComplianceAssessment complianceAssessment) {
        this.complianceAssessment = complianceAssessment;
    }

    public org.museframework.bian.compliancereporting.dto.bq.ComplianceAssessment getComplianceAssessment() {
        return complianceAssessment;
    }
}