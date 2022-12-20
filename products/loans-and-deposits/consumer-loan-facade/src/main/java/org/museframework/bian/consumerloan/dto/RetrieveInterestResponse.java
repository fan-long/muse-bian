package org.museframework.bian.consumerloan.dto;

public class RetrieveInterestResponse {
    private org.museframework.bian.consumerloan.dto.bq.Interest interest;

    public void setInterest(org.museframework.bian.consumerloan.dto.bq.Interest interest) {
        this.interest = interest;
    }

    public org.museframework.bian.consumerloan.dto.bq.Interest getInterest() {
        return interest;
    }
}