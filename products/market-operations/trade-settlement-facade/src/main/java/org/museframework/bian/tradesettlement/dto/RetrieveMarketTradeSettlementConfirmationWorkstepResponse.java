package org.museframework.bian.tradesettlement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveMarketTradeSettlementConfirmationWorkstepResponse {
    @MetaField(ref=true)
    private org.museframework.bian.tradesettlement.dto.bq.MarketTradeSettlementConfirmationWorkstep marketTradeSettlementConfirmationWorkstep;

    public void setMarketTradeSettlementConfirmationWorkstep(org.museframework.bian.tradesettlement.dto.bq.MarketTradeSettlementConfirmationWorkstep marketTradeSettlementConfirmationWorkstep) {
        this.marketTradeSettlementConfirmationWorkstep = marketTradeSettlementConfirmationWorkstep;
    }

    public org.museframework.bian.tradesettlement.dto.bq.MarketTradeSettlementConfirmationWorkstep getMarketTradeSettlementConfirmationWorkstep() {
        return marketTradeSettlementConfirmationWorkstep;
    }
}