package org.museframework.bian.etradingworkbench.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateMarketOrderInitiationFunctionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.etradingworkbench.dto.bq.MarketOrderInitiationFunction marketOrderInitiationFunction;

    public void setMarketOrderInitiationFunction(org.museframework.bian.etradingworkbench.dto.bq.MarketOrderInitiationFunction marketOrderInitiationFunction) {
        this.marketOrderInitiationFunction = marketOrderInitiationFunction;
    }

    public org.museframework.bian.etradingworkbench.dto.bq.MarketOrderInitiationFunction getMarketOrderInitiationFunction() {
        return marketOrderInitiationFunction;
    }
}