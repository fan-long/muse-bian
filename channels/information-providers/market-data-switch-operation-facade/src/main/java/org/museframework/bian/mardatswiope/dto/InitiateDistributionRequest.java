package org.museframework.bian.mardatswiope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateDistributionRequest {
    @MetaField
    private String marketdataswitchoperationid;

    @MetaField
    private String distributionid;

    @MetaField(ref=true)
    private org.museframework.bian.mardatswiope.dto.bq.Distribution distribution;

    public void setMarketdataswitchoperationid(String marketdataswitchoperationid) {
        this.marketdataswitchoperationid = marketdataswitchoperationid;
    }

    public String getMarketdataswitchoperationid() {
        return marketdataswitchoperationid;
    }

    public void setDistributionid(String distributionid) {
        this.distributionid = distributionid;
    }

    public String getDistributionid() {
        return distributionid;
    }

    public void setDistribution(org.museframework.bian.mardatswiope.dto.bq.Distribution distribution) {
        this.distribution = distribution;
    }

    public org.museframework.bian.mardatswiope.dto.bq.Distribution getDistribution() {
        return distribution;
    }
}