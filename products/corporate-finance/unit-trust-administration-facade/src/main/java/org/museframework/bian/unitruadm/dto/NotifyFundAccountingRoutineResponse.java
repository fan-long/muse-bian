package org.museframework.bian.unitruadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class NotifyFundAccountingRoutineResponse {
    @MetaField(ref=true)
    private org.museframework.bian.unitruadm.dto.bq.FundAccountingRoutine fundAccountingRoutine;

    public void setFundAccountingRoutine(org.museframework.bian.unitruadm.dto.bq.FundAccountingRoutine fundAccountingRoutine) {
        this.fundAccountingRoutine = fundAccountingRoutine;
    }

    public org.museframework.bian.unitruadm.dto.bq.FundAccountingRoutine getFundAccountingRoutine() {
        return fundAccountingRoutine;
    }
}