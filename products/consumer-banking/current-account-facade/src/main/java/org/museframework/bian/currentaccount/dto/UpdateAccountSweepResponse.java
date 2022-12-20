package org.museframework.bian.currentaccount.dto;

public class UpdateAccountSweepResponse {
    private org.museframework.bian.currentaccount.dto.bq.AccountSweep accountSweep;

    public void setAccountSweep(org.museframework.bian.currentaccount.dto.bq.AccountSweep accountSweep) {
        this.accountSweep = accountSweep;
    }

    public org.museframework.bian.currentaccount.dto.bq.AccountSweep getAccountSweep() {
        return accountSweep;
    }
}