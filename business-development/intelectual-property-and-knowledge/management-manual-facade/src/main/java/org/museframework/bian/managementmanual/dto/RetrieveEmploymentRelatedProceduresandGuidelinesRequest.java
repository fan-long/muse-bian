package org.museframework.bian.managementmanual.dto;

public class RetrieveEmploymentRelatedProceduresandGuidelinesRequest {
    private String managementmanualid;

    private String employmentrelatedproceduresandguidelinesid;

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
}