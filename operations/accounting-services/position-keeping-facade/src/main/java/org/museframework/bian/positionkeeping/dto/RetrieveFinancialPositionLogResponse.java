package org.museframework.bian.positionkeeping.dto;

public class RetrieveFinancialPositionLogResponse {
    private org.museframework.bian.positionkeeping.dto.cr.FinancialPositionLog financialPositionLog;

    public void setFinancialPositionLog(org.museframework.bian.positionkeeping.dto.cr.FinancialPositionLog financialPositionLog) {
        this.financialPositionLog = financialPositionLog;
    }

    public org.museframework.bian.positionkeeping.dto.cr.FinancialPositionLog getFinancialPositionLog() {
        return financialPositionLog;
    }
}