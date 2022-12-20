package org.museframework.bian.regulatorycompliance.dto;

public class RequestRegulatoryComplianceAssessmentRequest {
    private String regulatorycomplianceid;

    private org.museframework.bian.regulatorycompliance.dto.cr.RegulatoryComplianceAssessment regulatoryComplianceAssessment;

    public void setRegulatorycomplianceid(String regulatorycomplianceid) {
        this.regulatorycomplianceid = regulatorycomplianceid;
    }

    public String getRegulatorycomplianceid() {
        return regulatorycomplianceid;
    }

    public void setRegulatoryComplianceAssessment(org.museframework.bian.regulatorycompliance.dto.cr.RegulatoryComplianceAssessment regulatoryComplianceAssessment) {
        this.regulatoryComplianceAssessment = regulatoryComplianceAssessment;
    }

    public org.museframework.bian.regulatorycompliance.dto.cr.RegulatoryComplianceAssessment getRegulatoryComplianceAssessment() {
        return regulatoryComplianceAssessment;
    }
}