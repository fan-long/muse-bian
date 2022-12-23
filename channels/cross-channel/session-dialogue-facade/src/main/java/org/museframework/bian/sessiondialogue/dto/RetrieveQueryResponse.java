package org.museframework.bian.sessiondialogue.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveQueryResponse {
    @MetaField(ref=true)
    private org.museframework.bian.sessiondialogue.dto.bq.Query query;

    public void setQuery(org.museframework.bian.sessiondialogue.dto.bq.Query query) {
        this.query = query;
    }

    public org.museframework.bian.sessiondialogue.dto.bq.Query getQuery() {
        return query;
    }
}