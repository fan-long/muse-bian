package org.museframework.bian.corporateloan.dto;

public class RequestWithdrawalResponse {
    private org.museframework.bian.corporateloan.dto.bq.Withdrawal withdrawal;

    public void setWithdrawal(org.museframework.bian.corporateloan.dto.bq.Withdrawal withdrawal) {
        this.withdrawal = withdrawal;
    }

    public org.museframework.bian.corporateloan.dto.bq.Withdrawal getWithdrawal() {
        return withdrawal;
    }
}