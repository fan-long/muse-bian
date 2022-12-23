package org.museframework.bian.tradeclearing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateMarketTradeOutTradeResolutionWorkstepResponse {
    @MetaField(ref=true)
    private org.museframework.bian.tradeclearing.dto.bq.MarketTradeOutTradeResolutionWorkstep marketTradeOutTradeResolutionWorkstep;

    public void setMarketTradeOutTradeResolutionWorkstep(org.museframework.bian.tradeclearing.dto.bq.MarketTradeOutTradeResolutionWorkstep marketTradeOutTradeResolutionWorkstep) {
        this.marketTradeOutTradeResolutionWorkstep = marketTradeOutTradeResolutionWorkstep;
    }

    public org.museframework.bian.tradeclearing.dto.bq.MarketTradeOutTradeResolutionWorkstep getMarketTradeOutTradeResolutionWorkstep() {
        return marketTradeOutTradeResolutionWorkstep;
    }
}