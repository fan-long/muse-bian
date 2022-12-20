package org.museframework.bian.ebranchmanagement.dto;

public class RetrieveTroubleshootingRequest {
    private String ebranchmanagementid;

    private String troubleshootingid;

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
}