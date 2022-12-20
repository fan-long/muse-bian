package org.museframework.bian.cuscrerat.dto;

public class RetrieveExternalReportingRequest {
    private String customercreditratingid;

    private String externalreportingid;

    public void setCustomercreditratingid(String customercreditratingid) {
        this.customercreditratingid = customercreditratingid;
    }

    public String getCustomercreditratingid() {
        return customercreditratingid;
    }

    public void setExternalreportingid(String externalreportingid) {
        this.externalreportingid = externalreportingid;
    }

    public String getExternalreportingid() {
        return externalreportingid;
    }
}