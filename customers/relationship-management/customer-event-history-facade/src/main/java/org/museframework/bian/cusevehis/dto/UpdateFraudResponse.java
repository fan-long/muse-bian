package org.museframework.bian.cusevehis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateFraudResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cusevehis.dto.bq.Fraud fraud;

    public void setFraud(org.museframework.bian.cusevehis.dto.bq.Fraud fraud) {
        this.fraud = fraud;
    }

    public org.museframework.bian.cusevehis.dto.bq.Fraud getFraud() {
        return fraud;
    }
}