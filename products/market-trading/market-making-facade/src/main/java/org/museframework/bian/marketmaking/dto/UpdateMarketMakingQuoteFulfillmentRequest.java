package org.museframework.bian.marketmaking.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateMarketMakingQuoteFulfillmentRequest {
    @MetaField
    private String marketmakingid;

    @MetaField
    private String marketmakingquotefulfillmentid;

    @MetaField(ref=true)
    private org.museframework.bian.marketmaking.dto.bq.MarketMakingQuoteFulfillment marketMakingQuoteFulfillment;

    public void setMarketmakingid(String marketmakingid) {
        this.marketmakingid = marketmakingid;
    }

    public String getMarketmakingid() {
        return marketmakingid;
    }

    public void setMarketmakingquotefulfillmentid(String marketmakingquotefulfillmentid) {
        this.marketmakingquotefulfillmentid = marketmakingquotefulfillmentid;
    }

    public String getMarketmakingquotefulfillmentid() {
        return marketmakingquotefulfillmentid;
    }

    public void setMarketMakingQuoteFulfillment(org.museframework.bian.marketmaking.dto.bq.MarketMakingQuoteFulfillment marketMakingQuoteFulfillment) {
        this.marketMakingQuoteFulfillment = marketMakingQuoteFulfillment;
    }

    public org.museframework.bian.marketmaking.dto.bq.MarketMakingQuoteFulfillment getMarketMakingQuoteFulfillment() {
        return marketMakingQuoteFulfillment;
    }
}