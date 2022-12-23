package org.museframework.bian.financialaccounting.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateFinancialBookingLogRequest {
    @MetaField
    private String financialaccountingid;

    @MetaField(ref=true)
    private org.museframework.bian.financialaccounting.dto.cr.FinancialBookingLog financialBookingLog;

    public void setFinancialaccountingid(String financialaccountingid) {
        this.financialaccountingid = financialaccountingid;
    }

    public String getFinancialaccountingid() {
        return financialaccountingid;
    }

    public void setFinancialBookingLog(org.museframework.bian.financialaccounting.dto.cr.FinancialBookingLog financialBookingLog) {
        this.financialBookingLog = financialBookingLog;
    }

    public org.museframework.bian.financialaccounting.dto.cr.FinancialBookingLog getFinancialBookingLog() {
        return financialBookingLog;
    }
}