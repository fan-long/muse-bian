package org.museframework.bian.directdebit.dto;

public class RetrieveReportingRequest {
    private String directdebitid;

    private String reportingid;

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
}