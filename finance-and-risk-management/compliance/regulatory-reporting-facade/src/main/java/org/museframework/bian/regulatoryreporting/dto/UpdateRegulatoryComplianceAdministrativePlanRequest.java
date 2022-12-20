package org.museframework.bian.regulatoryreporting.dto;

public class UpdateRegulatoryComplianceAdministrativePlanRequest {
    private String regulatoryreportingid;

    private org.museframework.bian.regulatoryreporting.dto.cr.RegulatoryComplianceAdministrativePlan regulatoryComplianceAdministrativePlan;

    public void setRegulatoryreportingid(String regulatoryreportingid) {
        this.regulatoryreportingid = regulatoryreportingid;
    }

    public String getRegulatoryreportingid() {
        return regulatoryreportingid;
    }

    public void setRegulatoryComplianceAdministrativePlan(org.museframework.bian.regulatoryreporting.dto.cr.RegulatoryComplianceAdministrativePlan regulatoryComplianceAdministrativePlan) {
        this.regulatoryComplianceAdministrativePlan = regulatoryComplianceAdministrativePlan;
    }

    public org.museframework.bian.regulatoryreporting.dto.cr.RegulatoryComplianceAdministrativePlan getRegulatoryComplianceAdministrativePlan() {
        return regulatoryComplianceAdministrativePlan;
    }
}