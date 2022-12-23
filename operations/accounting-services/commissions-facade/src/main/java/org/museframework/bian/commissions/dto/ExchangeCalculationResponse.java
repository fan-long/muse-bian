package org.museframework.bian.commissions.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeCalculationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.commissions.dto.bq.Calculation calculation;

    public void setCalculation(org.museframework.bian.commissions.dto.bq.Calculation calculation) {
        this.calculation = calculation;
    }

    public org.museframework.bian.commissions.dto.bq.Calculation getCalculation() {
        return calculation;
    }
}