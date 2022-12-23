package org.museframework.bian.conandsupagr.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeLegalTermResponse {
    @MetaField(ref=true)
    private org.museframework.bian.conandsupagr.dto.bq.LegalTerm legalTerm;

    public void setLegalTerm(org.museframework.bian.conandsupagr.dto.bq.LegalTerm legalTerm) {
        this.legalTerm = legalTerm;
    }

    public org.museframework.bian.conandsupagr.dto.bq.LegalTerm getLegalTerm() {
        return legalTerm;
    }
}