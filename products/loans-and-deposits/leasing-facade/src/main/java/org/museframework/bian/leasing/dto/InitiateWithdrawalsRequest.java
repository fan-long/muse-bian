package org.museframework.bian.leasing.dto;

public class InitiateWithdrawalsRequest {
    private String leasingid;

    private String withdrawalsid;

    private org.museframework.bian.leasing.dto.bq.Withdrawals withdrawals;

    public void setLeasingid(String leasingid) {
        this.leasingid = leasingid;
    }

    public String getLeasingid() {
        return leasingid;
    }

    public void setWithdrawalsid(String withdrawalsid) {
        this.withdrawalsid = withdrawalsid;
    }

    public String getWithdrawalsid() {
        return withdrawalsid;
    }

    public void setWithdrawals(org.museframework.bian.leasing.dto.bq.Withdrawals withdrawals) {
        this.withdrawals = withdrawals;
    }

    public org.museframework.bian.leasing.dto.bq.Withdrawals getWithdrawals() {
        return withdrawals;
    }
}