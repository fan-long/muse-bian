package org.museframework.bian.parrefdatdir.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateDemographicsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.parrefdatdir.dto.bq.Demographics demographics;

    public void setDemographics(org.museframework.bian.parrefdatdir.dto.bq.Demographics demographics) {
        this.demographics = demographics;
    }

    public org.museframework.bian.parrefdatdir.dto.bq.Demographics getDemographics() {
        return demographics;
    }
}