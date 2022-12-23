package org.museframework.bian.leaiteadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateAssuranceResponse {
    @MetaField(ref=true)
    private org.museframework.bian.leaiteadm.dto.bq.Assurance assurance;

    public void setAssurance(org.museframework.bian.leaiteadm.dto.bq.Assurance assurance) {
        this.assurance = assurance;
    }

    public org.museframework.bian.leaiteadm.dto.bq.Assurance getAssurance() {
        return assurance;
    }
}