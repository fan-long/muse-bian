package org.museframework.bian.compliancereporting.dto;

public class CaptureComplianceReportingAdministrativePlanRequest {
    private String compliancereportingid;

    private org.museframework.bian.compliancereporting.dto.cr.ComplianceReportingAdministrativePlan complianceReportingAdministrativePlan;

    public void setCompliancereportingid(String compliancereportingid) {
        this.compliancereportingid = compliancereportingid;
    }

    public String getCompliancereportingid() {
        return compliancereportingid;
    }

    public void setComplianceReportingAdministrativePlan(org.museframework.bian.compliancereporting.dto.cr.ComplianceReportingAdministrativePlan complianceReportingAdministrativePlan) {
        this.complianceReportingAdministrativePlan = complianceReportingAdministrativePlan;
    }

    public org.museframework.bian.compliancereporting.dto.cr.ComplianceReportingAdministrativePlan getComplianceReportingAdministrativePlan() {
        return complianceReportingAdministrativePlan;
    }
}