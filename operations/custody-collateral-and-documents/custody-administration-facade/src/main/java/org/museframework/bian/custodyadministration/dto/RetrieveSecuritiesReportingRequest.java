package org.museframework.bian.custodyadministration.dto;

public class RetrieveSecuritiesReportingRequest {
    private String custodyadministrationid;

    private String securitiesreportingid;

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
}