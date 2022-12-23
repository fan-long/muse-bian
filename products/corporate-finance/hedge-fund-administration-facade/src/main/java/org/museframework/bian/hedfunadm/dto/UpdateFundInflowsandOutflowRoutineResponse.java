package org.museframework.bian.hedfunadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateFundInflowsandOutflowRoutineResponse {
    @MetaField(ref=true)
    private org.museframework.bian.hedfunadm.dto.bq.FundInflowsandOutflowRoutine fundInflowsandOutflowRoutine;

    public void setFundInflowsandOutflowRoutine(org.museframework.bian.hedfunadm.dto.bq.FundInflowsandOutflowRoutine fundInflowsandOutflowRoutine) {
        this.fundInflowsandOutflowRoutine = fundInflowsandOutflowRoutine;
    }

    public org.museframework.bian.hedfunadm.dto.bq.FundInflowsandOutflowRoutine getFundInflowsandOutflowRoutine() {
        return fundInflowsandOutflowRoutine;
    }
}