package org.museframework.bian.virtualaccount.dto;

public class InitiateInterestRequest {
    private String virtualaccountid;

    private String interestid;

    private org.museframework.bian.virtualaccount.dto.bq.Interest interest;

    public void setVirtualaccountid(String virtualaccountid) {
        this.virtualaccountid = virtualaccountid;
    }

    public String getVirtualaccountid() {
        return virtualaccountid;
    }

    public void setInterestid(String interestid) {
        this.interestid = interestid;
    }

    public String getInterestid() {
        return interestid;
    }

    public void setInterest(org.museframework.bian.virtualaccount.dto.bq.Interest interest) {
        this.interest = interest;
    }

    public org.museframework.bian.virtualaccount.dto.bq.Interest getInterest() {
        return interest;
    }
}