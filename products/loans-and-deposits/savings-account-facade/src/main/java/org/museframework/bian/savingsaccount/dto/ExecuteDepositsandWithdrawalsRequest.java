package org.museframework.bian.savingsaccount.dto;

public class ExecuteDepositsandWithdrawalsRequest {
    private String savingsaccountid;

    private String depositsandwithdrawalsid;

    private org.museframework.bian.savingsaccount.dto.bq.DepositsandWithdrawals depositsandWithdrawals;

    public void setSavingsaccountid(String savingsaccountid) {
        this.savingsaccountid = savingsaccountid;
    }

    public String getSavingsaccountid() {
        return savingsaccountid;
    }

    public void setDepositsandwithdrawalsid(String depositsandwithdrawalsid) {
        this.depositsandwithdrawalsid = depositsandwithdrawalsid;
    }

    public String getDepositsandwithdrawalsid() {
        return depositsandwithdrawalsid;
    }

    public void setDepositsandWithdrawals(org.museframework.bian.savingsaccount.dto.bq.DepositsandWithdrawals depositsandWithdrawals) {
        this.depositsandWithdrawals = depositsandWithdrawals;
    }

    public org.museframework.bian.savingsaccount.dto.bq.DepositsandWithdrawals getDepositsandWithdrawals() {
        return depositsandWithdrawals;
    }
}