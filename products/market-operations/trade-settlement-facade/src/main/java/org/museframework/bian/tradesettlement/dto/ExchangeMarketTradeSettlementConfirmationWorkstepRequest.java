package org.museframework.bian.tradesettlement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeMarketTradeSettlementConfirmationWorkstepRequest {
    @MetaField
    private String tradesettlementid;

    @MetaField
    private String markettradesettlementconfirmationworkstepid;

    @MetaField(ref=true)
    private org.museframework.bian.tradesettlement.dto.bq.MarketTradeSettlementConfirmationWorkstep marketTradeSettlementConfirmationWorkstep;

    public void setTradesettlementid(String tradesettlementid) {
        this.tradesettlementid = tradesettlementid;
    }

    public String getTradesettlementid() {
        return tradesettlementid;
    }

    public void setMarkettradesettlementconfirmationworkstepid(String markettradesettlementconfirmationworkstepid) {
        this.markettradesettlementconfirmationworkstepid = markettradesettlementconfirmationworkstepid;
    }

    public String getMarkettradesettlementconfirmationworkstepid() {
        return markettradesettlementconfirmationworkstepid;
    }

    public void setMarketTradeSettlementConfirmationWorkstep(org.museframework.bian.tradesettlement.dto.bq.MarketTradeSettlementConfirmationWorkstep marketTradeSettlementConfirmationWorkstep) {
        this.marketTradeSettlementConfirmationWorkstep = marketTradeSettlementConfirmationWorkstep;
    }

    public org.museframework.bian.tradesettlement.dto.bq.MarketTradeSettlementConfirmationWorkstep getMarketTradeSettlementConfirmationWorkstep() {
        return marketTradeSettlementConfirmationWorkstep;
    }
}