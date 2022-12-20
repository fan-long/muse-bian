package org.museframework.bian.issdevtra.dto;

public class UpdateExternalReportResponse {
    private org.museframework.bian.issdevtra.dto.bq.ExternalReport externalReport;

    public void setExternalReport(org.museframework.bian.issdevtra.dto.bq.ExternalReport externalReport) {
        this.externalReport = externalReport;
    }

    public org.museframework.bian.issdevtra.dto.bq.ExternalReport getExternalReport() {
        return externalReport;
    }
}