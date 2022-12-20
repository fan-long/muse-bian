package org.museframework.bian.savingsaccount.dto;

public class RetrieveAccountLienRequest {
    private String savingsaccountid;

    private String accountlienid;

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
}