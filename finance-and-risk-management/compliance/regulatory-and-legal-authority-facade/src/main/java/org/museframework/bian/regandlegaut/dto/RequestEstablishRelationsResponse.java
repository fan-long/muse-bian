package org.museframework.bian.regandlegaut.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestEstablishRelationsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.regandlegaut.dto.bq.EstablishRelations establishRelations;

    public void setEstablishRelations(org.museframework.bian.regandlegaut.dto.bq.EstablishRelations establishRelations) {
        this.establishRelations = establishRelations;
    }

    public org.museframework.bian.regandlegaut.dto.bq.EstablishRelations getEstablishRelations() {
        return establishRelations;
    }
}