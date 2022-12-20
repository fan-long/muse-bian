package org.museframework.bian.concenman.dto;

public class CreateTroubleshootingRequest {
    private String contactcentermanagementid;

    private String troubleshootingid;

    private org.museframework.bian.concenman.dto.bq.Troubleshooting troubleshooting;

    public void setContactcentermanagementid(String contactcentermanagementid) {
        this.contactcentermanagementid = contactcentermanagementid;
    }

    public String getContactcentermanagementid() {
        return contactcentermanagementid;
    }

    public void setTroubleshootingid(String troubleshootingid) {
        this.troubleshootingid = troubleshootingid;
    }

    public String getTroubleshootingid() {
        return troubleshootingid;
    }

    public void setTroubleshooting(org.museframework.bian.concenman.dto.bq.Troubleshooting troubleshooting) {
        this.troubleshooting = troubleshooting;
    }

    public org.museframework.bian.concenman.dto.bq.Troubleshooting getTroubleshooting() {
        return troubleshooting;
    }
}