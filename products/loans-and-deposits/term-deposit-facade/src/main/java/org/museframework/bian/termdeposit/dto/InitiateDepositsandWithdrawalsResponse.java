package org.museframework.bian.termdeposit.dto;

public class InitiateDepositsandWithdrawalsResponse {
    private org.museframework.bian.termdeposit.dto.bq.DepositsandWithdrawals depositsandWithdrawals;

    public void setDepositsandWithdrawals(org.museframework.bian.termdeposit.dto.bq.DepositsandWithdrawals depositsandWithdrawals) {
        this.depositsandWithdrawals = depositsandWithdrawals;
    }

    public org.museframework.bian.termdeposit.dto.bq.DepositsandWithdrawals getDepositsandWithdrawals() {
        return depositsandWithdrawals;
    }
}