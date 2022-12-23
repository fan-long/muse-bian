package org.museframework.bian.tradesettlement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeMarketTradeSecuritiesSettlementWorkstepResponse {
    @MetaField(ref=true)
    private org.museframework.bian.tradesettlement.dto.bq.MarketTradeSecuritiesSettlementWorkstep marketTradeSecuritiesSettlementWorkstep;

    public void setMarketTradeSecuritiesSettlementWorkstep(org.museframework.bian.tradesettlement.dto.bq.MarketTradeSecuritiesSettlementWorkstep marketTradeSecuritiesSettlementWorkstep) {
        this.marketTradeSecuritiesSettlementWorkstep = marketTradeSecuritiesSettlementWorkstep;
    }

    public org.museframework.bian.tradesettlement.dto.bq.MarketTradeSecuritiesSettlementWorkstep getMarketTradeSecuritiesSettlementWorkstep() {
        return marketTradeSecuritiesSettlementWorkstep;
    }
}