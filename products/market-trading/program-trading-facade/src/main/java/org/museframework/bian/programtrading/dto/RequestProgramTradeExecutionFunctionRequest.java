package org.museframework.bian.programtrading.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestProgramTradeExecutionFunctionRequest {
    @MetaField
    private String programtradingid;

    @MetaField
    private String programtradeexecutionfunctionid;

    @MetaField(ref=true)
    private org.museframework.bian.programtrading.dto.bq.ProgramTradeExecutionFunction programTradeExecutionFunction;

    public void setProgramtradingid(String programtradingid) {
        this.programtradingid = programtradingid;
    }

    public String getProgramtradingid() {
        return programtradingid;
    }

    public void setProgramtradeexecutionfunctionid(String programtradeexecutionfunctionid) {
        this.programtradeexecutionfunctionid = programtradeexecutionfunctionid;
    }

    public String getProgramtradeexecutionfunctionid() {
        return programtradeexecutionfunctionid;
    }

    public void setProgramTradeExecutionFunction(org.museframework.bian.programtrading.dto.bq.ProgramTradeExecutionFunction programTradeExecutionFunction) {
        this.programTradeExecutionFunction = programTradeExecutionFunction;
    }

    public org.museframework.bian.programtrading.dto.bq.ProgramTradeExecutionFunction getProgramTradeExecutionFunction() {
        return programTradeExecutionFunction;
    }
}