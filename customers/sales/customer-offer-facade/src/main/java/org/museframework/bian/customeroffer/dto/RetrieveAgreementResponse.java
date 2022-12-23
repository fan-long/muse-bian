package org.museframework.bian.customeroffer.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveAgreementResponse {
    @MetaField(ref=true)
    private org.museframework.bian.customeroffer.dto.bq.Agreement agreement;

    public void setAgreement(org.museframework.bian.customeroffer.dto.bq.Agreement agreement) {
        this.agreement = agreement;
    }

    public org.museframework.bian.customeroffer.dto.bq.Agreement getAgreement() {
        return agreement;
    }
}