package org.museframework.bian.mardatswiope.dto;

public class ExecuteDistributionRequest {
    private String marketdataswitchoperationid;

    private String distributionid;

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