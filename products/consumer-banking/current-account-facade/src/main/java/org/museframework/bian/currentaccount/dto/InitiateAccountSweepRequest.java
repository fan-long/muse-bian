package org.museframework.bian.currentaccount.dto;

public class InitiateAccountSweepRequest {
    private String currentaccountid;

    private String accountsweepid;

    private org.museframework.bian.currentaccount.dto.bq.AccountSweep accountSweep;

    public void setCurrentaccountid(String currentaccountid) {
        this.currentaccountid = currentaccountid;
    }

    public String getCurrentaccountid() {
        return currentaccountid;
    }

    public void setAccountsweepid(String accountsweepid) {
        this.accountsweepid = accountsweepid;
    }

    public String getAccountsweepid() {
        return accountsweepid;
    }

    public void setAccountSweep(org.museframework.bian.currentaccount.dto.bq.AccountSweep accountSweep) {
        this.accountSweep = accountSweep;
    }

    public org.museframework.bian.currentaccount.dto.bq.AccountSweep getAccountSweep() {
        return accountSweep;
    }
}