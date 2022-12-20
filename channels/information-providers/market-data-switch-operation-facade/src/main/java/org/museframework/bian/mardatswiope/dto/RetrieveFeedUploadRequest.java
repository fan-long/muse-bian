package org.museframework.bian.mardatswiope.dto;

public class RetrieveFeedUploadRequest {
    private String marketdataswitchoperationid;

    private String feeduploadid;

    public void setMarketdataswitchoperationid(String marketdataswitchoperationid) {
        this.marketdataswitchoperationid = marketdataswitchoperationid;
    }

    public String getMarketdataswitchoperationid() {
        return marketdataswitchoperationid;
    }

    public void setFeeduploadid(String feeduploadid) {
        this.feeduploadid = feeduploadid;
    }

    public String getFeeduploadid() {
        return feeduploadid;
    }
}