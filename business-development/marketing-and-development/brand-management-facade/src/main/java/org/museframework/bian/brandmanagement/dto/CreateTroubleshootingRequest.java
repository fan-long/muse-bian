package org.museframework.bian.brandmanagement.dto;

public class CreateTroubleshootingRequest {
    private String brandmanagementid;

    private String troubleshootingid;

    private org.museframework.bian.brandmanagement.dto.bq.Troubleshooting troubleshooting;

    public void setBrandmanagementid(String brandmanagementid) {
        this.brandmanagementid = brandmanagementid;
    }

    public String getBrandmanagementid() {
        return brandmanagementid;
    }

    public void setTroubleshootingid(String troubleshootingid) {
        this.troubleshootingid = troubleshootingid;
    }

    public String getTroubleshootingid() {
        return troubleshootingid;
    }

    public void setTroubleshooting(org.museframework.bian.brandmanagement.dto.bq.Troubleshooting troubleshooting) {
        this.troubleshooting = troubleshooting;
    }

    public org.museframework.bian.brandmanagement.dto.bq.Troubleshooting getTroubleshooting() {
        return troubleshooting;
    }
}