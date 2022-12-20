package org.museframework.bian.financialaccounting.dto;

public class InitiateFinancialBookingLogResponse {
    private org.museframework.bian.financialaccounting.dto.cr.FinancialBookingLog financialBookingLog;

    public void setFinancialBookingLog(org.museframework.bian.financialaccounting.dto.cr.FinancialBookingLog financialBookingLog) {
        this.financialBookingLog = financialBookingLog;
    }

    public org.museframework.bian.financialaccounting.dto.cr.FinancialBookingLog getFinancialBookingLog() {
        return financialBookingLog;
    }
}