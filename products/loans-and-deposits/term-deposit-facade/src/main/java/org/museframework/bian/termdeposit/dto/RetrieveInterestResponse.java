package org.museframework.bian.termdeposit.dto;

public class RetrieveInterestResponse {
    private org.museframework.bian.termdeposit.dto.bq.Interest interest;

    public void setInterest(org.museframework.bian.termdeposit.dto.bq.Interest interest) {
        this.interest = interest;
    }

    public org.museframework.bian.termdeposit.dto.bq.Interest getInterest() {
        return interest;
    }
}