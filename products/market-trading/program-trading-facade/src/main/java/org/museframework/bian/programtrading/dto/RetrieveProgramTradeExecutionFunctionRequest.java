package org.museframework.bian.programtrading.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveProgramTradeExecutionFunctionRequest {
    @MetaField
    private String programtradingid;

    @MetaField
    private String programtradeexecutionfunctionid;

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
}