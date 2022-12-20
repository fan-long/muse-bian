package org.museframework.bian.mortgageloan.dto;

public class InitiateDepositsRequest {
    private String mortgageloanid;

    private String depositsid;

    private org.museframework.bian.mortgageloan.dto.bq.Deposits deposits;

    public void setMortgageloanid(String mortgageloanid) {
        this.mortgageloanid = mortgageloanid;
    }

    public String getMortgageloanid() {
        return mortgageloanid;
    }

    public void setDepositsid(String depositsid) {
        this.depositsid = depositsid;
    }

    public String getDepositsid() {
        return depositsid;
    }

    public void setDeposits(org.museframework.bian.mortgageloan.dto.bq.Deposits deposits) {
        this.deposits = deposits;
    }

    public org.museframework.bian.mortgageloan.dto.bq.Deposits getDeposits() {
        return deposits;
    }
}