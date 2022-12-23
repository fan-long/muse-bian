package org.museframework.bian.collections.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateCollectionsAssessmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.collections.dto.bq.CollectionsAssessment collectionsAssessment;

    public void setCollectionsAssessment(org.museframework.bian.collections.dto.bq.CollectionsAssessment collectionsAssessment) {
        this.collectionsAssessment = collectionsAssessment;
    }

    public org.museframework.bian.collections.dto.bq.CollectionsAssessment getCollectionsAssessment() {
        return collectionsAssessment;
    }
}