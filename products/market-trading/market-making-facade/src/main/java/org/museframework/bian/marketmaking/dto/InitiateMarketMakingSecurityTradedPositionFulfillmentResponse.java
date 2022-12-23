package org.museframework.bian.marketmaking.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateMarketMakingSecurityTradedPositionFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.marketmaking.dto.bq.MarketMakingSecurityTradedPositionFulfillment marketMakingSecurityTradedPositionFulfillment;

    public void setMarketMakingSecurityTradedPositionFulfillment(org.museframework.bian.marketmaking.dto.bq.MarketMakingSecurityTradedPositionFulfillment marketMakingSecurityTradedPositionFulfillment) {
        this.marketMakingSecurityTradedPositionFulfillment = marketMakingSecurityTradedPositionFulfillment;
    }

    public org.museframework.bian.marketmaking.dto.bq.MarketMakingSecurityTradedPositionFulfillment getMarketMakingSecurityTradedPositionFulfillment() {
        return marketMakingSecurityTradedPositionFulfillment;
    }
}