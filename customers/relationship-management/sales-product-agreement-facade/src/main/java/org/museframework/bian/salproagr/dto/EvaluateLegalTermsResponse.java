package org.museframework.bian.salproagr.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class EvaluateLegalTermsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.salproagr.dto.bq.LegalTerms legalTerms;

    public void setLegalTerms(org.museframework.bian.salproagr.dto.bq.LegalTerms legalTerms) {
        this.legalTerms = legalTerms;
    }

    public org.museframework.bian.salproagr.dto.bq.LegalTerms getLegalTerms() {
        return legalTerms;
    }
}