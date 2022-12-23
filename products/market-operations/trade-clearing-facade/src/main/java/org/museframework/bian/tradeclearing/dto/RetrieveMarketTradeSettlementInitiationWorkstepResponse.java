package org.museframework.bian.tradeclearing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveMarketTradeSettlementInitiationWorkstepResponse {
    @MetaField(ref=true)
    private org.museframework.bian.tradeclearing.dto.bq.MarketTradeSettlementInitiationWorkstep marketTradeSettlementInitiationWorkstep;

    public void setMarketTradeSettlementInitiationWorkstep(org.museframework.bian.tradeclearing.dto.bq.MarketTradeSettlementInitiationWorkstep marketTradeSettlementInitiationWorkstep) {
        this.marketTradeSettlementInitiationWorkstep = marketTradeSettlementInitiationWorkstep;
    }

    public org.museframework.bian.tradeclearing.dto.bq.MarketTradeSettlementInitiationWorkstep getMarketTradeSettlementInitiationWorkstep() {
        return marketTradeSettlementInitiationWorkstep;
    }
}