package org.museframework.bian.marketmaking.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveMarketMakingBuyandSellOrderFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.marketmaking.dto.bq.MarketMakingBuyandSellOrderFulfillment marketMakingBuyandSellOrderFulfillment;

    public void setMarketMakingBuyandSellOrderFulfillment(org.museframework.bian.marketmaking.dto.bq.MarketMakingBuyandSellOrderFulfillment marketMakingBuyandSellOrderFulfillment) {
        this.marketMakingBuyandSellOrderFulfillment = marketMakingBuyandSellOrderFulfillment;
    }

    public org.museframework.bian.marketmaking.dto.bq.MarketMakingBuyandSellOrderFulfillment getMarketMakingBuyandSellOrderFulfillment() {
        return marketMakingBuyandSellOrderFulfillment;
    }
}