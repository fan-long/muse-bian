package org.museframework.bian.marketmaking.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateMarketMakingSecurityTradedPositionFulfillmentRequest {
    @MetaField
    private String marketmakingid;

    @MetaField
    private String marketmakingsecuritytradedpositionfulfillmentid;

    @MetaField(ref=true)
    private org.museframework.bian.marketmaking.dto.bq.MarketMakingSecurityTradedPositionFulfillment marketMakingSecurityTradedPositionFulfillment;

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

    public void setMarketMakingSecurityTradedPositionFulfillment(org.museframework.bian.marketmaking.dto.bq.MarketMakingSecurityTradedPositionFulfillment marketMakingSecurityTradedPositionFulfillment) {
        this.marketMakingSecurityTradedPositionFulfillment = marketMakingSecurityTradedPositionFulfillment;
    }

    public org.museframework.bian.marketmaking.dto.bq.MarketMakingSecurityTradedPositionFulfillment getMarketMakingSecurityTradedPositionFulfillment() {
        return marketMakingSecurityTradedPositionFulfillment;
    }
}