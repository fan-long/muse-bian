package org.museframework.bian.mardatswiope.dto;

public class UpdateFeedUploadResponse {
    private org.museframework.bian.mardatswiope.dto.bq.FeedUpload feedUpload;

    public void setFeedUpload(org.museframework.bian.mardatswiope.dto.bq.FeedUpload feedUpload) {
        this.feedUpload = feedUpload;
    }

    public org.museframework.bian.mardatswiope.dto.bq.FeedUpload getFeedUpload() {
        return feedUpload;
    }
}