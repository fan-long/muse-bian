package org.museframework.bian.unitruadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateFundInvestor_MiddleandBackOfficeServiceRoutineResponse {
    @MetaField(ref=true)
    private org.museframework.bian.unitruadm.dto.bq.FundInvestor_MiddleandBackOfficeServiceRoutine fundInvestor_MiddleandBackOfficeServiceRoutine;

    public void setFundInvestor_MiddleandBackOfficeServiceRoutine(org.museframework.bian.unitruadm.dto.bq.FundInvestor_MiddleandBackOfficeServiceRoutine fundInvestor_MiddleandBackOfficeServiceRoutine) {
        this.fundInvestor_MiddleandBackOfficeServiceRoutine = fundInvestor_MiddleandBackOfficeServiceRoutine;
    }

    public org.museframework.bian.unitruadm.dto.bq.FundInvestor_MiddleandBackOfficeServiceRoutine getFundInvestor_MiddleandBackOfficeServiceRoutine() {
        return fundInvestor_MiddleandBackOfficeServiceRoutine;
    }
}