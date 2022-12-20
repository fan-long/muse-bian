package org.museframework.bian.bralocman.dto;

public class InitiateTroubleshootingRequest {
    private String branchlocationmanagementid;

    private String troubleshootingid;

    private org.museframework.bian.bralocman.dto.bq.Troubleshooting troubleshooting;

    public void setBranchlocationmanagementid(String branchlocationmanagementid) {
        this.branchlocationmanagementid = branchlocationmanagementid;
    }

    public String getBranchlocationmanagementid() {
        return branchlocationmanagementid;
    }

    public void setTroubleshootingid(String troubleshootingid) {
        this.troubleshootingid = troubleshootingid;
    }

    public String getTroubleshootingid() {
        return troubleshootingid;
    }

    public void setTroubleshooting(org.museframework.bian.bralocman.dto.bq.Troubleshooting troubleshooting) {
        this.troubleshooting = troubleshooting;
    }

    public org.museframework.bian.bralocman.dto.bq.Troubleshooting getTroubleshooting() {
        return troubleshooting;
    }
}