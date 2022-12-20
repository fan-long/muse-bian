package org.museframework.bian.savingsaccount.dto;

public class RetrieveInterestResponse {
    private org.museframework.bian.savingsaccount.dto.bq.Interest interest;

    public void setInterest(org.museframework.bian.savingsaccount.dto.bq.Interest interest) {
        this.interest = interest;
    }

    public org.museframework.bian.savingsaccount.dto.bq.Interest getInterest() {
        return interest;
    }
}