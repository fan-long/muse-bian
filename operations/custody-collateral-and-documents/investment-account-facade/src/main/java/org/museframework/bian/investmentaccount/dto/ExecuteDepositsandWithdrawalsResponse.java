package org.museframework.bian.investmentaccount.dto;

public class ExecuteDepositsandWithdrawalsResponse {
    private org.museframework.bian.investmentaccount.dto.bq.DepositsandWithdrawals depositsandWithdrawals;

    public void setDepositsandWithdrawals(org.museframework.bian.investmentaccount.dto.bq.DepositsandWithdrawals depositsandWithdrawals) {
        this.depositsandWithdrawals = depositsandWithdrawals;
    }

    public org.museframework.bian.investmentaccount.dto.bq.DepositsandWithdrawals getDepositsandWithdrawals() {
        return depositsandWithdrawals;
    }
}