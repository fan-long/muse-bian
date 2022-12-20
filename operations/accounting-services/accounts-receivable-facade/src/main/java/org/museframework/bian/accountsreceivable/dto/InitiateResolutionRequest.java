package org.museframework.bian.accountsreceivable.dto;

public class InitiateResolutionRequest {
    private String accountsreceivableid;

    private String resolutionid;

    private org.museframework.bian.accountsreceivable.dto.bq.Resolution resolution;

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

    public void setResolution(org.museframework.bian.accountsreceivable.dto.bq.Resolution resolution) {
        this.resolution = resolution;
    }

    public org.museframework.bian.accountsreceivable.dto.bq.Resolution getResolution() {
        return resolution;
    }
}