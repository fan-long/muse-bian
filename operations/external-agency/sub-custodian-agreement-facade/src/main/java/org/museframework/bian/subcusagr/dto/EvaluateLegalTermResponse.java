package org.museframework.bian.subcusagr.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class EvaluateLegalTermResponse {
    @MetaField(ref=true)
    private org.museframework.bian.subcusagr.dto.bq.LegalTerm legalTerm;

    public void setLegalTerm(org.museframework.bian.subcusagr.dto.bq.LegalTerm legalTerm) {
        this.legalTerm = legalTerm;
    }

    public org.museframework.bian.subcusagr.dto.bq.LegalTerm getLegalTerm() {
        return legalTerm;
    }
}