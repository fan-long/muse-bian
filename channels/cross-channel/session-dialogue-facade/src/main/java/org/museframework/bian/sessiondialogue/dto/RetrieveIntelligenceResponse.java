package org.museframework.bian.sessiondialogue.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveIntelligenceResponse {
    @MetaField(ref=true)
    private org.museframework.bian.sessiondialogue.dto.bq.Intelligence intelligence;

    public void setIntelligence(org.museframework.bian.sessiondialogue.dto.bq.Intelligence intelligence) {
        this.intelligence = intelligence;
    }

    public org.museframework.bian.sessiondialogue.dto.bq.Intelligence getIntelligence() {
        return intelligence;
    }
}