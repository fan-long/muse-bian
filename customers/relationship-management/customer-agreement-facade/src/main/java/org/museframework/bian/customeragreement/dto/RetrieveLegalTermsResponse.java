package org.museframework.bian.customeragreement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveLegalTermsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.customeragreement.dto.bq.LegalTerms legalTerms;

    public void setLegalTerms(org.museframework.bian.customeragreement.dto.bq.LegalTerms legalTerms) {
        this.legalTerms = legalTerms;
    }

    public org.museframework.bian.customeragreement.dto.bq.LegalTerms getLegalTerms() {
        return legalTerms;
    }
}