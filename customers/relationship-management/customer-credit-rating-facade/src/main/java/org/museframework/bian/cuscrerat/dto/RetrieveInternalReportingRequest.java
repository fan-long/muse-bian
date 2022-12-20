package org.museframework.bian.cuscrerat.dto;

public class RetrieveInternalReportingRequest {
    private String customercreditratingid;

    private String internalreportingid;

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
}