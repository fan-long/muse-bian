package org.museframework.bian.mortgageloan.dto;

public class InitiateDepositsResponse {
    private org.museframework.bian.mortgageloan.dto.bq.Deposits deposits;

    public void setDeposits(org.museframework.bian.mortgageloan.dto.bq.Deposits deposits) {
        this.deposits = deposits;
    }

    public org.museframework.bian.mortgageloan.dto.bq.Deposits getDeposits() {
        return deposits;
    }
}