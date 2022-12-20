package org.museframework.bian.leasing.dto;

public class RetrieveWithdrawalsRequest {
    private String leasingid;

    private String withdrawalsid;

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
}