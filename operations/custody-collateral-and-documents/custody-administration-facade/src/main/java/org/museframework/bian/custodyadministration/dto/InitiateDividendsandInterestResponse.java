package org.museframework.bian.custodyadministration.dto;

public class InitiateDividendsandInterestResponse {
    private org.museframework.bian.custodyadministration.dto.bq.DividendsandInterest dividendsandInterest;

    public void setDividendsandInterest(org.museframework.bian.custodyadministration.dto.bq.DividendsandInterest dividendsandInterest) {
        this.dividendsandInterest = dividendsandInterest;
    }

    public org.museframework.bian.custodyadministration.dto.bq.DividendsandInterest getDividendsandInterest() {
        return dividendsandInterest;
    }
}