package org.museframework.bian.tradeclearing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveMarketTradeConfirmationWorkstepRequest {
    @MetaField
    private String tradeclearingid;

    @MetaField
    private String markettradeconfirmationworkstepid;

    public void setTradeclearingid(String tradeclearingid) {
        this.tradeclearingid = tradeclearingid;
    }

    public String getTradeclearingid() {
        return tradeclearingid;
    }

    public void setMarkettradeconfirmationworkstepid(String markettradeconfirmationworkstepid) {
        this.markettradeconfirmationworkstepid = markettradeconfirmationworkstepid;
    }

    public String getMarkettradeconfirmationworkstepid() {
        return markettradeconfirmationworkstepid;
    }
}