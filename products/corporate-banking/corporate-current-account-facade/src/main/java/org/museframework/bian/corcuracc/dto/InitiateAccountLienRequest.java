package org.museframework.bian.corcuracc.dto;

public class InitiateAccountLienRequest {
    private String corporatecurrentaccountid;

    private String accountlienid;

    private org.museframework.bian.corcuracc.dto.bq.AccountLien accountLien;

    public void setCorporatecurrentaccountid(String corporatecurrentaccountid) {
        this.corporatecurrentaccountid = corporatecurrentaccountid;
    }

    public String getCorporatecurrentaccountid() {
        return corporatecurrentaccountid;
    }

    public void setAccountlienid(String accountlienid) {
        this.accountlienid = accountlienid;
    }

    public String getAccountlienid() {
        return accountlienid;
    }

    public void setAccountLien(org.museframework.bian.corcuracc.dto.bq.AccountLien accountLien) {
        this.accountLien = accountLien;
    }

    public org.museframework.bian.corcuracc.dto.bq.AccountLien getAccountLien() {
        return accountLien;
    }
}