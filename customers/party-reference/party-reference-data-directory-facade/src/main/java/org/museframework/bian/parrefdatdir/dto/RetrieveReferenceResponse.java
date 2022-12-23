package org.museframework.bian.parrefdatdir.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveReferenceResponse {
    @MetaField(ref=true)
    private org.museframework.bian.parrefdatdir.dto.bq.Reference reference;

    public void setReference(org.museframework.bian.parrefdatdir.dto.bq.Reference reference) {
        this.reference = reference;
    }

    public org.museframework.bian.parrefdatdir.dto.bq.Reference getReference() {
        return reference;
    }
}