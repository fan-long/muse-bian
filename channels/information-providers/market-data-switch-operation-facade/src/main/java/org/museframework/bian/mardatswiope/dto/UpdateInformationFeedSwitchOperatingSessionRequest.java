package org.museframework.bian.mardatswiope.dto;

public class UpdateInformationFeedSwitchOperatingSessionRequest {
    private String marketdataswitchoperationid;

    private org.museframework.bian.mardatswiope.dto.cr.InformationFeedSwitchOperatingSession informationFeedSwitchOperatingSession;

    public void setMarketdataswitchoperationid(String marketdataswitchoperationid) {
        this.marketdataswitchoperationid = marketdataswitchoperationid;
    }

    public String getMarketdataswitchoperationid() {
        return marketdataswitchoperationid;
    }

    public void setInformationFeedSwitchOperatingSession(org.museframework.bian.mardatswiope.dto.cr.InformationFeedSwitchOperatingSession informationFeedSwitchOperatingSession) {
        this.informationFeedSwitchOperatingSession = informationFeedSwitchOperatingSession;
    }

    public org.museframework.bian.mardatswiope.dto.cr.InformationFeedSwitchOperatingSession getInformationFeedSwitchOperatingSession() {
        return informationFeedSwitchOperatingSession;
    }
}