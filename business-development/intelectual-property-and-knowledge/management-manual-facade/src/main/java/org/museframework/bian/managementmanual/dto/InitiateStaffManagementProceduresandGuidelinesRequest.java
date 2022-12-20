package org.museframework.bian.managementmanual.dto;

public class InitiateStaffManagementProceduresandGuidelinesRequest {
    private String managementmanualid;

    private String staffmanagementproceduresandguidelinesid;

    private org.museframework.bian.managementmanual.dto.bq.StaffManagementProceduresandGuidelines staffManagementProceduresandGuidelines;

    public void setManagementmanualid(String managementmanualid) {
        this.managementmanualid = managementmanualid;
    }

    public String getManagementmanualid() {
        return managementmanualid;
    }

    public void setStaffmanagementproceduresandguidelinesid(String staffmanagementproceduresandguidelinesid) {
        this.staffmanagementproceduresandguidelinesid = staffmanagementproceduresandguidelinesid;
    }

    public String getStaffmanagementproceduresandguidelinesid() {
        return staffmanagementproceduresandguidelinesid;
    }

    public void setStaffManagementProceduresandGuidelines(org.museframework.bian.managementmanual.dto.bq.StaffManagementProceduresandGuidelines staffManagementProceduresandGuidelines) {
        this.staffManagementProceduresandGuidelines = staffManagementProceduresandGuidelines;
    }

    public org.museframework.bian.managementmanual.dto.bq.StaffManagementProceduresandGuidelines getStaffManagementProceduresandGuidelines() {
        return staffManagementProceduresandGuidelines;
    }
}