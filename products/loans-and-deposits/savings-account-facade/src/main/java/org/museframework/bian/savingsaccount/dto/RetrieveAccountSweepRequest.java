package org.museframework.bian.savingsaccount.dto;

public class RetrieveAccountSweepRequest {
    private String savingsaccountid;

    private String accountsweepid;

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
}