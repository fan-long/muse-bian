package org.museframework.bian.custaxhan.dto;

public class UpdateReportingRequest {
    private String customertaxhandlingid;

    private String reportingid;

    private org.museframework.bian.custaxhan.dto.bq.Reporting reporting;

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

    public void setReporting(org.museframework.bian.custaxhan.dto.bq.Reporting reporting) {
        this.reporting = reporting;
    }

    public org.museframework.bian.custaxhan.dto.bq.Reporting getReporting() {
        return reporting;
    }
}