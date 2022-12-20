package org.museframework.bian.custaxhan.dto;

public class RetrieveReportingRequest {
    private String customertaxhandlingid;

    private String reportingid;

    public void setCustomertaxhandlingid(String customertaxhandlingid) {
        this.customertaxhandlingid = customertaxhandlingid;
    }

    public String getCustomertaxhandlingid() {
        return customertaxhandlingid;
    }

    public void setReportingid(String reportingid) {
        this.reportingid = reportingid;
    }

    public String getReportingid() {
        return reportingid;
    }
}