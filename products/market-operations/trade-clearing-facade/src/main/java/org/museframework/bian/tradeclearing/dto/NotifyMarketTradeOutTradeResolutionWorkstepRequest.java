package org.museframework.bian.tradeclearing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyMarketTradeOutTradeResolutionWorkstepRequest {
    @MetaField
    private String tradeclearingid;

    @MetaField
    private String markettradeouttraderesolutionworkstepid;

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
}