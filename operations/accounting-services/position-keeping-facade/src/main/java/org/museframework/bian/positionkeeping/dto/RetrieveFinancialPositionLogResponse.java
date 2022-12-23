package org.museframework.bian.positionkeeping.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveFinancialPositionLogResponse {
    @MetaField(ref=true)
    private org.museframework.bian.positionkeeping.dto.cr.FinancialPositionLog financialPositionLog;

    public void setFinancialPositionLog(org.museframework.bian.positionkeeping.dto.cr.FinancialPositionLog financialPositionLog) {
        this.financialPositionLog = financialPositionLog;
    }

    public org.museframework.bian.positionkeeping.dto.cr.FinancialPositionLog getFinancialPositionLog() {
        return financialPositionLog;
    }
}