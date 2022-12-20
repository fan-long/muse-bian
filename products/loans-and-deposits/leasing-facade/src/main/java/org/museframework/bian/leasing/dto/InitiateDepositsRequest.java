package org.museframework.bian.leasing.dto;

public class InitiateDepositsRequest {
    private String leasingid;

    private String depositsid;

    private org.museframework.bian.leasing.dto.bq.Deposits deposits;

    public void setLeasingid(String leasingid) {
        this.leasingid = leasingid;
    }

    public String getLeasingid() {
        return leasingid;
    }

    public void setDepositsid(String depositsid) {
        this.depositsid = depositsid;
    }

    public String getDepositsid() {
        return depositsid;
    }

    public void setDeposits(org.museframework.bian.leasing.dto.bq.Deposits deposits) {
        this.deposits = deposits;
    }

    public org.museframework.bian.leasing.dto.bq.Deposits getDeposits() {
        return deposits;
    }
}