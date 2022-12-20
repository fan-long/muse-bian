package org.museframework.bian.currentaccount.dto;

public class InitiateDepositsandWithdrawalsRequest {
    private String currentaccountid;

    private String depositsandwithdrawalsid;

    private org.museframework.bian.currentaccount.dto.bq.DepositsandWithdrawals depositsandWithdrawals;

    public void setCurrentaccountid(String currentaccountid) {
        this.currentaccountid = currentaccountid;
    }

    public String getCurrentaccountid() {
        return currentaccountid;
    }

    public void setDepositsandwithdrawalsid(String depositsandwithdrawalsid) {
        this.depositsandwithdrawalsid = depositsandwithdrawalsid;
    }

    public String getDepositsandwithdrawalsid() {
        return depositsandwithdrawalsid;
    }

    public void setDepositsandWithdrawals(org.museframework.bian.currentaccount.dto.bq.DepositsandWithdrawals depositsandWithdrawals) {
        this.depositsandWithdrawals = depositsandWithdrawals;
    }

    public org.museframework.bian.currentaccount.dto.bq.DepositsandWithdrawals getDepositsandWithdrawals() {
        return depositsandWithdrawals;
    }
}