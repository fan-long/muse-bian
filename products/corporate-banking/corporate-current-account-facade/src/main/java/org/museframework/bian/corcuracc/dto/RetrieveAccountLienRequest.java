package org.museframework.bian.corcuracc.dto;

public class RetrieveAccountLienRequest {
    private String corporatecurrentaccountid;

    private String accountlienid;

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
}