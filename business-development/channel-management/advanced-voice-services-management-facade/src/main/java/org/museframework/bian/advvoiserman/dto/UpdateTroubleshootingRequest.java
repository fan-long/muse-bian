package org.museframework.bian.advvoiserman.dto;

public class UpdateTroubleshootingRequest {
    private String advancedvoiceservicesmanagementid;

    private String troubleshootingid;

    private org.museframework.bian.advvoiserman.dto.bq.Troubleshooting troubleshooting;

    public void setAdvancedvoiceservicesmanagementid(String advancedvoiceservicesmanagementid) {
        this.advancedvoiceservicesmanagementid = advancedvoiceservicesmanagementid;
    }

    public String getAdvancedvoiceservicesmanagementid() {
        return advancedvoiceservicesmanagementid;
    }

    public void setTroubleshootingid(String troubleshootingid) {
        this.troubleshootingid = troubleshootingid;
    }

    public String getTroubleshootingid() {
        return troubleshootingid;
    }

    public void setTroubleshooting(org.museframework.bian.advvoiserman.dto.bq.Troubleshooting troubleshooting) {
        this.troubleshooting = troubleshooting;
    }

    public org.museframework.bian.advvoiserman.dto.bq.Troubleshooting getTroubleshooting() {
        return troubleshooting;
    }
}