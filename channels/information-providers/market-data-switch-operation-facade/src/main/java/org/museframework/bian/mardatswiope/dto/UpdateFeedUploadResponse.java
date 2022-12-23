package org.museframework.bian.mardatswiope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateFeedUploadResponse {
    @MetaField(ref=true)
    private org.museframework.bian.mardatswiope.dto.bq.FeedUpload feedUpload;

    public void setFeedUpload(org.museframework.bian.mardatswiope.dto.bq.FeedUpload feedUpload) {
        this.feedUpload = feedUpload;
    }

    public org.museframework.bian.mardatswiope.dto.bq.FeedUpload getFeedUpload() {
        return feedUpload;
    }
}