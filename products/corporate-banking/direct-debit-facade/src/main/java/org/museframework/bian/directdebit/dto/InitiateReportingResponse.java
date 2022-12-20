package org.museframework.bian.directdebit.dto;

public class InitiateReportingResponse {
    private org.museframework.bian.directdebit.dto.bq.Reporting reporting;

    public void setReporting(org.museframework.bian.directdebit.dto.bq.Reporting reporting) {
        this.reporting = reporting;
    }

    public org.museframework.bian.directdebit.dto.bq.Reporting getReporting() {
        return reporting;
    }
}