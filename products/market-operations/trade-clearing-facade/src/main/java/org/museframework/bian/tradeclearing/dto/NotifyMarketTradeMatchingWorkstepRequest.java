package org.museframework.bian.tradeclearing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyMarketTradeMatchingWorkstepRequest {
    @MetaField
    private String tradeclearingid;

    @MetaField
    private String markettradematchingworkstepid;

    public void setTradeclearingid(String tradeclearingid) {
        this.tradeclearingid = tradeclearingid;
    }

    public String getTradeclearingid() {
        return tradeclearingid;
    }

    public void setMarkettradematchingworkstepid(String markettradematchingworkstepid) {
        this.markettradematchingworkstepid = markettradematchingworkstepid;
    }

    public String getMarkettradematchingworkstepid() {
        return markettradematchingworkstepid;
    }
}