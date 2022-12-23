package org.museframework.bian.tradesettlement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateMarketTradeCashSettlementWorkstepRequest {
    @MetaField
    private String tradesettlementid;

    @MetaField
    private String markettradecashsettlementworkstepid;

    @MetaField(ref=true)
    private org.museframework.bian.tradesettlement.dto.bq.MarketTradeCashSettlementWorkstep marketTradeCashSettlementWorkstep;

    public void setTradesettlementid(String tradesettlementid) {
        this.tradesettlementid = tradesettlementid;
    }

    public String getTradesettlementid() {
        return tradesettlementid;
    }

    public void setMarkettradecashsettlementworkstepid(String markettradecashsettlementworkstepid) {
        this.markettradecashsettlementworkstepid = markettradecashsettlementworkstepid;
    }

    public String getMarkettradecashsettlementworkstepid() {
        return markettradecashsettlementworkstepid;
    }

    public void setMarketTradeCashSettlementWorkstep(org.museframework.bian.tradesettlement.dto.bq.MarketTradeCashSettlementWorkstep marketTradeCashSettlementWorkstep) {
        this.marketTradeCashSettlementWorkstep = marketTradeCashSettlementWorkstep;
    }

    public org.museframework.bian.tradesettlement.dto.bq.MarketTradeCashSettlementWorkstep getMarketTradeCashSettlementWorkstep() {
        return marketTradeCashSettlementWorkstep;
    }
}