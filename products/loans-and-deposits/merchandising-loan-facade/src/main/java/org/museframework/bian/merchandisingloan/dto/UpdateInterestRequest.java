package org.museframework.bian.merchandisingloan.dto;

public class UpdateInterestRequest {
    private String merchandisingloanid;

    private String interestid;

    private org.museframework.bian.merchandisingloan.dto.bq.Interest interest;

    public void setMerchandisingloanid(String merchandisingloanid) {
        this.merchandisingloanid = merchandisingloanid;
    }

    public String getMerchandisingloanid() {
        return merchandisingloanid;
    }

    public void setInterestid(String interestid) {
        this.interestid = interestid;
    }

    public String getInterestid() {
        return interestid;
    }

    public void setInterest(org.museframework.bian.merchandisingloan.dto.bq.Interest interest) {
        this.interest = interest;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.Interest getInterest() {
        return interest;
    }
}