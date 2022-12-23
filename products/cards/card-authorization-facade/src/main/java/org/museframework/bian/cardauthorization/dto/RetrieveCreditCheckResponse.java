package org.museframework.bian.cardauthorization.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveCreditCheckResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cardauthorization.dto.bq.CreditCheck creditCheck;

    public void setCreditCheck(org.museframework.bian.cardauthorization.dto.bq.CreditCheck creditCheck) {
        this.creditCheck = creditCheck;
    }

    public org.museframework.bian.cardauthorization.dto.bq.CreditCheck getCreditCheck() {
        return creditCheck;
    }
}