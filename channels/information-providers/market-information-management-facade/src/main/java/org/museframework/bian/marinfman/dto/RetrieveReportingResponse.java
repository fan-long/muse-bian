package org.museframework.bian.marinfman.dto;

public class RetrieveReportingResponse {
    private org.museframework.bian.marinfman.dto.bq.Reporting reporting;

    public void setReporting(org.museframework.bian.marinfman.dto.bq.Reporting reporting) {
        this.reporting = reporting;
    }

    public org.museframework.bian.marinfman.dto.bq.Reporting getReporting() {
        return reporting;
    }
}