package org.museframework.bian.tradesettlement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateMarketTradeSecuritiesSettlementWorkstepRequest {
    @MetaField
    private String tradesettlementid;

    @MetaField
    private String markettradesecuritiessettlementworkstepid;

    @MetaField(ref=true)
    private org.museframework.bian.tradesettlement.dto.bq.MarketTradeSecuritiesSettlementWorkstep marketTradeSecuritiesSettlementWorkstep;

    public void setTradesettlementid(String tradesettlementid) {
        this.tradesettlementid = tradesettlementid;
    }

    public String getTradesettlementid() {
        return tradesettlementid;
    }

    public void setMarkettradesecuritiessettlementworkstepid(String markettradesecuritiessettlementworkstepid) {
        this.markettradesecuritiessettlementworkstepid = markettradesecuritiessettlementworkstepid;
    }

    public String getMarkettradesecuritiessettlementworkstepid() {
        return markettradesecuritiessettlementworkstepid;
    }

    public void setMarketTradeSecuritiesSettlementWorkstep(org.museframework.bian.tradesettlement.dto.bq.MarketTradeSecuritiesSettlementWorkstep marketTradeSecuritiesSettlementWorkstep) {
        this.marketTradeSecuritiesSettlementWorkstep = marketTradeSecuritiesSettlementWorkstep;
    }

    public org.museframework.bian.tradesettlement.dto.bq.MarketTradeSecuritiesSettlementWorkstep getMarketTradeSecuritiesSettlementWorkstep() {
        return marketTradeSecuritiesSettlementWorkstep;
    }
}