package org.museframework.bian.loan.dto;

public class RetrieveInterestResponse {
    private org.museframework.bian.loan.dto.bq.Interest interest;

    public void setInterest(org.museframework.bian.loan.dto.bq.Interest interest) {
        this.interest = interest;
    }

    public org.museframework.bian.loan.dto.bq.Interest getInterest() {
        return interest;
    }
}