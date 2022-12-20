package org.museframework.bian.directdebit.dto;

public class InitiateReportingRequest {
    private String directdebitid;

    private String reportingid;

    private org.museframework.bian.directdebit.dto.bq.Reporting reporting;

    public void setDirectdebitid(String directdebitid) {
        this.directdebitid = directdebitid;
    }

    public String getDirectdebitid() {
        return directdebitid;
    }

    public void setReportingid(String reportingid) {
        this.reportingid = reportingid;
    }

    public String getReportingid() {
        return reportingid;
    }

    public void setReporting(org.museframework.bian.directdebit.dto.bq.Reporting reporting) {
        this.reporting = reporting;
    }

    public org.museframework.bian.directdebit.dto.bq.Reporting getReporting() {
        return reporting;
    }
}