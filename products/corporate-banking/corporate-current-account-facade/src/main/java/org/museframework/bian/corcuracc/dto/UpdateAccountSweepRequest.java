package org.museframework.bian.corcuracc.dto;

public class UpdateAccountSweepRequest {
    private String corporatecurrentaccountid;

    private String accountsweepid;

    private org.museframework.bian.corcuracc.dto.bq.AccountSweep accountSweep;

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

    public void setAccountSweep(org.museframework.bian.corcuracc.dto.bq.AccountSweep accountSweep) {
        this.accountSweep = accountSweep;
    }

    public org.museframework.bian.corcuracc.dto.bq.AccountSweep getAccountSweep() {
        return accountSweep;
    }
}