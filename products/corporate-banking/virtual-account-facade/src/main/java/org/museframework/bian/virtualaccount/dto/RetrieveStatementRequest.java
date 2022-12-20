package org.museframework.bian.virtualaccount.dto;

public class RetrieveStatementRequest {
    private String virtualaccountid;

    private String statementid;

    public void setVirtualaccountid(String virtualaccountid) {
        this.virtualaccountid = virtualaccountid;
    }

    public String getVirtualaccountid() {
        return virtualaccountid;
    }

    public void setStatementid(String statementid) {
        this.statementid = statementid;
    }

    public String getStatementid() {
        return statementid;
    }
}