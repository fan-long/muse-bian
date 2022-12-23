package org.museframework.bian.marketmaking.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveMarketMakingQuoteFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.marketmaking.dto.bq.MarketMakingQuoteFulfillment marketMakingQuoteFulfillment;

    public void setMarketMakingQuoteFulfillment(org.museframework.bian.marketmaking.dto.bq.MarketMakingQuoteFulfillment marketMakingQuoteFulfillment) {
        this.marketMakingQuoteFulfillment = marketMakingQuoteFulfillment;
    }

    public org.museframework.bian.marketmaking.dto.bq.MarketMakingQuoteFulfillment getMarketMakingQuoteFulfillment() {
        return marketMakingQuoteFulfillment;
    }
}