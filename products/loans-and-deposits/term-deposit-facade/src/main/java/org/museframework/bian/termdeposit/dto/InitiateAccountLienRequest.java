package org.museframework.bian.termdeposit.dto;

public class InitiateAccountLienRequest {
    private String termdepositid;

    private String accountlienid;

    private org.museframework.bian.termdeposit.dto.bq.AccountLien accountLien;

    public void setTermdepositid(String termdepositid) {
        this.termdepositid = termdepositid;
    }

    public String getTermdepositid() {
        return termdepositid;
    }

    public void setAccountlienid(String accountlienid) {
        this.accountlienid = accountlienid;
    }

    public String getAccountlienid() {
        return accountlienid;
    }

    public void setAccountLien(org.museframework.bian.termdeposit.dto.bq.AccountLien accountLien) {
        this.accountLien = accountLien;
    }

    public org.museframework.bian.termdeposit.dto.bq.AccountLien getAccountLien() {
        return accountLien;
    }
}