package org.museframework.bian.mortgageloan.dto;

public class UpdateInterestRequest {
    private String mortgageloanid;

    private String interestid;

    private org.museframework.bian.mortgageloan.dto.bq.Interest interest;

    public void setMortgageloanid(String mortgageloanid) {
        this.mortgageloanid = mortgageloanid;
    }

    public String getMortgageloanid() {
        return mortgageloanid;
    }

    public void setInterestid(String interestid) {
        this.interestid = interestid;
    }

    public String getInterestid() {
        return interestid;
    }

    public void setInterest(org.museframework.bian.mortgageloan.dto.bq.Interest interest) {
        this.interest = interest;
    }

    public org.museframework.bian.mortgageloan.dto.bq.Interest getInterest() {
        return interest;
    }
}