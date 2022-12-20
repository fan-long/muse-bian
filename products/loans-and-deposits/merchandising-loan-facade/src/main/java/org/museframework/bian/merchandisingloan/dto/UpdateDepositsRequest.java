package org.museframework.bian.merchandisingloan.dto;

public class UpdateDepositsRequest {
    private String merchandisingloanid;

    private String depositsid;

    private org.museframework.bian.merchandisingloan.dto.bq.Deposits deposits;

    public void setMerchandisingloanid(String merchandisingloanid) {
        this.merchandisingloanid = merchandisingloanid;
    }

    public String getMerchandisingloanid() {
        return merchandisingloanid;
    }

    public void setDepositsid(String depositsid) {
        this.depositsid = depositsid;
    }

    public String getDepositsid() {
        return depositsid;
    }

    public void setDeposits(org.museframework.bian.merchandisingloan.dto.bq.Deposits deposits) {
        this.deposits = deposits;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.Deposits getDeposits() {
        return deposits;
    }
}