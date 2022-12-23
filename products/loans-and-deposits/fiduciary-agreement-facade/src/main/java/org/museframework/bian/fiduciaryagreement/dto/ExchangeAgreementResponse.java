package org.museframework.bian.fiduciaryagreement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeAgreementResponse {
    @MetaField(ref=true)
    private org.museframework.bian.fiduciaryagreement.dto.bq.Agreement agreement;

    public void setAgreement(org.museframework.bian.fiduciaryagreement.dto.bq.Agreement agreement) {
        this.agreement = agreement;
    }

    public org.museframework.bian.fiduciaryagreement.dto.bq.Agreement getAgreement() {
        return agreement;
    }
}