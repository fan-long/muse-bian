package org.museframework.bian.virtualaccount.dto;

public class UpdateStatementResponse {
    private org.museframework.bian.virtualaccount.dto.bq.Statement statement;

    public void setStatement(org.museframework.bian.virtualaccount.dto.bq.Statement statement) {
        this.statement = statement;
    }

    public org.museframework.bian.virtualaccount.dto.bq.Statement getStatement() {
        return statement;
    }
}