package org.museframework.bian.virtualaccount.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestStatementResponse {
    @MetaField(ref=true)
    private org.museframework.bian.virtualaccount.dto.bq.Statement statement;

    public void setStatement(org.museframework.bian.virtualaccount.dto.bq.Statement statement) {
        this.statement = statement;
    }

    public org.museframework.bian.virtualaccount.dto.bq.Statement getStatement() {
        return statement;
    }
}