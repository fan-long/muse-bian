package org.museframework.bian.loan.dto;

public class RetrieveMaintenanceRequest {
    private String loanid;

    private String maintenanceid;

    public void setLoanid(String loanid) {
        this.loanid = loanid;
    }

    public String getLoanid() {
        return loanid;
    }

    public void setMaintenanceid(String maintenanceid) {
        this.maintenanceid = maintenanceid;
    }

    public String getMaintenanceid() {
        return maintenanceid;
    }
}