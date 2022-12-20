package org.museframework.bian.termdeposit.dto;

public class InitiateAccountSweepRequest {
    private String termdepositid;

    private String accountsweepid;

    private org.museframework.bian.termdeposit.dto.bq.AccountSweep accountSweep;

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

    public void setAccountSweep(org.museframework.bian.termdeposit.dto.bq.AccountSweep accountSweep) {
        this.accountSweep = accountSweep;
    }

    public org.museframework.bian.termdeposit.dto.bq.AccountSweep getAccountSweep() {
        return accountSweep;
    }
}