package org.museframework.bian.mardatswiope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateFeedUploadRequest {
    @MetaField
    private String marketdataswitchoperationid;

    @MetaField
    private String feeduploadid;

    @MetaField(ref=true)
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