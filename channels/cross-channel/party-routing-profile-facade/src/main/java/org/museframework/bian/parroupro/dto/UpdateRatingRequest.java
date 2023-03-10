package org.museframework.bian.parroupro.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateRatingRequest {
    @MetaField
    private String partyroutingprofileid;

    @MetaField
    private String ratingid;

    @MetaField(ref=true)
    private org.museframework.bian.parroupro.dto.bq.Rating rating;

    public void setPartyroutingprofileid(String partyroutingprofileid) {
        this.partyroutingprofileid = partyroutingprofileid;
    }

    public String getPartyroutingprofileid() {
        return partyroutingprofileid;
    }

    public void setRatingid(String ratingid) {
        this.ratingid = ratingid;
    }

    public String getRatingid() {
        return ratingid;
    }

    public void setRating(org.museframework.bian.parroupro.dto.bq.Rating rating) {
        this.rating = rating;
    }

    public org.museframework.bian.parroupro.dto.bq.Rating getRating() {
        return rating;
    }
}