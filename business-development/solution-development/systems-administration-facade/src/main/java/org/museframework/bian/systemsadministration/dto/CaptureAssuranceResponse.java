package org.museframework.bian.systemsadministration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CaptureAssuranceResponse {
    @MetaField(ref=true)
    private org.museframework.bian.systemsadministration.dto.bq.Assurance assurance;

    public void setAssurance(org.museframework.bian.systemsadministration.dto.bq.Assurance assurance) {
        this.assurance = assurance;
    }

    public org.museframework.bian.systemsadministration.dto.bq.Assurance getAssurance() {
        return assurance;
    }
}