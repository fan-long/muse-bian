package org.museframework.bian.virtualaccount.dto;

public class RetrieveInterestResponse {
    private org.museframework.bian.virtualaccount.dto.bq.Interest interest;

    public void setInterest(org.museframework.bian.virtualaccount.dto.bq.Interest interest) {
        this.interest = interest;
    }

    public org.museframework.bian.virtualaccount.dto.bq.Interest getInterest() {
        return interest;
    }
}