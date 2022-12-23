package org.museframework.bian.marketmaking.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeMarketMakingFacilityRequest {
    @MetaField
    private String marketmakingid;

    @MetaField(ref=true)
    private org.museframework.bian.marketmaking.dto.cr.MarketMakingFacility marketMakingFacility;

    public void setMarketmakingid(String marketmakingid) {
        this.marketmakingid = marketmakingid;
    }

    public String getMarketmakingid() {
        return marketmakingid;
    }

    public void setMarketMakingFacility(org.museframework.bian.marketmaking.dto.cr.MarketMakingFacility marketMakingFacility) {
        this.marketMakingFacility = marketMakingFacility;
    }

    public org.museframework.bian.marketmaking.dto.cr.MarketMakingFacility getMarketMakingFacility() {
        return marketMakingFacility;
    }
}