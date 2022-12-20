package org.museframework.bian.cuscrerat.dto;

public class CaptureExternalReportingResponse {
    private org.museframework.bian.cuscrerat.dto.bq.ExternalReporting externalReporting;

    public void setExternalReporting(org.museframework.bian.cuscrerat.dto.bq.ExternalReporting externalReporting) {
        this.externalReporting = externalReporting;
    }

    public org.museframework.bian.cuscrerat.dto.bq.ExternalReporting getExternalReporting() {
        return externalReporting;
    }
}