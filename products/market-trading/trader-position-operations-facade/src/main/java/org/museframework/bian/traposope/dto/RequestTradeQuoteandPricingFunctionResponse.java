package org.museframework.bian.traposope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestTradeQuoteandPricingFunctionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.traposope.dto.bq.TradeQuoteandPricingFunction tradeQuoteandPricingFunction;

    public void setTradeQuoteandPricingFunction(org.museframework.bian.traposope.dto.bq.TradeQuoteandPricingFunction tradeQuoteandPricingFunction) {
        this.tradeQuoteandPricingFunction = tradeQuoteandPricingFunction;
    }

    public org.museframework.bian.traposope.dto.bq.TradeQuoteandPricingFunction getTradeQuoteandPricingFunction() {
        return tradeQuoteandPricingFunction;
    }
}