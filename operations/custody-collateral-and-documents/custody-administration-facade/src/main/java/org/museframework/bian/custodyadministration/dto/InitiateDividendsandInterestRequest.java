package org.museframework.bian.custodyadministration.dto;

public class InitiateDividendsandInterestRequest {
    private String custodyadministrationid;

    private String dividendsandinterestid;

    private org.museframework.bian.custodyadministration.dto.bq.DividendsandInterest dividendsandInterest;

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

    public void setDividendsandInterest(org.museframework.bian.custodyadministration.dto.bq.DividendsandInterest dividendsandInterest) {
        this.dividendsandInterest = dividendsandInterest;
    }

    public org.museframework.bian.custodyadministration.dto.bq.DividendsandInterest getDividendsandInterest() {
        return dividendsandInterest;
    }
}