package org.museframework.bian.ebranchmanagement.dto;

public class RequestTroubleshootingRequest {
    private String ebranchmanagementid;

    private String troubleshootingid;

    private org.museframework.bian.ebranchmanagement.dto.bq.Troubleshooting troubleshooting;

    public void setEbranchmanagementid(String ebranchmanagementid) {
        this.ebranchmanagementid = ebranchmanagementid;
    }

    public String getEbranchmanagementid() {
        return ebranchmanagementid;
    }

    public void setTroubleshootingid(String troubleshootingid) {
        this.troubleshootingid = troubleshootingid;
    }

    public String getTroubleshootingid() {
        return troubleshootingid;
    }

    public void setTroubleshooting(org.museframework.bian.ebranchmanagement.dto.bq.Troubleshooting troubleshooting) {
        this.troubleshooting = troubleshooting;
    }

    public org.museframework.bian.ebranchmanagement.dto.bq.Troubleshooting getTroubleshooting() {
        return troubleshooting;
    }
}