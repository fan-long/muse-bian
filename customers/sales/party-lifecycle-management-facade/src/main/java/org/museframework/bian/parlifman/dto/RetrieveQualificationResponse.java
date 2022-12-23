package org.museframework.bian.parlifman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveQualificationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.parlifman.dto.bq.Qualification qualification;

    public void setQualification(org.museframework.bian.parlifman.dto.bq.Qualification qualification) {
        this.qualification = qualification;
    }

    public org.museframework.bian.parlifman.dto.bq.Qualification getQualification() {
        return qualification;
    }
}