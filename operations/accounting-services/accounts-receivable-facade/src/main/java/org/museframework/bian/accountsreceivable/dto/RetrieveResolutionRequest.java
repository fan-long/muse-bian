package org.museframework.bian.accountsreceivable.dto;

public class RetrieveResolutionRequest {
    private String accountsreceivableid;

    private String resolutionid;

    public void setAccountsreceivableid(String accountsreceivableid) {
        this.accountsreceivableid = accountsreceivableid;
    }

    public String getAccountsreceivableid() {
        return accountsreceivableid;
    }

    public void setResolutionid(String resolutionid) {
        this.resolutionid = resolutionid;
    }

    public String getResolutionid() {
        return resolutionid;
    }
}