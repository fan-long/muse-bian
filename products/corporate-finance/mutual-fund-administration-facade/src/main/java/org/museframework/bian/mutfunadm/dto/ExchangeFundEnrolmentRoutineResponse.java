package org.museframework.bian.mutfunadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeFundEnrolmentRoutineResponse {
    @MetaField(ref=true)
    private org.museframework.bian.mutfunadm.dto.bq.FundEnrolmentRoutine fundEnrolmentRoutine;

    public void setFundEnrolmentRoutine(org.museframework.bian.mutfunadm.dto.bq.FundEnrolmentRoutine fundEnrolmentRoutine) {
        this.fundEnrolmentRoutine = fundEnrolmentRoutine;
    }

    public org.museframework.bian.mutfunadm.dto.bq.FundEnrolmentRoutine getFundEnrolmentRoutine() {
        return fundEnrolmentRoutine;
    }
}