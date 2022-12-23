package org.museframework.bian.tradesettlement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyMarketTradeSecuritiesSettlementWorkstepRequest {
    @MetaField
    private String tradesettlementid;

    @MetaField
    private String markettradesecuritiessettlementworkstepid;

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
}