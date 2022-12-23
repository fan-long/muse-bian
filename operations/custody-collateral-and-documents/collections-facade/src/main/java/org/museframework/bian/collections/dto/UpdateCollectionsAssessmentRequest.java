package org.museframework.bian.collections.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCollectionsAssessmentRequest {
    @MetaField
    private String collectionsid;

    @MetaField
    private String collectionsassessmentid;

    @MetaField(ref=true)
    private org.museframework.bian.collections.dto.bq.CollectionsAssessment collectionsAssessment;

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

    public void setCollectionsAssessment(org.museframework.bian.collections.dto.bq.CollectionsAssessment collectionsAssessment) {
        this.collectionsAssessment = collectionsAssessment;
    }

    public org.museframework.bian.collections.dto.bq.CollectionsAssessment getCollectionsAssessment() {
        return collectionsAssessment;
    }
}