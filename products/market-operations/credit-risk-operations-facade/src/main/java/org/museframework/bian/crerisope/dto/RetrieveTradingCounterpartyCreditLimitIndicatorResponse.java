package org.museframework.bian.crerisope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveTradingCounterpartyCreditLimitIndicatorResponse {
    @MetaField(ref=true)
    private org.museframework.bian.crerisope.dto.bq.TradingCounterpartyCreditLimitIndicator tradingCounterpartyCreditLimitIndicator;

    public void setTradingCounterpartyCreditLimitIndicator(org.museframework.bian.crerisope.dto.bq.TradingCounterpartyCreditLimitIndicator tradingCounterpartyCreditLimitIndicator) {
        this.tradingCounterpartyCreditLimitIndicator = tradingCounterpartyCreditLimitIndicator;
    }

    public org.museframework.bian.crerisope.dto.bq.TradingCounterpartyCreditLimitIndicator getTradingCounterpartyCreditLimitIndicator() {
        return tradingCounterpartyCreditLimitIndicator;
    }
}