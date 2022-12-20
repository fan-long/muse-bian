package org.museframework.bian.creditcard.dto;

public class UpdateFeesResponse {
    private org.museframework.bian.creditcard.dto.bq.Fees fees;

    public void setFees(org.museframework.bian.creditcard.dto.bq.Fees fees) {
        this.fees = fees;
    }

    public org.museframework.bian.creditcard.dto.bq.Fees getFees() {
        return fees;
    }
}