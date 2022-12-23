package org.museframework.bian.marketmaking.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveMarketMakingSecurityTradedPositionFulfillmentRequest {
    @MetaField
    private String marketmakingid;

    @MetaField
    private String marketmakingsecuritytradedpositionfulfillmentid;

    public void setMarketmakingid(String marketmakingid) {
        this.marketmakingid = marketmakingid;
    }

    public String getMarketmakingid() {
        return marketmakingid;
    }

    public void setMarketmakingsecuritytradedpositionfulfillmentid(String marketmakingsecuritytradedpositionfulfillmentid) {
        this.marketmakingsecuritytradedpositionfulfillmentid = marketmakingsecuritytradedpositionfulfillmentid;
    }

    public String getMarketmakingsecuritytradedpositionfulfillmentid() {
        return marketmakingsecuritytradedpositionfulfillmentid;
    }
}