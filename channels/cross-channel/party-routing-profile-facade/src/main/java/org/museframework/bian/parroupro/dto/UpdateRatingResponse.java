package org.museframework.bian.parroupro.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateRatingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.parroupro.dto.bq.Rating rating;

    public void setRating(org.museframework.bian.parroupro.dto.bq.Rating rating) {
        this.rating = rating;
    }

    public org.museframework.bian.parroupro.dto.bq.Rating getRating() {
        return rating;
    }
}