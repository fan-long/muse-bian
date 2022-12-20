package org.museframework.bian.merchandisingloan.dto;

public class UpdateWithdrawalsRequest {
    private String merchandisingloanid;

    private String withdrawalsid;

    private org.museframework.bian.merchandisingloan.dto.bq.Withdrawals withdrawals;

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

    public void setWithdrawals(org.museframework.bian.merchandisingloan.dto.bq.Withdrawals withdrawals) {
        this.withdrawals = withdrawals;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.Withdrawals getWithdrawals() {
        return withdrawals;
    }
}