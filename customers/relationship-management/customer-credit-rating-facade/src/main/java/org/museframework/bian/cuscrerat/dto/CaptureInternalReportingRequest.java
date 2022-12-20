package org.museframework.bian.cuscrerat.dto;

public class CaptureInternalReportingRequest {
    private String customercreditratingid;

    private String internalreportingid;

    private org.museframework.bian.cuscrerat.dto.bq.InternalReporting internalReporting;

    public void setCustomercreditratingid(String customercreditratingid) {
        this.customercreditratingid = customercreditratingid;
    }

    public String getCustomercreditratingid() {
        return customercreditratingid;
    }

    public void setInternalreportingid(String internalreportingid) {
        this.internalreportingid = internalreportingid;
    }

    public String getInternalreportingid() {
        return internalreportingid;
    }

    public void setInternalReporting(org.museframework.bian.cuscrerat.dto.bq.InternalReporting internalReporting) {
        this.internalReporting = internalReporting;
    }

    public org.museframework.bian.cuscrerat.dto.bq.InternalReporting getInternalReporting() {
        return internalReporting;
    }
}