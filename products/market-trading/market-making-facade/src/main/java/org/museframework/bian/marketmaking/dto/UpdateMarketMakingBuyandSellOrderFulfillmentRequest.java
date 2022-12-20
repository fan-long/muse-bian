package org.museframework.bian.marketmaking.dto;

public class UpdateMarketMakingBuyandSellOrderFulfillmentRequest {
    private String marketmakingid;

    private String marketmakingbuyandsellorderfulfillmentid;

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