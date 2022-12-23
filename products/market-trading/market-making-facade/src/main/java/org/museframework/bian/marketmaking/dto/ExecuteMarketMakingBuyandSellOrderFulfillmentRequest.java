package org.museframework.bian.marketmaking.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteMarketMakingBuyandSellOrderFulfillmentRequest {
    @MetaField
    private String marketmakingid;

    @MetaField
    private String marketmakingbuyandsellorderfulfillmentid;

    @MetaField(ref=true)
    private org.museframework.bian.marketmaking.dto.bq.MarketMakingBuyandSellOrderFulfillment marketMakingBuyandSellOrderFulfillment;

    public void setMarketmakingid(String marketmakingid) {
        this.marketmakingid = marketmakingid;
    }

    public String getMarketmakingid() {
        return marketmakingid;
    }

    public void setMarketmakingbuyandsellorderfulfillmentid(String marketmakingbuyandsellorderfulfillmentid) {
        this.marketmakingbuyandsellorderfulfillmentid = marketmakingbuyandsellorderfulfillmentid;
    }

    public String getMarketmakingbuyandsellorderfulfillmentid() {
        return marketmakingbuyandsellorderfulfillmentid;
    }

    public void setMarketMakingBuyandSellOrderFulfillment(org.museframework.bian.marketmaking.dto.bq.MarketMakingBuyandSellOrderFulfillment marketMakingBuyandSellOrderFulfillment) {
        this.marketMakingBuyandSellOrderFulfillment = marketMakingBuyandSellOrderFulfillment;
    }

    public org.museframework.bian.marketmaking.dto.bq.MarketMakingBuyandSellOrderFulfillment getMarketMakingBuyandSellOrderFulfillment() {
        return marketMakingBuyandSellOrderFulfillment;
    }
}