package org.museframework.bian.managementmanual.dto;

public class RetrieveStaffManagementProceduresandGuidelinesRequest {
    private String managementmanualid;

    private String staffmanagementproceduresandguidelinesid;

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
}