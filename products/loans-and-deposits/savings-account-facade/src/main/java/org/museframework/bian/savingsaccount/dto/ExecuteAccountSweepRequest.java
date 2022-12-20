package org.museframework.bian.savingsaccount.dto;

public class ExecuteAccountSweepRequest {
    private String savingsaccountid;

    private String accountsweepid;

    private org.museframework.bian.savingsaccount.dto.bq.AccountSweep accountSweep;

    public void setSavingsaccountid(String savingsaccountid) {
        this.savingsaccountid = savingsaccountid;
    }

    public String getSavingsaccountid() {
        return savingsaccountid;
    }

    public void setAccountsweepid(String accountsweepid) {
        this.accountsweepid = accountsweepid;
    }

    public String getAccountsweepid() {
        return accountsweepid;
    }

    public void setAccountSweep(org.museframework.bian.savingsaccount.dto.bq.AccountSweep accountSweep) {
        this.accountSweep = accountSweep;
    }

    public org.museframework.bian.savingsaccount.dto.bq.AccountSweep getAccountSweep() {
        return accountSweep;
    }
}