package org.museframework.bian.knowledgeexchange.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeReview_RefinementandEditingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.knowledgeexchange.dto.bq.Review_RefinementandEditing review_RefinementandEditing;

    public void setReview_RefinementandEditing(org.museframework.bian.knowledgeexchange.dto.bq.Review_RefinementandEditing review_RefinementandEditing) {
        this.review_RefinementandEditing = review_RefinementandEditing;
    }

    public org.museframework.bian.knowledgeexchange.dto.bq.Review_RefinementandEditing getReview_RefinementandEditing() {
        return review_RefinementandEditing;
    }
}