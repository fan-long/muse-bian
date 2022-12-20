package org.museframework.bian.corporateloan.dto;

public class UpdateWithdrawalRequest {
    private String corporateloanid;

    private String withdrawalid;

    private org.museframework.bian.corporateloan.dto.bq.Withdrawal withdrawal;

    public void setCorporateloanid(String corporateloanid) {
        this.corporateloanid = corporateloanid;
    }

    public String getCorporateloanid() {
        return corporateloanid;
    }

    public void setWithdrawalid(String withdrawalid) {
        this.withdrawalid = withdrawalid;
    }

    public String getWithdrawalid() {
        return withdrawalid;
    }

    public void setWithdrawal(org.museframework.bian.corporateloan.dto.bq.Withdrawal withdrawal) {
        this.withdrawal = withdrawal;
    }

    public org.museframework.bian.corporateloan.dto.bq.Withdrawal getWithdrawal() {
        return withdrawal;
    }
}