package org.museframework.bian.proserage.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateLegalTermResponse {
    @MetaField(ref=true)
    private org.museframework.bian.proserage.dto.bq.LegalTerm legalTerm;

    public void setLegalTerm(org.museframework.bian.proserage.dto.bq.LegalTerm legalTerm) {
        this.legalTerm = legalTerm;
    }

    public org.museframework.bian.proserage.dto.bq.LegalTerm getLegalTerm() {
        return legalTerm;
    }
}