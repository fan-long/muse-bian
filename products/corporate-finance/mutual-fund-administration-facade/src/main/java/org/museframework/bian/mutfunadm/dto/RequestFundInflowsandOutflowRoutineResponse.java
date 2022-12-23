package org.museframework.bian.mutfunadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestFundInflowsandOutflowRoutineResponse {
    @MetaField(ref=true)
    private org.museframework.bian.mutfunadm.dto.bq.FundInflowsandOutflowRoutine fundInflowsandOutflowRoutine;

    public void setFundInflowsandOutflowRoutine(org.museframework.bian.mutfunadm.dto.bq.FundInflowsandOutflowRoutine fundInflowsandOutflowRoutine) {
        this.fundInflowsandOutflowRoutine = fundInflowsandOutflowRoutine;
    }

    public org.museframework.bian.mutfunadm.dto.bq.FundInflowsandOutflowRoutine getFundInflowsandOutflowRoutine() {
        return fundInflowsandOutflowRoutine;
    }
}