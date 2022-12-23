package org.museframework.bian.positionmanagement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestFinancialPositionStateRequest {
    @MetaField
    private String positionmanagementid;

    @MetaField(ref=true)
    private org.museframework.bian.positionmanagement.dto.cr.FinancialPositionState financialPositionState;

    public void setPositionmanagementid(String positionmanagementid) {
        this.positionmanagementid = positionmanagementid;
    }

    public String getPositionmanagementid() {
        return positionmanagementid;
    }

    public void setFinancialPositionState(org.museframework.bian.positionmanagement.dto.cr.FinancialPositionState financialPositionState) {
        this.financialPositionState = financialPositionState;
    }

    public org.museframework.bian.positionmanagement.dto.cr.FinancialPositionState getFinancialPositionState() {
        return financialPositionState;
    }
}