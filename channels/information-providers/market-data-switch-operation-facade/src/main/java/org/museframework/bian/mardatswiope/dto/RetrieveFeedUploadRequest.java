package org.museframework.bian.mardatswiope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveFeedUploadRequest {
    @MetaField
    private String marketdataswitchoperationid;

    @MetaField
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