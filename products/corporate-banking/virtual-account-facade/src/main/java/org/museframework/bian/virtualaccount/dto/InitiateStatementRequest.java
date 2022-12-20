package org.museframework.bian.virtualaccount.dto;

public class InitiateStatementRequest {
    private String virtualaccountid;

    private String statementid;

    private org.museframework.bian.virtualaccount.dto.bq.Statement statement;

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

    public void setStatement(org.museframework.bian.virtualaccount.dto.bq.Statement statement) {
        this.statement = statement;
    }

    public org.museframework.bian.virtualaccount.dto.bq.Statement getStatement() {
        return statement;
    }
}