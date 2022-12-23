package org.museframework.bian.financialaccounting.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateFinancialBookingLogResponse {
    @MetaField(ref=true)
    private org.museframework.bian.financialaccounting.dto.cr.FinancialBookingLog financialBookingLog;

    public void setFinancialBookingLog(org.museframework.bian.financialaccounting.dto.cr.FinancialBookingLog financialBookingLog) {
        this.financialBookingLog = financialBookingLog;
    }

    public org.museframework.bian.financialaccounting.dto.cr.FinancialBookingLog getFinancialBookingLog() {
        return financialBookingLog;
    }
}