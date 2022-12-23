package org.museframework.bian.parroupro.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveRatingRequest {
    @MetaField
    private String partyroutingprofileid;

    @MetaField
    private String ratingid;

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
}