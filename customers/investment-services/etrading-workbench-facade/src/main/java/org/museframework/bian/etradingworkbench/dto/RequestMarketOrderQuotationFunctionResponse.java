package org.museframework.bian.etradingworkbench.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestMarketOrderQuotationFunctionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.etradingworkbench.dto.bq.MarketOrderQuotationFunction marketOrderQuotationFunction;

    public void setMarketOrderQuotationFunction(org.museframework.bian.etradingworkbench.dto.bq.MarketOrderQuotationFunction marketOrderQuotationFunction) {
        this.marketOrderQuotationFunction = marketOrderQuotationFunction;
    }

    public org.museframework.bian.etradingworkbench.dto.bq.MarketOrderQuotationFunction getMarketOrderQuotationFunction() {
        return marketOrderQuotationFunction;
    }
}