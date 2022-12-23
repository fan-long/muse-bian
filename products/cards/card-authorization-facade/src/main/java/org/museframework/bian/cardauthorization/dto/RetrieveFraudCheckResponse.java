package org.museframework.bian.cardauthorization.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveFraudCheckResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cardauthorization.dto.bq.FraudCheck fraudCheck;

    public void setFraudCheck(org.museframework.bian.cardauthorization.dto.bq.FraudCheck fraudCheck) {
        this.fraudCheck = fraudCheck;
    }

    public org.museframework.bian.cardauthorization.dto.bq.FraudCheck getFraudCheck() {
        return fraudCheck;
    }
}