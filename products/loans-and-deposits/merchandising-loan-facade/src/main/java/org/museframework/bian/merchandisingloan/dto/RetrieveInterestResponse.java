package org.museframework.bian.merchandisingloan.dto;

public class RetrieveInterestResponse {
    private org.museframework.bian.merchandisingloan.dto.bq.Interest interest;

    public void setInterest(org.museframework.bian.merchandisingloan.dto.bq.Interest interest) {
        this.interest = interest;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.Interest getInterest() {
        return interest;
    }
}