package org.museframework.bian.corcuracc.dto;

public class ExecuteDepositsandWithdrawalsResponse {
    private org.museframework.bian.corcuracc.dto.bq.DepositsandWithdrawals depositsandWithdrawals;

    public void setDepositsandWithdrawals(org.museframework.bian.corcuracc.dto.bq.DepositsandWithdrawals depositsandWithdrawals) {
        this.depositsandWithdrawals = depositsandWithdrawals;
    }

    public org.museframework.bian.corcuracc.dto.bq.DepositsandWithdrawals getDepositsandWithdrawals() {
        return depositsandWithdrawals;
    }
}