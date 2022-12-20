package org.museframework.bian.issdevtra.dto;

public class RetrieveExternalReportRequest {
    private String issueddevicetrackingid;

    private String externalreportid;

    public void setIssueddevicetrackingid(String issueddevicetrackingid) {
        this.issueddevicetrackingid = issueddevicetrackingid;
    }

    public String getIssueddevicetrackingid() {
        return issueddevicetrackingid;
    }

    public void setExternalreportid(String externalreportid) {
        this.externalreportid = externalreportid;
    }

    public String getExternalreportid() {
        return externalreportid;
    }
}