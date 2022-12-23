package org.museframework.bian.hedfunadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateFundPerformanceFeeRoutineResponse {
    @MetaField(ref=true)
    private org.museframework.bian.hedfunadm.dto.bq.FundPerformanceFeeRoutine fundPerformanceFeeRoutine;

    public void setFundPerformanceFeeRoutine(org.museframework.bian.hedfunadm.dto.bq.FundPerformanceFeeRoutine fundPerformanceFeeRoutine) {
        this.fundPerformanceFeeRoutine = fundPerformanceFeeRoutine;
    }

    public org.museframework.bian.hedfunadm.dto.bq.FundPerformanceFeeRoutine getFundPerformanceFeeRoutine() {
        return fundPerformanceFeeRoutine;
    }
}