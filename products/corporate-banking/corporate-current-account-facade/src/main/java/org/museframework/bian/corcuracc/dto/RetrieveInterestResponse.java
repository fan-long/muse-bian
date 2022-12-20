package org.museframework.bian.corcuracc.dto;

public class RetrieveInterestResponse {
    private org.museframework.bian.corcuracc.dto.bq.Interest interest;

    public void setInterest(org.museframework.bian.corcuracc.dto.bq.Interest interest) {
        this.interest = interest;
    }

    public org.museframework.bian.corcuracc.dto.bq.Interest getInterest() {
        return interest;
    }
}