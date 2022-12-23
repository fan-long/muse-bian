package org.museframework.bian.legentdir.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveReferenceResponse {
    @MetaField(ref=true)
    private org.museframework.bian.legentdir.dto.bq.Reference reference;

    public void setReference(org.museframework.bian.legentdir.dto.bq.Reference reference) {
        this.reference = reference;
    }

    public org.museframework.bian.legentdir.dto.bq.Reference getReference() {
        return reference;
    }
}