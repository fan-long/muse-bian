package org.museframework.bian.tradesettlement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestMarketTradeCashSettlementWorkstepResponse {
    @MetaField(ref=true)
    private org.museframework.bian.tradesettlement.dto.bq.MarketTradeCashSettlementWorkstep marketTradeCashSettlementWorkstep;

    public void setMarketTradeCashSettlementWorkstep(org.museframework.bian.tradesettlement.dto.bq.MarketTradeCashSettlementWorkstep marketTradeCashSettlementWorkstep) {
        this.marketTradeCashSettlementWorkstep = marketTradeCashSettlementWorkstep;
    }

    public org.museframework.bian.tradesettlement.dto.bq.MarketTradeCashSettlementWorkstep getMarketTradeCashSettlementWorkstep() {
        return marketTradeCashSettlementWorkstep;
    }
}