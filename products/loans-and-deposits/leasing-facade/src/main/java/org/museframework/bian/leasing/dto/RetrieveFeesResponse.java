package org.museframework.bian.leasing.dto;

public class RetrieveFeesResponse {
    private org.museframework.bian.leasing.dto.bq.Fees fees;

    public void setFees(org.museframework.bian.leasing.dto.bq.Fees fees) {
        this.fees = fees;
    }

    public org.museframework.bian.leasing.dto.bq.Fees getFees() {
        return fees;
    }
}