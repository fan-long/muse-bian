package org.museframework.bian.tradeclearing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateMarketTradeConfirmationWorkstepResponse {
    @MetaField(ref=true)
    private org.museframework.bian.tradeclearing.dto.bq.MarketTradeConfirmationWorkstep marketTradeConfirmationWorkstep;

    public void setMarketTradeConfirmationWorkstep(org.museframework.bian.tradeclearing.dto.bq.MarketTradeConfirmationWorkstep marketTradeConfirmationWorkstep) {
        this.marketTradeConfirmationWorkstep = marketTradeConfirmationWorkstep;
    }

    public org.museframework.bian.tradeclearing.dto.bq.MarketTradeConfirmationWorkstep getMarketTradeConfirmationWorkstep() {
        return marketTradeConfirmationWorkstep;
    }
}