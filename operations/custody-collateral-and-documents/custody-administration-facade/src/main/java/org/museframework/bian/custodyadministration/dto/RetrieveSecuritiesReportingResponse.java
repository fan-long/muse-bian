package org.museframework.bian.custodyadministration.dto;

public class RetrieveSecuritiesReportingResponse {
    private org.museframework.bian.custodyadministration.dto.bq.SecuritiesReporting securitiesReporting;

    public void setSecuritiesReporting(org.museframework.bian.custodyadministration.dto.bq.SecuritiesReporting securitiesReporting) {
        this.securitiesReporting = securitiesReporting;
    }

    public org.museframework.bian.custodyadministration.dto.bq.SecuritiesReporting getSecuritiesReporting() {
        return securitiesReporting;
    }
}