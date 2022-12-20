package org.museframework.bian.mortgageloan.dto;

public class InitiateWithdrawalsResponse {
    private org.museframework.bian.mortgageloan.dto.bq.Withdrawals withdrawals;

    public void setWithdrawals(org.museframework.bian.mortgageloan.dto.bq.Withdrawals withdrawals) {
        this.withdrawals = withdrawals;
    }

    public org.museframework.bian.mortgageloan.dto.bq.Withdrawals getWithdrawals() {
        return withdrawals;
    }
}