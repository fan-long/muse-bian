package org.museframework.bian.commissionagreement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeCommissionTermsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.commissionagreement.dto.bq.CommissionTerms commissionTerms;

    public void setCommissionTerms(org.museframework.bian.commissionagreement.dto.bq.CommissionTerms commissionTerms) {
        this.commissionTerms = commissionTerms;
    }

    public org.museframework.bian.commissionagreement.dto.bq.CommissionTerms getCommissionTerms() {
        return commissionTerms;
    }
}