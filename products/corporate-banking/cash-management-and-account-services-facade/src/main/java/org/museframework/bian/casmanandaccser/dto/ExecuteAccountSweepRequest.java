package org.museframework.bian.casmanandaccser.dto;

public class ExecuteAccountSweepRequest {
    private String cashmanagementandaccountservicesid;

    private String accountsweepid;

    private org.museframework.bian.casmanandaccser.dto.bq.AccountSweep accountSweep;

    public void setCashmanagementandaccountservicesid(String cashmanagementandaccountservicesid) {
        this.cashmanagementandaccountservicesid = cashmanagementandaccountservicesid;
    }

    public String getCashmanagementandaccountservicesid() {
        return cashmanagementandaccountservicesid;
    }

    public void setAccountsweepid(String accountsweepid) {
        this.accountsweepid = accountsweepid;
    }

    public String getAccountsweepid() {
        return accountsweepid;
    }

    public void setAccountSweep(org.museframework.bian.casmanandaccser.dto.bq.AccountSweep accountSweep) {
        this.accountSweep = accountSweep;
    }

    public org.museframework.bian.casmanandaccser.dto.bq.AccountSweep getAccountSweep() {
        return accountSweep;
    }
}