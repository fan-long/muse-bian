package org.museframework.bian.tradeclearing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateMarketTradeOutTradeResolutionWorkstepRequest {
    @MetaField
    private String tradeclearingid;

    @MetaField
    private String markettradeouttraderesolutionworkstepid;

    @MetaField(ref=true)
    private org.museframework.bian.tradeclearing.dto.bq.MarketTradeOutTradeResolutionWorkstep marketTradeOutTradeResolutionWorkstep;

    public void setTradeclearingid(String tradeclearingid) {
        this.tradeclearingid = tradeclearingid;
    }

    public String getTradeclearingid() {
        return tradeclearingid;
    }

    public void setMarkettradeouttraderesolutionworkstepid(String markettradeouttraderesolutionworkstepid) {
        this.markettradeouttraderesolutionworkstepid = markettradeouttraderesolutionworkstepid;
    }

    public String getMarkettradeouttraderesolutionworkstepid() {
        return markettradeouttraderesolutionworkstepid;
    }

    public void setMarketTradeOutTradeResolutionWorkstep(org.museframework.bian.tradeclearing.dto.bq.MarketTradeOutTradeResolutionWorkstep marketTradeOutTradeResolutionWorkstep) {
        this.marketTradeOutTradeResolutionWorkstep = marketTradeOutTradeResolutionWorkstep;
    }

    public org.museframework.bian.tradeclearing.dto.bq.MarketTradeOutTradeResolutionWorkstep getMarketTradeOutTradeResolutionWorkstep() {
        return marketTradeOutTradeResolutionWorkstep;
    }
}