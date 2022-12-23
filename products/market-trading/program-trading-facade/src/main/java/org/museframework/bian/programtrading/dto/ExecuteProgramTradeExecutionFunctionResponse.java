package org.museframework.bian.programtrading.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteProgramTradeExecutionFunctionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.programtrading.dto.bq.ProgramTradeExecutionFunction programTradeExecutionFunction;

    public void setProgramTradeExecutionFunction(org.museframework.bian.programtrading.dto.bq.ProgramTradeExecutionFunction programTradeExecutionFunction) {
        this.programTradeExecutionFunction = programTradeExecutionFunction;
    }

    public org.museframework.bian.programtrading.dto.bq.ProgramTradeExecutionFunction getProgramTradeExecutionFunction() {
        return programTradeExecutionFunction;
    }
}