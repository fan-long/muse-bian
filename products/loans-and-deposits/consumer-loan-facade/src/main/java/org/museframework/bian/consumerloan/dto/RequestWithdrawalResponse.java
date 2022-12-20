package org.museframework.bian.consumerloan.dto;

public class RequestWithdrawalResponse {
    private org.museframework.bian.consumerloan.dto.bq.Withdrawal withdrawal;

    public void setWithdrawal(org.museframework.bian.consumerloan.dto.bq.Withdrawal withdrawal) {
        this.withdrawal = withdrawal;
    }

    public org.museframework.bian.consumerloan.dto.bq.Withdrawal getWithdrawal() {
        return withdrawal;
    }
}