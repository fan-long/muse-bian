package org.museframework.bian.currentaccount.dto;

public class RetrieveAccountSweepRequest {
    private String currentaccountid;

    private String accountsweepid;

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
}