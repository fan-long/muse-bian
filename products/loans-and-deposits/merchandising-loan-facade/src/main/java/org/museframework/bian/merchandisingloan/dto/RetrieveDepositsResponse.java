package org.museframework.bian.merchandisingloan.dto;

public class RetrieveDepositsResponse {
    private org.museframework.bian.merchandisingloan.dto.bq.Deposits deposits;

    public void setDeposits(org.museframework.bian.merchandisingloan.dto.bq.Deposits deposits) {
        this.deposits = deposits;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.Deposits getDeposits() {
        return deposits;
    }
}