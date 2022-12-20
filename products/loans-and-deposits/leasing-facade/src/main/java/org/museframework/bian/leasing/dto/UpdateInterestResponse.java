package org.museframework.bian.leasing.dto;

public class UpdateInterestResponse {
    private org.museframework.bian.leasing.dto.bq.Interest interest;

    public void setInterest(org.museframework.bian.leasing.dto.bq.Interest interest) {
        this.interest = interest;
    }

    public org.museframework.bian.leasing.dto.bq.Interest getInterest() {
        return interest;
    }
}