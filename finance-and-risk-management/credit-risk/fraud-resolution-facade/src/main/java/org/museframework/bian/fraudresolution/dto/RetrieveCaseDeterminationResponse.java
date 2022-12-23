package org.museframework.bian.fraudresolution.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveCaseDeterminationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.fraudresolution.dto.bq.CaseDetermination caseDetermination;

    public void setCaseDetermination(org.museframework.bian.fraudresolution.dto.bq.CaseDetermination caseDetermination) {
        this.caseDetermination = caseDetermination;
    }

    public org.museframework.bian.fraudresolution.dto.bq.CaseDetermination getCaseDetermination() {
        return caseDetermination;
    }
}