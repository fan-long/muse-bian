package org.museframework.bian.parlifman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrievePrecedentsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.parlifman.dto.bq.Precedents precedents;

    public void setPrecedents(org.museframework.bian.parlifman.dto.bq.Precedents precedents) {
        this.precedents = precedents;
    }

    public org.museframework.bian.parlifman.dto.bq.Precedents getPrecedents() {
        return precedents;
    }
}