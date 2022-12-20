package org.museframework.bian.loan.dto;

public class UpdateWithdrawalResponse {
    private org.museframework.bian.loan.dto.bq.Withdrawal withdrawal;

    public void setWithdrawal(org.museframework.bian.loan.dto.bq.Withdrawal withdrawal) {
        this.withdrawal = withdrawal;
    }

    public org.museframework.bian.loan.dto.bq.Withdrawal getWithdrawal() {
        return withdrawal;
    }
}