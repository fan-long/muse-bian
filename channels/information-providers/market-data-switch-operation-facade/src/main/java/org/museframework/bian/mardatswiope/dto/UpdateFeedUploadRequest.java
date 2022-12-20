package org.museframework.bian.mardatswiope.dto;

public class UpdateFeedUploadRequest {
    private String marketdataswitchoperationid;

    private String feeduploadid;

    private org.museframework.bian.mardatswiope.dto.bq.FeedUpload feedUpload;

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

    public void setFeedUpload(org.museframework.bian.mardatswiope.dto.bq.FeedUpload feedUpload) {
        this.feedUpload = feedUpload;
    }

    public org.museframework.bian.mardatswiope.dto.bq.FeedUpload getFeedUpload() {
        return feedUpload;
    }
}