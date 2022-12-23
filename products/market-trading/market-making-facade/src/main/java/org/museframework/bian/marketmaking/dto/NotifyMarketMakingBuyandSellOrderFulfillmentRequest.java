package org.museframework.bian.marketmaking.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyMarketMakingBuyandSellOrderFulfillmentRequest {
    @MetaField
    private String marketmakingid;

    @MetaField
    private String marketmakingbuyandsellorderfulfillmentid;

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
}