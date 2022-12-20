package org.museframework.bian.savingsaccount.dto;

public class RetrieveAccountSweepResponse {
    private org.museframework.bian.savingsaccount.dto.bq.AccountSweep accountSweep;

    public void setAccountSweep(org.museframework.bian.savingsaccount.dto.bq.AccountSweep accountSweep) {
        this.accountSweep = accountSweep;
    }

    public org.museframework.bian.savingsaccount.dto.bq.AccountSweep getAccountSweep() {
        return accountSweep;
    }
}