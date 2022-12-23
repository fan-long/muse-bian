package org.museframework.bian.advertising.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateMarketTrackingRequest {
    @MetaField
    private String advertisingid;

    @MetaField
    private String markettrackingid;

    @MetaField(ref=true)
    private org.museframework.bian.advertising.dto.bq.MarketTracking marketTracking;

    public void setAdvertisingid(String advertisingid) {
        this.advertisingid = advertisingid;
    }

    public String getAdvertisingid() {
        return advertisingid;
    }

    public void setMarkettrackingid(String markettrackingid) {
        this.markettrackingid = markettrackingid;
    }

    public String getMarkettrackingid() {
        return markettrackingid;
    }

    public void setMarketTracking(org.museframework.bian.advertising.dto.bq.MarketTracking marketTracking) {
        this.marketTracking = marketTracking;
    }

    public org.museframework.bian.advertising.dto.bq.MarketTracking getMarketTracking() {
        return marketTracking;
    }
}