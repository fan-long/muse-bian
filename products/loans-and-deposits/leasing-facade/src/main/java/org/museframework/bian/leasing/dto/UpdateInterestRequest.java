package org.museframework.bian.leasing.dto;

public class UpdateInterestRequest {
    private String leasingid;

    private String interestid;

    private org.museframework.bian.leasing.dto.bq.Interest interest;

    public void setLeasingid(String leasingid) {
        this.leasingid = leasingid;
    }

    public String getLeasingid() {
        return leasingid;
    }

    public void setInterestid(String interestid) {
        this.interestid = interestid;
    }

    public String getInterestid() {
        return interestid;
    }

    public void setInterest(org.museframework.bian.leasing.dto.bq.Interest interest) {
        this.interest = interest;
    }

    public org.museframework.bian.leasing.dto.bq.Interest getInterest() {
        return interest;
    }
}