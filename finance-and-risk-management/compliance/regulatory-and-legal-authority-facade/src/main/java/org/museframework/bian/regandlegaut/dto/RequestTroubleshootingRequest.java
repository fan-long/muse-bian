package org.museframework.bian.regandlegaut.dto;

public class RequestTroubleshootingRequest {
    private String regulatoryandlegalauthorityid;

    private String troubleshootingid;

    private org.museframework.bian.regandlegaut.dto.bq.Troubleshooting troubleshooting;

    public void setRegulatoryandlegalauthorityid(String regulatoryandlegalauthorityid) {
        this.regulatoryandlegalauthorityid = regulatoryandlegalauthorityid;
    }

    public String getRegulatoryandlegalauthorityid() {
        return regulatoryandlegalauthorityid;
    }

    public void setTroubleshootingid(String troubleshootingid) {
        this.troubleshootingid = troubleshootingid;
    }

    public String getTroubleshootingid() {
        return troubleshootingid;
    }

    public void setTroubleshooting(org.museframework.bian.regandlegaut.dto.bq.Troubleshooting troubleshooting) {
        this.troubleshooting = troubleshooting;
    }

    public org.museframework.bian.regandlegaut.dto.bq.Troubleshooting getTroubleshooting() {
        return troubleshooting;
    }
}