package org.museframework.bian.marketmaking.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveMarketMakingQuoteFulfillmentRequest {
    @MetaField
    private String marketmakingid;

    @MetaField
    private String marketmakingquotefulfillmentid;

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
}