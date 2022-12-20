package org.museframework.bian.corcuracc.dto;

public class ExecuteAccountSweepResponse {
    private org.museframework.bian.corcuracc.dto.bq.AccountSweep accountSweep;

    public void setAccountSweep(org.museframework.bian.corcuracc.dto.bq.AccountSweep accountSweep) {
        this.accountSweep = accountSweep;
    }

    public org.museframework.bian.corcuracc.dto.bq.AccountSweep getAccountSweep() {
        return accountSweep;
    }
}