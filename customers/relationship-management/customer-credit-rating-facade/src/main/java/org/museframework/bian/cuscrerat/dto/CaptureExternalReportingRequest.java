package org.museframework.bian.cuscrerat.dto;

public class CaptureExternalReportingRequest {
    private String customercreditratingid;

    private String externalreportingid;

    private org.museframework.bian.cuscrerat.dto.bq.ExternalReporting externalReporting;

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

    public void setExternalReporting(org.museframework.bian.cuscrerat.dto.bq.ExternalReporting externalReporting) {
        this.externalReporting = externalReporting;
    }

    public org.museframework.bian.cuscrerat.dto.bq.ExternalReporting getExternalReporting() {
        return externalReporting;
    }
}