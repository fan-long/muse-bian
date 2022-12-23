package org.museframework.bian.virtualaccount.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestStatementRequest {
    @MetaField
    private String virtualaccountid;

    @MetaField
    private String statementid;

    @MetaField(ref=true)
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