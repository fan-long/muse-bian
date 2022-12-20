package org.museframework.bian.termdeposit.dto;

public class ExecuteAccountSweepResponse {
    private org.museframework.bian.termdeposit.dto.bq.AccountSweep accountSweep;

    public void setAccountSweep(org.museframework.bian.termdeposit.dto.bq.AccountSweep accountSweep) {
        this.accountSweep = accountSweep;
    }

    public org.museframework.bian.termdeposit.dto.bq.AccountSweep getAccountSweep() {
        return accountSweep;
    }
}