package org.museframework.bian.casmanandaccser.dto;

public class UpdateAccountLienRequest {
    private String cashmanagementandaccountservicesid;

    private String accountlienid;

    private org.museframework.bian.casmanandaccser.dto.bq.AccountLien accountLien;

    public void setCashmanagementandaccountservicesid(String cashmanagementandaccountservicesid) {
        this.cashmanagementandaccountservicesid = cashmanagementandaccountservicesid;
    }

    public String getCashmanagementandaccountservicesid() {
        return cashmanagementandaccountservicesid;
    }

    public void setAccountlienid(String accountlienid) {
        this.accountlienid = accountlienid;
    }

    public String getAccountlienid() {
        return accountlienid;
    }

    public void setAccountLien(org.museframework.bian.casmanandaccser.dto.bq.AccountLien accountLien) {
        this.accountLien = accountLien;
    }

    public org.museframework.bian.casmanandaccser.dto.bq.AccountLien getAccountLien() {
        return accountLien;
    }
}