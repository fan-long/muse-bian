package org.museframework.bian.cardclearing.dto;

public class UpdateFeesResponse {
    private org.museframework.bian.cardclearing.dto.bq.Fees fees;

    public void setFees(org.museframework.bian.cardclearing.dto.bq.Fees fees) {
        this.fees = fees;
    }

    public org.museframework.bian.cardclearing.dto.bq.Fees getFees() {
        return fees;
    }
}