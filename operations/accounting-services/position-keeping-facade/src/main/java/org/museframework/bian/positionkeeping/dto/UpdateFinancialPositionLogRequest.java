package org.museframework.bian.positionkeeping.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateFinancialPositionLogRequest {
    @MetaField
    private String positionkeepingid;

    @MetaField(ref=true)
    private org.museframework.bian.positionkeeping.dto.cr.FinancialPositionLog financialPositionLog;

    public void setPositionkeepingid(String positionkeepingid) {
        this.positionkeepingid = positionkeepingid;
    }

    public String getPositionkeepingid() {
        return positionkeepingid;
    }

    public void setFinancialPositionLog(org.museframework.bian.positionkeeping.dto.cr.FinancialPositionLog financialPositionLog) {
        this.financialPositionLog = financialPositionLog;
    }

    public org.museframework.bian.positionkeeping.dto.cr.FinancialPositionLog getFinancialPositionLog() {
        return financialPositionLog;
    }
}