package org.museframework.bian.advertising.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveMarketTrackingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.advertising.dto.bq.MarketTracking marketTracking;

    public void setMarketTracking(org.museframework.bian.advertising.dto.bq.MarketTracking marketTracking) {
        this.marketTracking = marketTracking;
    }

    public org.museframework.bian.advertising.dto.bq.MarketTracking getMarketTracking() {
        return marketTracking;
    }
}