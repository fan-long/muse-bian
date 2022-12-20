package org.museframework.bian.leasing.dto;

public class InitiateDepositsResponse {
    private org.museframework.bian.leasing.dto.bq.Deposits deposits;

    public void setDeposits(org.museframework.bian.leasing.dto.bq.Deposits deposits) {
        this.deposits = deposits;
    }

    public org.museframework.bian.leasing.dto.bq.Deposits getDeposits() {
        return deposits;
    }
}