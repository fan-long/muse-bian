package org.museframework.bian.unitruadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestFundManagementFeeRoutineResponse {
    @MetaField(ref=true)
    private org.museframework.bian.unitruadm.dto.bq.FundManagementFeeRoutine fundManagementFeeRoutine;

    public void setFundManagementFeeRoutine(org.museframework.bian.unitruadm.dto.bq.FundManagementFeeRoutine fundManagementFeeRoutine) {
        this.fundManagementFeeRoutine = fundManagementFeeRoutine;
    }

    public org.museframework.bian.unitruadm.dto.bq.FundManagementFeeRoutine getFundManagementFeeRoutine() {
        return fundManagementFeeRoutine;
    }
}