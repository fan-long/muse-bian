package org.museframework.bian.mortgageloan.dto;

public class RetrieveInterestResponse {
    private org.museframework.bian.mortgageloan.dto.bq.Interest interest;

    public void setInterest(org.museframework.bian.mortgageloan.dto.bq.Interest interest) {
        this.interest = interest;
    }

    public org.museframework.bian.mortgageloan.dto.bq.Interest getInterest() {
        return interest;
    }
}