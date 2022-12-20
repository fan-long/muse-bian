package org.museframework.bian.corcuracc.dto;

public class RetrieveAccountSweepRequest {
    private String corporatecurrentaccountid;

    private String accountsweepid;

    public void setCorporatecurrentaccountid(String corporatecurrentaccountid) {
        this.corporatecurrentaccountid = corporatecurrentaccountid;
    }

    public String getCorporatecurrentaccountid() {
        return corporatecurrentaccountid;
    }

    public void setAccountsweepid(String accountsweepid) {
        this.accountsweepid = accountsweepid;
    }

    public String getAccountsweepid() {
        return accountsweepid;
    }
}