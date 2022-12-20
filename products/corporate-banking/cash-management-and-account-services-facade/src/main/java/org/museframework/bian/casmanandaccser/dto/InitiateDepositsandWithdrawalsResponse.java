package org.museframework.bian.casmanandaccser.dto;

public class InitiateDepositsandWithdrawalsResponse {
    private org.museframework.bian.casmanandaccser.dto.bq.DepositsandWithdrawals depositsandWithdrawals;

    public void setDepositsandWithdrawals(org.museframework.bian.casmanandaccser.dto.bq.DepositsandWithdrawals depositsandWithdrawals) {
        this.depositsandWithdrawals = depositsandWithdrawals;
    }

    public org.museframework.bian.casmanandaccser.dto.bq.DepositsandWithdrawals getDepositsandWithdrawals() {
        return depositsandWithdrawals;
    }
}