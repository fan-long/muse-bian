package org.museframework.bian.merchandisingloan.dto;

public class RetrieveWithdrawalsRequest {
    private String merchandisingloanid;

    private String withdrawalsid;

    public void setMerchandisingloanid(String merchandisingloanid) {
        this.merchandisingloanid = merchandisingloanid;
    }

    public String getMerchandisingloanid() {
        return merchandisingloanid;
    }

    public void setWithdrawalsid(String withdrawalsid) {
        this.withdrawalsid = withdrawalsid;
    }

    public String getWithdrawalsid() {
        return withdrawalsid;
    }
}