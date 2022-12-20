package org.museframework.bian.savingsaccount.dto;

public class UpdateDepositsandWithdrawalsResponse {
    private org.museframework.bian.savingsaccount.dto.bq.DepositsandWithdrawals depositsandWithdrawals;

    public void setDepositsandWithdrawals(org.museframework.bian.savingsaccount.dto.bq.DepositsandWithdrawals depositsandWithdrawals) {
        this.depositsandWithdrawals = depositsandWithdrawals;
    }

    public org.museframework.bian.savingsaccount.dto.bq.DepositsandWithdrawals getDepositsandWithdrawals() {
        return depositsandWithdrawals;
    }
}