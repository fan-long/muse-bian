package org.museframework.bian.rewpoiawaandred.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateAwardResponse {
    @MetaField(ref=true)
    private org.museframework.bian.rewpoiawaandred.dto.bq.Award award;

    public void setAward(org.museframework.bian.rewpoiawaandred.dto.bq.Award award) {
        this.award = award;
    }

    public org.museframework.bian.rewpoiawaandred.dto.bq.Award getAward() {
        return award;
    }
}