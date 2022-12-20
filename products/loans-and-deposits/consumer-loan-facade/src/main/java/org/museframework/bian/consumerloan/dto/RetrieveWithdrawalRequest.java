package org.museframework.bian.consumerloan.dto;

public class RetrieveWithdrawalRequest {
    private String consumerloanid;

    private String withdrawalid;

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
}