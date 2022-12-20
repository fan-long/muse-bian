package org.museframework.bian.fiduciaryagreement.dto;

public class ExchangeFeesResponse {
    private org.museframework.bian.fiduciaryagreement.dto.bq.Fees fees;

    public void setFees(org.museframework.bian.fiduciaryagreement.dto.bq.Fees fees) {
        this.fees = fees;
    }

    public org.museframework.bian.fiduciaryagreement.dto.bq.Fees getFees() {
        return fees;
    }
}