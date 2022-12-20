package org.museframework.bian.currentaccount.dto;

public class RetrieveInterestResponse {
    private org.museframework.bian.currentaccount.dto.bq.Interest interest;

    public void setInterest(org.museframework.bian.currentaccount.dto.bq.Interest interest) {
        this.interest = interest;
    }

    public org.museframework.bian.currentaccount.dto.bq.Interest getInterest() {
        return interest;
    }
}