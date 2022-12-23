package org.museframework.bian.mutfunadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeFundDevelopmentRoutineResponse {
    @MetaField(ref=true)
    private org.museframework.bian.mutfunadm.dto.bq.FundDevelopmentRoutine fundDevelopmentRoutine;

    public void setFundDevelopmentRoutine(org.museframework.bian.mutfunadm.dto.bq.FundDevelopmentRoutine fundDevelopmentRoutine) {
        this.fundDevelopmentRoutine = fundDevelopmentRoutine;
    }

    public org.museframework.bian.mutfunadm.dto.bq.FundDevelopmentRoutine getFundDevelopmentRoutine() {
        return fundDevelopmentRoutine;
    }
}