package org.museframework.bian.traposope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateTradeDealBlotterFunctionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.traposope.dto.bq.TradeDealBlotterFunction tradeDealBlotterFunction;

    public void setTradeDealBlotterFunction(org.museframework.bian.traposope.dto.bq.TradeDealBlotterFunction tradeDealBlotterFunction) {
        this.tradeDealBlotterFunction = tradeDealBlotterFunction;
    }

    public org.museframework.bian.traposope.dto.bq.TradeDealBlotterFunction getTradeDealBlotterFunction() {
        return tradeDealBlotterFunction;
    }
}