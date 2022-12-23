package org.museframework.bian.mardatswiope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateInternalPublicationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.mardatswiope.dto.bq.InternalPublication internalPublication;

    public void setInternalPublication(org.museframework.bian.mardatswiope.dto.bq.InternalPublication internalPublication) {
        this.internalPublication = internalPublication;
    }

    public org.museframework.bian.mardatswiope.dto.bq.InternalPublication getInternalPublication() {
        return internalPublication;
    }
}