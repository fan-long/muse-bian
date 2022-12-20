package org.museframework.bian.marinfman.dto;

public class CaptureReportingRequest {
    private String marketinformationmanagementid;

    private String reportingid;

    private org.museframework.bian.marinfman.dto.bq.Reporting reporting;

    public void setMarketinformationmanagementid(String marketinformationmanagementid) {
        this.marketinformationmanagementid = marketinformationmanagementid;
    }

    public String getMarketinformationmanagementid() {
        return marketinformationmanagementid;
    }

    public void setReportingid(String reportingid) {
        this.reportingid = reportingid;
    }

    public String getReportingid() {
        return reportingid;
    }

    public void setReporting(org.museframework.bian.marinfman.dto.bq.Reporting reporting) {
        this.reporting = reporting;
    }

    public org.museframework.bian.marinfman.dto.bq.Reporting getReporting() {
        return reporting;
    }
}