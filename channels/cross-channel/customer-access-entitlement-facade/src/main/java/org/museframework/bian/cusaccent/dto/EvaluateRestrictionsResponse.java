package org.museframework.bian.cusaccent.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class EvaluateRestrictionsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cusaccent.dto.bq.Restrictions restrictions;

    public void setRestrictions(org.museframework.bian.cusaccent.dto.bq.Restrictions restrictions) {
        this.restrictions = restrictions;
    }

    public org.museframework.bian.cusaccent.dto.bq.Restrictions getRestrictions() {
        return restrictions;
    }
}