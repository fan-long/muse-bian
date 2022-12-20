package org.museframework.bian.creditcard.dto;

public class RetrieveInterestResponse {
    private org.museframework.bian.creditcard.dto.bq.Interest interest;

    public void setInterest(org.museframework.bian.creditcard.dto.bq.Interest interest) {
        this.interest = interest;
    }

    public org.museframework.bian.creditcard.dto.bq.Interest getInterest() {
        return interest;
    }
}