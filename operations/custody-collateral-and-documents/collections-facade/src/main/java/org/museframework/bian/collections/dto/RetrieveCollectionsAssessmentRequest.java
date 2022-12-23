package org.museframework.bian.collections.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCollectionsAssessmentRequest {
    @MetaField
    private String collectionsid;

    @MetaField
    private String collectionsassessmentid;

    public void setCollectionsid(String collectionsid) {
        this.collectionsid = collectionsid;
    }

    public String getCollectionsid() {
        return collectionsid;
    }

    public void setCollectionsassessmentid(String collectionsassessmentid) {
        this.collectionsassessmentid = collectionsassessmentid;
    }

    public String getCollectionsassessmentid() {
        return collectionsassessmentid;
    }
}