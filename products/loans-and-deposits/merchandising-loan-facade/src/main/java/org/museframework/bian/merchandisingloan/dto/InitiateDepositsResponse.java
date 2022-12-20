package org.museframework.bian.merchandisingloan.dto;

public class InitiateDepositsResponse {
    private org.museframework.bian.merchandisingloan.dto.bq.Deposits deposits;

    public void setDeposits(org.museframework.bian.merchandisingloan.dto.bq.Deposits deposits) {
        this.deposits = deposits;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.Deposits getDeposits() {
        return deposits;
    }
}