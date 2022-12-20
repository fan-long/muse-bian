package org.museframework.bian.loan.dto;

public class RequestMaintenanceRequest {
    private String loanid;

    private String maintenanceid;

    private org.museframework.bian.loan.dto.bq.Maintenance maintenance;

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

    public void setMaintenance(org.museframework.bian.loan.dto.bq.Maintenance maintenance) {
        this.maintenance = maintenance;
    }

    public org.museframework.bian.loan.dto.bq.Maintenance getMaintenance() {
        return maintenance;
    }
}