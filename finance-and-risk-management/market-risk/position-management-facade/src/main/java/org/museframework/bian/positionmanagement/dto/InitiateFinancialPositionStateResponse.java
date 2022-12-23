package org.museframework.bian.positionmanagement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateFinancialPositionStateResponse {
    @MetaField(ref=true)
    private org.museframework.bian.positionmanagement.dto.cr.FinancialPositionState financialPositionState;

    public void setFinancialPositionState(org.museframework.bian.positionmanagement.dto.cr.FinancialPositionState financialPositionState) {
        this.financialPositionState = financialPositionState;
    }

    public org.museframework.bian.positionmanagement.dto.cr.FinancialPositionState getFinancialPositionState() {
        return financialPositionState;
    }
}