package org.museframework.bian.hedfunadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateFundDevelopmentRoutineResponse {
    @MetaField(ref=true)
    private org.museframework.bian.hedfunadm.dto.bq.FundDevelopmentRoutine fundDevelopmentRoutine;

    public void setFundDevelopmentRoutine(org.museframework.bian.hedfunadm.dto.bq.FundDevelopmentRoutine fundDevelopmentRoutine) {
        this.fundDevelopmentRoutine = fundDevelopmentRoutine;
    }

    public org.museframework.bian.hedfunadm.dto.bq.FundDevelopmentRoutine getFundDevelopmentRoutine() {
        return fundDevelopmentRoutine;
    }
}