package org.museframework.bian.managementmanual.dto;

public class UpdateEmploymentRelatedProceduresandGuidelinesRequest {
    private String managementmanualid;

    private String employmentrelatedproceduresandguidelinesid;

    private org.museframework.bian.managementmanual.dto.bq.EmploymentRelatedProceduresandGuidelines employmentRelatedProceduresandGuidelines;

    public void setManagementmanualid(String managementmanualid) {
        this.managementmanualid = managementmanualid;
    }

    public String getManagementmanualid() {
        return managementmanualid;
    }

    public void setEmploymentrelatedproceduresandguidelinesid(String employmentrelatedproceduresandguidelinesid) {
        this.employmentrelatedproceduresandguidelinesid = employmentrelatedproceduresandguidelinesid;
    }

    public String getEmploymentrelatedproceduresandguidelinesid() {
        return employmentrelatedproceduresandguidelinesid;
    }

    public void setEmploymentRelatedProceduresandGuidelines(org.museframework.bian.managementmanual.dto.bq.EmploymentRelatedProceduresandGuidelines employmentRelatedProceduresandGuidelines) {
        this.employmentRelatedProceduresandGuidelines = employmentRelatedProceduresandGuidelines;
    }

    public org.museframework.bian.managementmanual.dto.bq.EmploymentRelatedProceduresandGuidelines getEmploymentRelatedProceduresandGuidelines() {
        return employmentRelatedProceduresandGuidelines;
    }
}