package org.museframework.bian.currentaccount.dto;

public class InitiateAccountLienRequest {
    private String currentaccountid;

    private String accountlienid;

    private org.museframework.bian.currentaccount.dto.bq.AccountLien accountLien;

    public void setCurrentaccountid(String currentaccountid) {
        this.currentaccountid = currentaccountid;
    }

    public String getCurrentaccountid() {
        return currentaccountid;
    }

    public void setAccountlienid(String accountlienid) {
        this.accountlienid = accountlienid;
    }

    public String getAccountlienid() {
        return accountlienid;
    }

    public void setAccountLien(org.museframework.bian.currentaccount.dto.bq.AccountLien accountLien) {
        this.accountLien = accountLien;
    }

    public org.museframework.bian.currentaccount.dto.bq.AccountLien getAccountLien() {
        return accountLien;
    }
}