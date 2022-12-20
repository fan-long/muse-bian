package org.museframework.bian.termdeposit.dto;

public class RetrieveAccountSweepRequest {
    private String termdepositid;

    private String accountsweepid;

    public void setTermdepositid(String termdepositid) {
        this.termdepositid = termdepositid;
    }

    public String getTermdepositid() {
        return termdepositid;
    }

    public void setAccountsweepid(String accountsweepid) {
        this.accountsweepid = accountsweepid;
    }

    public String getAccountsweepid() {
        return accountsweepid;
    }
}