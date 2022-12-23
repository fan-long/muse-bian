package org.museframework.bian.hedfunadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class GrantFundManagementRoutineResponse {
    @MetaField(ref=true)
    private org.museframework.bian.hedfunadm.dto.bq.FundManagementRoutine fundManagementRoutine;

    public void setFundManagementRoutine(org.museframework.bian.hedfunadm.dto.bq.FundManagementRoutine fundManagementRoutine) {
        this.fundManagementRoutine = fundManagementRoutine;
    }

    public org.museframework.bian.hedfunadm.dto.bq.FundManagementRoutine getFundManagementRoutine() {
        return fundManagementRoutine;
    }
}