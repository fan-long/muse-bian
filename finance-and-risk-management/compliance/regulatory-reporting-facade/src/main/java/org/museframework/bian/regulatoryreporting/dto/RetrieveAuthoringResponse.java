package org.museframework.bian.regulatoryreporting.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveAuthoringResponse {
    @MetaField(ref=true)
    private org.museframework.bian.regulatoryreporting.dto.bq.Authoring authoring;

    public void setAuthoring(org.museframework.bian.regulatoryreporting.dto.bq.Authoring authoring) {
        this.authoring = authoring;
    }

    public org.museframework.bian.regulatoryreporting.dto.bq.Authoring getAuthoring() {
        return authoring;
    }
}