package org.museframework.bian.corporateloan.dto;

public class RetrieveInterestResponse {
    private org.museframework.bian.corporateloan.dto.bq.Interest interest;

    public void setInterest(org.museframework.bian.corporateloan.dto.bq.Interest interest) {
        this.interest = interest;
    }

    public org.museframework.bian.corporateloan.dto.bq.Interest getInterest() {
        return interest;
    }
}