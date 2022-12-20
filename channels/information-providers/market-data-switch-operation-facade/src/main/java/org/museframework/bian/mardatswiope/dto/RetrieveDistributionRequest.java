package org.museframework.bian.mardatswiope.dto;

public class RetrieveDistributionRequest {
    private String marketdataswitchoperationid;

    private String distributionid;

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
}