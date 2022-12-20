package org.museframework.bian.savingsaccount.dto;

public class InitiateAccountLienRequest {
    private String savingsaccountid;

    private String accountlienid;

    private org.museframework.bian.savingsaccount.dto.bq.AccountLien accountLien;

    public void setSavingsaccountid(String savingsaccountid) {
        this.savingsaccountid = savingsaccountid;
    }

    public String getSavingsaccountid() {
        return savingsaccountid;
    }

    public void setAccountlienid(String accountlienid) {
        this.accountlienid = accountlienid;
    }

    public String getAccountlienid() {
        return accountlienid;
    }

    public void setAccountLien(org.museframework.bian.savingsaccount.dto.bq.AccountLien accountLien) {
        this.accountLien = accountLien;
    }

    public org.museframework.bian.savingsaccount.dto.bq.AccountLien getAccountLien() {
        return accountLien;
    }
}