package org.museframework.bian.merchantrelations.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestLegalTermResponse {
    @MetaField(ref=true)
    private org.museframework.bian.merchantrelations.dto.bq.LegalTerm legalTerm;

    public void setLegalTerm(org.museframework.bian.merchantrelations.dto.bq.LegalTerm legalTerm) {
        this.legalTerm = legalTerm;
    }

    public org.museframework.bian.merchantrelations.dto.bq.LegalTerm getLegalTerm() {
        return legalTerm;
    }
}