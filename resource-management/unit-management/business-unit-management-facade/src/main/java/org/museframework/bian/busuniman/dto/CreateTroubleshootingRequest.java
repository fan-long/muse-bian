package org.museframework.bian.busuniman.dto;

public class CreateTroubleshootingRequest {
    private String businessunitmanagementid;

    private String troubleshootingid;

    private org.museframework.bian.busuniman.dto.bq.Troubleshooting troubleshooting;

    public void setBusinessunitmanagementid(String businessunitmanagementid) {
        this.businessunitmanagementid = businessunitmanagementid;
    }

    public String getBusinessunitmanagementid() {
        return businessunitmanagementid;
    }

    public void setTroubleshootingid(String troubleshootingid) {
        this.troubleshootingid = troubleshootingid;
    }

    public String getTroubleshootingid() {
        return troubleshootingid;
    }

    public void setTroubleshooting(org.museframework.bian.busuniman.dto.bq.Troubleshooting troubleshooting) {
        this.troubleshooting = troubleshooting;
    }

    public org.museframework.bian.busuniman.dto.bq.Troubleshooting getTroubleshooting() {
        return troubleshooting;
    }
}