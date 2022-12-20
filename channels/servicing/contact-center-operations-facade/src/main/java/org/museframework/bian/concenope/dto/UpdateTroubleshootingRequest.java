package org.museframework.bian.concenope.dto;

public class UpdateTroubleshootingRequest {
    private String contactcenteroperationsid;

    private String troubleshootingid;

    private org.museframework.bian.concenope.dto.bq.Troubleshooting troubleshooting;

    public void setContactcenteroperationsid(String contactcenteroperationsid) {
        this.contactcenteroperationsid = contactcenteroperationsid;
    }

    public String getContactcenteroperationsid() {
        return contactcenteroperationsid;
    }

    public void setTroubleshootingid(String troubleshootingid) {
        this.troubleshootingid = troubleshootingid;
    }

    public String getTroubleshootingid() {
        return troubleshootingid;
    }

    public void setTroubleshooting(org.museframework.bian.concenope.dto.bq.Troubleshooting troubleshooting) {
        this.troubleshooting = troubleshooting;
    }

    public org.museframework.bian.concenope.dto.bq.Troubleshooting getTroubleshooting() {
        return troubleshooting;
    }
}