package org.museframework.bian.frauddiagnosis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestAnalystReviewResponse {
    @MetaField(ref=true)
    private org.museframework.bian.frauddiagnosis.dto.bq.AnalystReview analystReview;

    public void setAnalystReview(org.museframework.bian.frauddiagnosis.dto.bq.AnalystReview analystReview) {
        this.analystReview = analystReview;
    }

    public org.museframework.bian.frauddiagnosis.dto.bq.AnalystReview getAnalystReview() {
        return analystReview;
    }
}