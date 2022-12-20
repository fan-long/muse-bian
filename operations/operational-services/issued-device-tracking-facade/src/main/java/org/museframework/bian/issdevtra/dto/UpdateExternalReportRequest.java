package org.museframework.bian.issdevtra.dto;

public class UpdateExternalReportRequest {
    private String issueddevicetrackingid;

    private String externalreportid;

    private org.museframework.bian.issdevtra.dto.bq.ExternalReport externalReport;

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

    public void setExternalReport(org.museframework.bian.issdevtra.dto.bq.ExternalReport externalReport) {
        this.externalReport = externalReport;
    }

    public org.museframework.bian.issdevtra.dto.bq.ExternalReport getExternalReport() {
        return externalReport;
    }
}