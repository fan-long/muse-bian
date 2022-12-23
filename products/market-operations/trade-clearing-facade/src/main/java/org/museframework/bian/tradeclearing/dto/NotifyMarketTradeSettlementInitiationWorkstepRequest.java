package org.museframework.bian.tradeclearing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyMarketTradeSettlementInitiationWorkstepRequest {
    @MetaField
    private String tradeclearingid;

    @MetaField
    private String markettradesettlementinitiationworkstepid;

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
}