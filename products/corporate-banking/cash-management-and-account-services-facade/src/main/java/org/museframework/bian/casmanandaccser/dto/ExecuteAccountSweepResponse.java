package org.museframework.bian.casmanandaccser.dto;

public class ExecuteAccountSweepResponse {
    private org.museframework.bian.casmanandaccser.dto.bq.AccountSweep accountSweep;

    public void setAccountSweep(org.museframework.bian.casmanandaccser.dto.bq.AccountSweep accountSweep) {
        this.accountSweep = accountSweep;
    }

    public org.museframework.bian.casmanandaccser.dto.bq.AccountSweep getAccountSweep() {
        return accountSweep;
    }
}