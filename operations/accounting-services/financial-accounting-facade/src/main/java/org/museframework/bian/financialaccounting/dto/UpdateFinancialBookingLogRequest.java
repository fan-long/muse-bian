package org.museframework.bian.financialaccounting.dto;

public class UpdateFinancialBookingLogRequest {
    private String financialaccountingid;

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