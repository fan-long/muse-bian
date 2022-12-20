package org.museframework.bian.casmanandaccser.dto;

public class ExecuteDepositsandWithdrawalsRequest {
    private String cashmanagementandaccountservicesid;

    private String depositsandwithdrawalsid;

    private org.museframework.bian.casmanandaccser.dto.bq.DepositsandWithdrawals depositsandWithdrawals;

    public void setCashmanagementandaccountservicesid(String cashmanagementandaccountservicesid) {
        this.cashmanagementandaccountservicesid = cashmanagementandaccountservicesid;
    }

    public String getCashmanagementandaccountservicesid() {
        return cashmanagementandaccountservicesid;
    }

    public void setDepositsandwithdrawalsid(String depositsandwithdrawalsid) {
        this.depositsandwithdrawalsid = depositsandwithdrawalsid;
    }

    public String getDepositsandwithdrawalsid() {
        return depositsandwithdrawalsid;
    }

    public void setDepositsandWithdrawals(org.museframework.bian.casmanandaccser.dto.bq.DepositsandWithdrawals depositsandWithdrawals) {
        this.depositsandWithdrawals = depositsandWithdrawals;
    }

    public org.museframework.bian.casmanandaccser.dto.bq.DepositsandWithdrawals getDepositsandWithdrawals() {
        return depositsandWithdrawals;
    }
}