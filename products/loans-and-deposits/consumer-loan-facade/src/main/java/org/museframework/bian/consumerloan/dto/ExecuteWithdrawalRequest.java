package org.museframework.bian.consumerloan.dto;

public class ExecuteWithdrawalRequest {
    private String consumerloanid;

    private String withdrawalid;

    private org.museframework.bian.consumerloan.dto.bq.Withdrawal withdrawal;

    public void setConsumerloanid(String consumerloanid) {
        this.consumerloanid = consumerloanid;
    }

    public String getConsumerloanid() {
        return consumerloanid;
    }

    public void setWithdrawalid(String withdrawalid) {
        this.withdrawalid = withdrawalid;
    }

    public String getWithdrawalid() {
        return withdrawalid;
    }

    public void setWithdrawal(org.museframework.bian.consumerloan.dto.bq.Withdrawal withdrawal) {
        this.withdrawal = withdrawal;
    }

    public org.museframework.bian.consumerloan.dto.bq.Withdrawal getWithdrawal() {
        return withdrawal;
    }
}