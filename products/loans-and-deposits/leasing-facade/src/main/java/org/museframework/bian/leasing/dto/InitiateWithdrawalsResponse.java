package org.museframework.bian.leasing.dto;

public class InitiateWithdrawalsResponse {
    private org.museframework.bian.leasing.dto.bq.Withdrawals withdrawals;

    public void setWithdrawals(org.museframework.bian.leasing.dto.bq.Withdrawals withdrawals) {
        this.withdrawals = withdrawals;
    }

    public org.museframework.bian.leasing.dto.bq.Withdrawals getWithdrawals() {
        return withdrawals;
    }
}