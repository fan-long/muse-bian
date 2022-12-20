package org.museframework.bian.custodyadministration.dto;

public class UpdateFeesResponse {
    private org.museframework.bian.custodyadministration.dto.bq.Fees fees;

    public void setFees(org.museframework.bian.custodyadministration.dto.bq.Fees fees) {
        this.fees = fees;
    }

    public org.museframework.bian.custodyadministration.dto.bq.Fees getFees() {
        return fees;
    }
}