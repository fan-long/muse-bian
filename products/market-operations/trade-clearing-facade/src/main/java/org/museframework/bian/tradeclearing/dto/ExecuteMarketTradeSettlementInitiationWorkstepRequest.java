package org.museframework.bian.tradeclearing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteMarketTradeSettlementInitiationWorkstepRequest {
    @MetaField
    private String tradeclearingid;

    @MetaField
    private String markettradesettlementinitiationworkstepid;

    @MetaField(ref=true)
    private org.museframework.bian.tradeclearing.dto.bq.MarketTradeSettlementInitiationWorkstep marketTradeSettlementInitiationWorkstep;

    public void setTradeclearingid(String tradeclearingid) {
        this.tradeclearingid = tradeclearingid;
    }

    public String getTradeclearingid() {
        return tradeclearingid;
    }

    public void setMarkettradesettlementinitiationworkstepid(String markettradesettlementinitiationworkstepid) {
        this.markettradesettlementinitiationworkstepid = markettradesettlementinitiationworkstepid;
    }

    public String getMarkettradesettlementinitiationworkstepid() {
        return markettradesettlementinitiationworkstepid;
    }

    public void setMarketTradeSettlementInitiationWorkstep(org.museframework.bian.tradeclearing.dto.bq.MarketTradeSettlementInitiationWorkstep marketTradeSettlementInitiationWorkstep) {
        this.marketTradeSettlementInitiationWorkstep = marketTradeSettlementInitiationWorkstep;
    }

    public org.museframework.bian.tradeclearing.dto.bq.MarketTradeSettlementInitiationWorkstep getMarketTradeSettlementInitiationWorkstep() {
        return marketTradeSettlementInitiationWorkstep;
    }
}