package org.museframework.bian.custodyadministration.dto;

public class InitiateSecuritiesReportingRequest {
    private String custodyadministrationid;

    private String securitiesreportingid;

    private org.museframework.bian.custodyadministration.dto.bq.SecuritiesReporting securitiesReporting;

    public void setCustodyadministrationid(String custodyadministrationid) {
        this.custodyadministrationid = custodyadministrationid;
    }

    public String getCustodyadministrationid() {
        return custodyadministrationid;
    }

    public void setSecuritiesreportingid(String securitiesreportingid) {
        this.securitiesreportingid = securitiesreportingid;
    }

    public String getSecuritiesreportingid() {
        return securitiesreportingid;
    }

    public void setSecuritiesReporting(org.museframework.bian.custodyadministration.dto.bq.SecuritiesReporting securitiesReporting) {
        this.securitiesReporting = securitiesReporting;
    }

    public org.museframework.bian.custodyadministration.dto.bq.SecuritiesReporting getSecuritiesReporting() {
        return securitiesReporting;
    }
}