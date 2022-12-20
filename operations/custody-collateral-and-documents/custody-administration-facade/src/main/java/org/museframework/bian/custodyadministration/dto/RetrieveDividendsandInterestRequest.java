package org.museframework.bian.custodyadministration.dto;

public class RetrieveDividendsandInterestRequest {
    private String custodyadministrationid;

    private String dividendsandinterestid;

    public void setCustodyadministrationid(String custodyadministrationid) {
        this.custodyadministrationid = custodyadministrationid;
    }

    public String getCustodyadministrationid() {
        return custodyadministrationid;
    }

    public void setDividendsandinterestid(String dividendsandinterestid) {
        this.dividendsandinterestid = dividendsandinterestid;
    }

    public String getDividendsandinterestid() {
        return dividendsandinterestid;
    }
}